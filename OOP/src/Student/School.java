package Student;

import java.util.Vector;

public class School {
	
	Vector <student> school  ;
	
	public School() {
		school = new Vector<Student.student>();
	}
	public void addStudent(student st) {
		if(st.AGE>10) {
			school.addElement(st);
		}
	}
	public void removeStudent(student st) {
		for (int i = 0; i < school.size(); i++) {
			if(school.elementAt(i)==st)
				school.removeElementAt(i);
		}
	}
	public void  allStudents() {
		for (student student : school) {
			System.out.println(student.toString());
		}
	}
	public int SchoolCapacity() {
		return school.size();
	}
	


}
