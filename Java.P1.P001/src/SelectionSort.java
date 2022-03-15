/*Fresher training 2022
*Author ToanPDT
*Date Mar 14, 2022
*Study assignment
*/

public class SelectionSort extends NumberList implements Sort {
	public SelectionSort(int n) {
		this.n = n;
		arr = new int[n];
	}
	public static void selectionSort(int[] a, int n){
        int indexMin;
        for(int i = 0; i < n ; i++){
            indexMin = i;
            for(int j = i+1; j < n; j++){
                if(a[indexMin] > a[j]){
                    indexMin = j;
                }
            }
            if(i != indexMin){
                int temp = a[i];
                a[i] = a[indexMin];
                a[indexMin] = temp;
            }
        }
    }
	public void sort() {
		selectionSort(arr, n);
	}
}
