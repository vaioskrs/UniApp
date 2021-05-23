import java.util.HashMap;
import java.util.Map;


public class Student {
	
	private int id;
	private String name;
	private Map<Lesson, Double> lessonGrades;
	
	public Student(int id, String name){
		this.id = id;
		this.name = name;
		lessonGrades = new HashMap<Lesson, Double>();
	}
	
	public void putGradeInLesson(Lesson aLesson, double aGrade){
		lessonGrades.put(aLesson, aGrade);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Map<Lesson, Double> getLessonGrades() {
		return lessonGrades;
	}
	
	public double getAverageGrade(){
		double sum = 0;
		for(Lesson les : lessonGrades.keySet()){
			double grade = lessonGrades.get(les);
			sum += grade;
		}
		int size = lessonGrades.keySet().size();
		if(size ==0 )
			return 0;
		else
			return sum / size;
	}

	public String toString(){
		return id+" "+name+" "+getAverageGrade();
	}
	
}
