
public class Lesson {
	
	private String name;
	
	public Lesson(String name){
		this.name = name;
	}
	
	public int hashCode(){
		return name.hashCode();
	}

	public String toString(){
		return name;
	}
}
