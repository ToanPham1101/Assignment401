/*Fresher training 2022
*Author ToanPDT
*Date Mar 14, 2022
*Study assignment
*/

public class EmployeeTest {

	public static void main(String[] args) {
		Employee Tom = new Employee("Tommy", "Teo`", 1000);
		Employee David = new Employee("David" , "Dao`", 1500);
		System.out.println(Tom.getInfo());
		System.out.println("\n" + David.getInfo());
		Tom.setMonthSalary(Tom.getMonthSalary() * 1.1);
		David.setMonthSalary(David.getMonthSalary() * 1.1);
		System.out.println("\nSalary after increase 10%");
		System.out.println("\n" +Tom.getInfo());
		System.out.println("\n" + David.getInfo());

	}

}
