package realExample;

import java.util.ArrayList;

public class MathsClass {
	public static void main(String[] args){
		ArrayList<Student> allSttudentsList = new ArrayList<Student>();
		Student s1 = new Student("Jebin", 28, 'A');
		allSttudentsList.add(s1);
		Student s2 = new Student("John", 42, 'B');
		allSttudentsList.add(s2);
		Student s3 = new Student("Jaison", 25, 'B');
		allSttudentsList.add(s3);
		Student s4 = new Student("Jaimee", 30, 'B');
		allSttudentsList.add(s4);
		Student s5 = new Student("Jose", 60, 'C');
		allSttudentsList.add(s5);
		
		Class mathsClass = new Class(allSttudentsList);
		
		ArrayList<Student> modifiedList = mathsClass.getStudentList();
		Student s6 = new Student("Anu", 26, 'A');
		modifiedList.add(s6);
		mathsClass.setStudentList(modifiedList);
		
		
		for(Student student : mathsClass.getStudentList()){
			System.out.print(student.getName() + ":");
			System.out.println(student.getAge());
			
		}
	}
}
