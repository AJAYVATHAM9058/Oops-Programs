import java.util.ArrayList;

public class SchoolClass {

	private String className;
	private Teacher teacher;
	private ArrayList<Student1> students;
	
	public SchoolClass(String className,Teacher teacher) {
		this.className = className;
		this.teacher = teacher;
		this.students = new ArrayList<Student1>();
	}
	
	public void setClassName(String  className) {
		this.className = className;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public String getClassName() {
		return className;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	
	public ArrayList<Student1> getStudents(){
		return students;
	}
	public void addStudent(Student1 student) {
		students.add(student);
	}
	public void removeStudent(Student1 student) {
		students.remove(student);
	}
	
}
