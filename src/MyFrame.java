import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.List;

import javax.swing.*;


public class MyFrame extends JFrame {
	
	private JTextField idField;
	private JComboBox gradeChooser;
	private JComboBox lessonBox;
	private JList topStudentList;
	private Secretariat secretary;
	
	public MyFrame(Secretariat secretary){
		super("Student Management System");
		this.secretary = secretary;
		idField = new JTextField(5);
		topStudentList = new JList();
		initiatePanels();
	}

	private void initiatePanels() {
		JPanel panel1, panel2, panel3, panel4, mainPanel;
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		mainPanel = new JPanel();

		createComboBoxes();
		
		panel1.add(new JLabel("Student ID:"));
		panel1.add(idField);
		panel2.add(new JLabel("Select Lesson:"));
		panel2.add(lessonBox);
		panel3.add(new JLabel("GRADE"));
		panel3.add(gradeChooser);
		panel4.add(new JLabel("Top Overall Students:"));
		topStudentList.setSize(80, 60);
		panel4.add(topStudentList);
		
		mainPanel.add(panel1);
		mainPanel.add(panel2);
		mainPanel.add(panel3);
		mainPanel.add(panel4);
		
		this.setContentPane(mainPanel);
		this.setVisible(true);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void createComboBoxes() {
		Double[] grades = new Double[11];
		for(int i=0; i<=10; i++){
			grades[i] = new Double(i);
		}
		gradeChooser = new JComboBox(grades);
		idField = new JTextField(4);
		lessonBox = new JComboBox(secretary.getLessonInArray());
		topStudentList = new JList();
		topStudentList.setListData(secretary.getStudentsInArray());
		gradeChooser.addActionListener(new GradeListener(this));
	}
	
	private class GradeListener implements ActionListener{
		
		JFrame myFrame;
		
		GradeListener(JFrame aFrame){
			myFrame = aFrame;
		}
		
		public void actionPerformed(ActionEvent e) {
			double grade = (Double)gradeChooser.getSelectedItem();
			Lesson selectedLesson = (Lesson)lessonBox.getSelectedItem();
			int id = Integer.parseInt(idField.getText());
			Student student = secretary.getStudentWithID(id);
			if(student != null){
				student.putGradeInLesson(selectedLesson, grade);
				Collections.sort(secretary.getStudentList(), new StudentComparator());
				topStudentList.setListData(secretary.getStudentsInArray());
				topStudentList.repaint();
				idField.setText("");
				myFrame.setSize(800, 800);
			}
		}
	}		
}
