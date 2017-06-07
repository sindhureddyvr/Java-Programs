
public class MajorityElement {

	public static void main(String[] args) {
		int a[] = { 5, 3, 4, 5, 3, 3 };

		// Basic implementation using loop time complexity is O(n*n)
		int result = findingMajority(a);
		if (result == -1) {
			System.out.println("No Majority element is present");
		}

		// One more implementation by MooresVotingAlgorithm, time complexity is
		// O(n)
		int maxCandidate = findCandidate(a);
		int result2 =checkForMajority(a,maxCandidate);
		if (result2 == -1) {
			System.out.println("No Majority element is present,using Moores ALgo too");
		}
	}

	private static int findingMajority(int a[]) {

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j])
					count++;
			}
			if (count > (a.length / 2)) {
				System.out.println("Majority element present is " + a[i]);
				return 1;
			}

		}
		return -1;
	}

	// Method 2 Moore's Voting Algorithm

	private static int findCandidate(int a[]) {
		int count = 1, max_index = 0;
		int i;
		for (i = 1; i < a.length; i++){
			if (a[max_index] == a[i])
				count++;
			else
				count--;
		if (count == 0) {
			max_index = i;
			count = 1;
		}
		}
		return a[max_index];
	}

	private static int checkForMajority(int[] a, int max) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == max)
				count++;
		}
		if (count > a.length / 2) {
			System.out.println("Majority element present is " + max);
			return 1;
		}
		return -1;
	}

}
