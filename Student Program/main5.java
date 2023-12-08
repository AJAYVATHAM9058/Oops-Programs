/*  Write a Java program to create a class called "Student" with a name, grade,
 *  and courses attributes, and methods to add and remove courses. */
import java.util.ArrayList;

public class main5 {

	public static void main(String args[]) {
		
		Student std1 = new Student("Navya",'A');
		Student std2 = new Student("SaiPriya",'B');
		Student std3 = new Student("Ajay",'O');
		ArrayList<String> courses = new ArrayList<>();
		std1.addCourse("Science");
		std1.addCourse("Mathematics");
		std2.addCourse("Telugu");
		std2.addCourse("Hindi");
		std1.addCourse("English");
		std1.addCourse("Literature");
		std2.addCourse("Social");
		std3.addCourse("Computer Science");
		std3.addCourse("Java Programming");
		std3.addCourse("DataBase Management");
		std1.printStudentDetails();
		std2.printStudentDetails();
		
		System.out.println(std1.getName()+"  Courses "+std1.getCouses());
		System.out.println(std2.getName()+" Courses "+std2.getCouses());
		System.out.println(std3.getName()+" courses "+std3.getCouses());
	}
}
