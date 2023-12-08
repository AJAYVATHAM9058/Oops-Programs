import java.util.ArrayList;

public class Student {

	private String name;
	private char grade;
	private ArrayList<String> courses;
	
	public Student(String name,char grade) {
		this.name = name;
		this.grade = grade;
		this.courses = new ArrayList<String>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public char getGrade() {
		return grade;
	}
	public void setGrade() {
		this.grade = grade;
	}
	
	public void addCourse(String course) {
		courses.add(course);
	}
	
	public void removeCourse(String course) {
		courses.remove(course);
	}
	
	public void printStudentDetails() {
		System.out.println("Name : "+name);
		System.out.println("Grade : "+grade);
	}
	
	public ArrayList<String> getCouses(){
		return courses;
	}
	
	
}
