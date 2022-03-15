/*Fresher training 2022
*Author ToanPDT
*Date Mar 14, 2022
*Study assignment
*/

public class Car {
	private int speed;
	private double regularPrice;
	private String color;
	public Car() {
		
	}
	public Car(int speed, double regularPrice, String color) {
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}
	public double getSalePrice() {
		return regularPrice;
	}
}
