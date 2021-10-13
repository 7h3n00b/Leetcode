/*
Write a function that reverses a string. The input string is given as an array of characters s.

Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
*/

public class ReverseString {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;
        
        while (i < j) {
            char t = s[i];
            s[i++] = s[j];
            s[j--] = t;
        }
    }
}