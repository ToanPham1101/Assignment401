/*Fresher training 2022
*Author ToanPDT
*Date Mar 14, 2022
*Study assignment
*/

public class Ford extends Car {
	private int year;
	private int manufactureDiscount;
	public Ford(int speed, double regularPrice, String color, int year, int manufactureDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufactureDiscount = manufactureDiscount;
	}
	public double getSalePrice() {
		return super.getSalePrice() - manufactureDiscount;
	}
}
