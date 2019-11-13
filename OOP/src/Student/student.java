package Student;

public class student {

	String NAME ;
	int AGE;
	
	
	public student(String name,int age) {
		this.NAME = name;
		this.AGE = age;
	}
	
	public String getNAME() {
		return NAME;
	}

	public int getAGE() {
		return AGE;
	}

	public String toString() {
		return "student NAME =" + NAME + ", AGE=" + AGE ;
	}
	
	

}
