import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class Secretariat {

	private List<Student> studentList;
	private List<Lesson> lessonList;
	
	public Secretariat(){
		studentList = new ArrayList<Student>();
		lessonList = new ArrayList<Lesson>();
	}

	public void addStudent(Student student) {
		studentList.add(student);
	}

	public void addLesson(Lesson lesson) {
		lessonList.add(lesson);
	}
	
	public Student getStudentWithID(int id){
		for(Student stud : studentList){
			if(stud.getId() == id) {
				return stud;
			}
		}
		return null;
	}

	public List<Student> getStudentList() {
		return studentList;
	}
	
	public Student[] getStudentsInArray(){
		return studentList.toArray(new Student[1]);
	}
	
	public Lesson[] getLessonInArray(){
		return lessonList.toArray(new Lesson[1]);
	}
	               
	               
	               
	               
	               
	               
	               
	               
	
	
	
	
	
}
