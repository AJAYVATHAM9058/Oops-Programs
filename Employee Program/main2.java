//Write a Java program to create a class called "Employee" 
//with a name, job title, and salary attributes, and methods to calculate and update salary.
import java.time.LocalDate;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Ajay","Software Developer",45000,LocalDate.parse("2010-05-25"));
		Employee emp2 = new Employee("Anil","Data Scientist",36000,LocalDate.parse("2020-02-15"));
		
		
		System.out.println("Employee details : ");
		emp1.printEmpDetails();
		System.out.println("\nEmployee Details : ");
		emp2.printEmpDetails();
		
		emp1.raiseSalary(13);
		emp2.raiseSalary(9);
		
		System.out.println("\n"+emp1.getName()+" salary after increasing 13 % is : "+emp1.getSalary());
		System.out.println(emp2.getName()+" Salary after increasing 9 % is : "+emp2.getSalary());
		
		System.out.println();
		
		emp1.printEmpDetails();
		System.out.println();
		emp2.printEmpDetails();
		
		
		System.out.println("\n"+emp1.getName()+" Years of experience "+emp1.getYearsOfExperience());
		System.out.println("\n"+emp2.getName()+" Years of experience "+emp2.getYearsOfExperience());
		
		
		
		
	}

}
