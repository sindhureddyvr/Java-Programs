import java.util.Scanner;
/*
 * Print a single integer denoting the number of characters you must delete to make the two strings anagrams of each other.
 * 
 * Sample Input : 
 * cde
 * abc
 * Sample Output : 4
 * Explanation
 * 
 * We delete the following characters from our two strings to turn them into anagrams of each other:
 * Remove d and e from cde to get c.
 * Remove a and b from abc to get c.
 * We must delete  characters to make both strings anagrams, so we print  on a new line.
 * 
 */
public class MakingAnagrams {
    public static int numberNeeded(String first, String second) {
     int[] lettercounts = new int[26];
		for(char c : first.toCharArray()){
			lettercounts[c-'a']++;
		}
		for(char c : second.toCharArray()){
			lettercounts[c-'a']--;
		}
		int result = 0;
		for(int i : lettercounts){
			result += Math.abs(i);
		}
		return result;      
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        
        System.out.println(numberNeeded(a, b));
    }
}
