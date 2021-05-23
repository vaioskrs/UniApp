import java.util.Comparator;


public class StudentComparator implements Comparator<Student>{

	public int compare(Student s0, Student s1) {
		if(s0.getAverageGrade() < s1.getAverageGrade())
			return 1;
		else
			return -1;
	}

}
