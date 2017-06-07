
/*
 * Write a program to print all the LEADERS in the array. 
 * An element is leader if it is greater than all the elements to its right side. 
 * And the rightmost element is always a leader. 
 * For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2. 
 */


public class LeadersInArray {

	public static void main(String[] args) {
		int a[] = { 16, 17, 4, 3, 5, 2};
		findLeaders(a);

	}

	private static void findLeaders(int a[]) {

		for (int i = 0; i < a.length-1; i++) {
			int j;
			for ( j = i + 1; j < a.length; j++) {
				if (a[i] <= a[j])
					break;
			}
				if (j == a.length - 1)
					System.out.println(a[i]);

		}
	}

}
