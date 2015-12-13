package realExample;

import java.util.ArrayList;

public class Class {
	private ArrayList<Student> studentList;
	
	Class(ArrayList<Student> studentList){
		this.studentList = studentList;
	
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
}
