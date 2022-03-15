/*Fresher training 2022
*Author ToanPDT
*Date Mar 14, 2022
*Study assignment
*/
import java.util.Scanner;

public class NumberList {
	public int[] arr;
	public int n;
	
	public NumberList() {
		
	}
	public NumberList(int n) {
		this.n = n;
		arr = new int[n];
	}
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("So phan tu trong list la: " + n);
		for(int i = 0 ; i < n; i++) {
			System.out.printf("/nNhap thong tin vi tri thu %d", i+1);
			arr[i] = sc.nextInt();
		}
		sc.close();
	}
	public void print() {
		System.out.println("Xuat gia tri mang: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "");
		}
	}
	
}
