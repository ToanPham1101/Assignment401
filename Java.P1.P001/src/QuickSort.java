/*Fresher training 2022
*Author ToanPDT
*Date Mar 14, 2022
*Study assignment
*/

public class QuickSort extends NumberList implements Sort {
	public QuickSort(int n) {
		this.n = n;
		arr = new int[n];
	}
	public static void quickSort(int a[], int l, int r){
        int p = a[(l+r)/2];
        int i = l;
        int j = r;
        while(i < j){
            while(a[i] < p){
                i++;
            }
            while(a[j] > p){
                j--;
            }
            if(i <= j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        if(i < r){
            quickSort(a,i,r);
        }
        if(l < j){
            quickSort(a,l,j);
        }
    }
	public void sort() {
		quickSort(arr, 0, n-1);
	}
	
}
