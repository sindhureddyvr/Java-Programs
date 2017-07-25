
public class MergeSort {

	public static void main(String[] args) {
		int a[] = { 0, -3, -9, 22, 4 };
		int n = a.length;
		int low = 0;
		int high = a.length - 1;
		int[] temp = new int[n];
		mergeSort(a,temp, low, high);
		display(a);
	}
	
	private static void mergeSort(int[] a, int[] temp, int low, int high) {
		if (low >= high)
			return;
		int middle = (low + high) / 2;
		mergeSort(a, temp, low, middle);
		mergeSort(a, temp, middle + 1, high);
		merge(a, temp, low, middle, high);
	}

	private static void merge(int[] a, int[] temp, int low, int middle, int high) {
		for (int i = low; i <= high; i++) {
			temp[i] = a[i];
		}
		int i = low;
		int j = middle + 1;
		int k = low;
		while (i <= middle && j <= high) {
			if (temp[i] <= temp[j]) {
				a[k] = temp[i];
				i++;
			} else {
				a[k] = temp[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			a[k] = temp[i];
			k++;
			i++;
		}
	}
	
	private static void display(int a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}
	
}
