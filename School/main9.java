/* Write a Java program to create a class called "School" with attributes for students, teachers, 
 * and classes, and methods to add and remove students and teachers, and to create classes. */

import java.util.*;
public class main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School school = new School();
		 Student1 std1 = new Student1("Anil",22);
		 Student1 std2 = new Student1("Kavya",23);
		 Student1 std3 = new Student1("Sandhya",19);
		 Student1 std4 = new Student1("Ramya",21);
		 Student1 std5 = new Student1("Indira",22);
		 Student1 std6 = new Student1("Ajay",22);
		 Student1 std7 = new Student1("Sai Kumar",23);
		
		school.addStudent(std1);
		school.addStudent(std2);
		school.addStudent(std3);
		school.addStudent(std4);
		school.addStudent(std5);
		school.addStudent(std6);
		school.addStudent(std7);
	
		
		 Teacher th1 = new Teacher("Ramesh","Maths");
		 Teacher th2 = new Teacher("Srinivas","Telugu");
		 Teacher th3 = new Teacher("Srikanth","Social Studies");
		 
		 school.addTeacher(th1);
		 school.addTeacher(th2);
		 school.addTeacher(th3);
		 
		 SchoolClass mathClass = new SchoolClass("Maths",th1);
		 SchoolClass teluguClass = new SchoolClass("Telugu",th2);
		 SchoolClass socialClass = new SchoolClass("Social Studies",th3);
		 
		 mathClass.addStudent(std2);
		 mathClass.addStudent(std3);
		 mathClass.addStudent(std6);
		 
		 teluguClass.addStudent(std6);
		 teluguClass.addStudent(std4);
		 teluguClass.addStudent(std1);
		 teluguClass.addStudent(std3);
		 teluguClass.addStudent(std7);
		 
		 socialClass.addStudent(std5);
		 socialClass.addStudent(std4);
		 
		 school.addClasses(socialClass);
		 school.addClasses(teluguClass);
		 school.addClasses(mathClass);
		 
		 
		 
		 System.out.println("School Information ");
		 System.out.println("No. of Students : "+school.getStudents().size());
		 System.out.println("No of Teachers : "+school.getTeacher().size());
		 System.out.println("No of Classes : "+school.getClasses().size());
		 
		 System.out.println("\nMath Class Information");
		 System.out.println("class Name "+mathClass.getClassName());
		 System.out.println("Teacher  "+mathClass.getTeacher().getName());
		 System.out.println("No of Students enrolled : "+mathClass.getStudents().size());
		 
		 System.out.println("\nTelugu Class Information");
		 System.out.println("Class Name "+teluguClass.getClassName());
		 System.out.println("Teacher  "+teluguClass.getTeacher().getName());
		 System.out.println("No of Students "+teluguClass.getStudents().size());
		 
		 System.out.println("\nSocial class information");
		 System.out.println("Class Name "+socialClass.getClassName());
		 System.out.println("Teacher "+socialClass.getTeacher().getName());
		 System.out.println("No of Students "+socialClass.getStudents().size());
		 
		 System.out.println("\nStudents List");
		 school.getStudentsList();
		 
		 System.out.println("\nTeachers List");
		 school.getTeacherList();
		 
		 school.removeStudent(std2);
		 school.removeTeacher(th2);
		 school.removeClasses(teluguClass);
		 
		 System.out.println("\nAfter removing 1 student and 1 teacher and 1 class ");
		 System.out.println("No. of Students "+school.getStudents().size());
		 System.out.println("No of Teachers "+school.getTeacher().size());
		 System.out.println("No fo classes "+school.getClasses().size());
		 
		 System.out.println("\nStudents List");
		 school.getStudentsList();
		 
		 System.out.println("\nTeachers List");
		 school.getTeacherList();
	
	}

}
