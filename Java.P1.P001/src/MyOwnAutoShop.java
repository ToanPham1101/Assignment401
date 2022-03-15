/*Fresher training 2022
*Author ToanPDT
*Date Mar 14, 2022
*Study assignment
*/

public class MyOwnAutoShop {
	public static void main(String[] args) {
		Sedan car1 = new Sedan(200, 5000, "red", 15);
		Ford car2 = new Ford(180,6000,"black", 2022, 1000);
		Ford car3 = new Ford(200, 8000, "white", 2021, 500);
		Car car4 = new Car(190, 5000,"black");
		System.out.println(car1.getSalePrice());
		System.out.println(car2.getSalePrice());
		System.out.println(car3.getSalePrice());
		System.out.println(car4.getSalePrice());
	}
}
