package InheritanceRunner;

import java.math.BigDecimal;

public class Employee extends Person {
	private String title;
	private String employer;
	private String employeeGrade;
	private BigDecimal salary;
	
	public Employee(String namem,String title) {
		super(name);
		this.title = title;
		System.out.println("Employee Constructor");
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployer() {
		return employer;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	public String getEmployeeGrade() {
		return employeeGrade;
	}
	public void setEmployeeGrade(String employeeGrade) {
		this.employeeGrade = employeeGrade;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return title + ", employer=" + employer + ", employeeGrade=" + employeeGrade + ", salary="
				+ salary + "  email:"+ super.getEmail();
	}
	

}
