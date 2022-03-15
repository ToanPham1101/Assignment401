/*Fresher training 2022
*Author ToanPDT
*Date Mar 14, 2022
*Study assignment
*/

public class InsertSort extends NumberList implements Sort {
	public InsertSort(int n) {
		this.n = n;
		arr = new int[n];
	}
	public static void insertionSort(int[] a, int n){
        for(int i = 1; i < n; i++){
            int index = i;
            int value = a[i];
            while(index > 0 && a[index - 1] > value){
                a[index] = a[index - 1];
                index--;
            }
            a[index] = value;
        }
    }
	public void sort() {
		insertionSort(arr, n);
	}
}
