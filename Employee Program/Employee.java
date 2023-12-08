import java.util.*;
import java.time.*;
public class Employee {

	private String name,job_title;
	private double salary;
	private LocalDate hireDate;
	
	Employee(String name,String job_title,int salary,LocalDate hireDate){
		this.name = name;
		this.job_title = job_title;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setJobTitle(String job_title) {
		this.job_title = job_title;
	}
	
	public String getJobTitle() {
		return job_title;
	}
	
	
	//hiredate
	public LocalDate getHireDate() {
		return hireDate;
	}
	
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	
	public void raiseSalary(int percentage) {
		salary = salary + salary*percentage/100 ;
	}
	
	public void printEmpDetails() {
		System.out.println("Name  :"+name);
		System.out.println("Job  : "+job_title);
		System.out.println("Salary : "+salary);
		System.out.println("HireDate :"+hireDate);
	}
	
	
	public int getYearsOfExperience() {
		return Period.between(hireDate, LocalDate.now()).getYears();
	}
	
	
}
