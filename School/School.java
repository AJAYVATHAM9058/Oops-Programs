import java.util.ArrayList;

public class School {

	private ArrayList<Student1> students;
	private ArrayList<Teacher> teachers;
	private ArrayList<SchoolClass> classes;
	
	public School() {
		students = new ArrayList<Student1>();
		teachers = new ArrayList<Teacher>();
		classes = new ArrayList<SchoolClass>();
	}
	
	public void addStudent(Student1 student) {
		students.add(student);
	}
	public void removeStudent(Student1 student) {
		students.remove(student);
	}
	
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}
	
	public void removeTeacher(Teacher teacher) {
		teachers.remove(teacher);
	}
	
	public void addClasses(SchoolClass class1) {
		classes.add(class1);
	}
	public void removeClasses(SchoolClass class1) {
		classes.remove(class1);
	}
	
	public ArrayList<Student1> getStudents(){
		return students;
	}
	
	public ArrayList<Teacher> getTeacher(){
		return teachers;
	}
	
	public ArrayList<SchoolClass> getClasses(){
		return classes;
	}
	
	public void getTeacherList() {
		 for(Teacher tr : teachers) {
			 System.out.println(tr.getName()+"  |  "+tr.getSubject());
		 }
	}
	
	public void getStudentsList() {
		 for(Student1 arr:students) {
			 System.out.println(arr.getname()+" |  "+arr.getAge());
		 }
	}
	
	public void getClassesList() {
		for(SchoolClass ar: classes) {
			System.out.println(ar.getClassName()+"  |  "+ar.getStudents().size()+"  | "+ar.getTeacher().getName());
		}
	}
	
}
