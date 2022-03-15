/*Fresher training 2022
*Author ToanPDT
*Date Mar 14, 2022
*Study assignment
*/

public class Employee {
	private String firstName;
	private String LastName;
	private double monthlySalary;
	public Employee() {
		
	}
	public Employee(String firstName, String lastName,double monthSalary) {
		this.firstName = firstName;
		this.LastName = lastName;
		if(monthSalary > 0.0) {
			this.monthlySalary = monthSalary;
		}else {this.monthlySalary = 0.0;}
	}
	
	//set
	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}
	public void setLastName(String lastname) {
		this.LastName = lastname;
	}
	public void setMonthSalary(double monthSalary) {
		if(monthSalary > 0.0) {
			this.monthlySalary = monthSalary;
		}
		else {
			this.monthlySalary = 0.0;
		}
	}
	
	//get
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public double getMonthSalary() {
		return monthlySalary;
	}
	
	//Get an Employee
	public String getInfo() {
		String info = "First name: " + firstName + "\nLast name: " + LastName + "\nSalary: " + monthlySalary;
		return info;
	}
	
}
