package Student;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		School amit= new School();
		student a= new student("nathan", 10);
		student a1= new student("yael", 21);
		student a2= new student("dan", 21);
		student a3= new student("jojo", 8);
		student a4= new student("shani", 14);
		
		amit.addStudent(a);
		amit.addStudent(a1);
		amit.addStudent(a2);
		amit.addStudent(a3);
		amit.addStudent(a4);
		
		amit.allStudents();
		System.out.println(amit.SchoolCapacity());
		amit.removeStudent(a4);
		amit.allStudents();
	}

}
