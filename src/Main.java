
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Secretariat secr = new Secretariat();
		secr.addStudent(new Student(11,"Teo Haik"));
		secr.addStudent(new Student(22,"Babis Stergiou"));
		secr.addStudent(new Student(33,"Petros Petrakis"));
		secr.addStudent(new Student(44,"Giannis Ioannou"));
		secr.addStudent(new Student(55,"Tasos Karatasos"));
		secr.addStudent(new Student(66,"Teo Hatzikostis"));
		secr.addStudent(new Student(77,"Iordanis Ntanis"));
		secr.addStudent(new Student(88,"Ilias Zafeiriou"));
		
		secr.addLesson(new Lesson("Java"));
		secr.addLesson(new Lesson("C++"));
		secr.addLesson(new Lesson("Databases I"));
		secr.addLesson(new Lesson("Databases II"));
		secr.addLesson(new Lesson("Software Engineering"));

		new MyFrame(secr);
	}

}
