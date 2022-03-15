/*Fresher training 2022
*Author ToanPDT
*Date Mar 15, 2022
*Study assignment
*/

public class Tester {

	public static void main(String[] args) {
		QuickSort a = new QuickSort(10);
		SelectionSort b = new SelectionSort(10);
		InsertSort c = new InsertSort(6);
		c.input();
		c.sort();
		c.print();
	}

}
