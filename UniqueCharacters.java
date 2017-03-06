import java.util.Arrays;

/*
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you can not use additional data structures?
 * 
 */

public class UniqueCharacters {

	public static void main(String[] args) {
		String str = "abc#def1s";
		char[] arr = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		System.out.println("The string is unique: " + checkUniqueness1(str));
		System.out.println("The string is unique: " + checkUniqueness2(str));		
		System.out.println("The string is unique: " + checkUniqueness3(arr));
	}

	// time complexity - n*n
	public static boolean checkUniqueness1(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j))
					return false;
			}
		}
		return true;
	}

	// time complexity - n
	public static boolean checkUniqueness2(String str) {

		boolean[] charset = new boolean[256];

		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (charset[val])
				return false;
			charset[val] = true;
		}
		return true;
	}

	// time complexity - nlogn
	public static boolean checkUniqueness3(char[] arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++)
			if(arr[i]==arr[i+1])
				return false;
		return true;
	}

}
