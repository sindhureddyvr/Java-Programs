/*
 * Given a string, you need to reverse the order of characters in each word within a sentence while still 
 * preserving whitespace and initial word order.
 */

public class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int j;
        for(int i = 0 ; i < arr.length;i++){
            if(arr[i] != ' '){
                j=i;
                while(j < arr.length-1 && arr[j+1] != ' '){
                    j++;
                }
                reverse(arr,i,j);
                i=j;
            }
        }
        return new String(arr);
        
    }
    
    public void reverse(char[] arr, int i, int j)
    {
        while(i<j){
            char temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }    
}
