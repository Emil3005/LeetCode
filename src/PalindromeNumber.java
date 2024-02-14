/*
 * 9. Palindrome Number
Easy
Topics
Companies
Hint

Given an integer x, return true if x is a
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

 

Constraints:

    -231 <= x <= 231 - 1
Follow up: Could you solve it without converting the integer to a string?
 * 
 */

public class PalindromeNumber {
    private static int input = 12321;

    public static void main(String[] args) {
        System.out.println(isPalindrom(input));
    }

    public static boolean isPalindrom(int x){
        String input_string = Integer.toString(x);
        int length= input_string.length();
        for(int i = 0;i<length;i++){
            if(input_string.charAt(i)!=input_string.charAt(length-1-i)){
                return false;
            }
        }   
        
        return true;
    }
    
}
