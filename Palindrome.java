//Given an integer x, return true if x is palindrome integer.
//An integer is a palindrome when it reads the same backward as forward.
//For example, 121 is a palindrome while 123 is not.
//Example 1:
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
package Coding_Quest;

public class Palindrome {
    public boolean isPalindrome(int x){
        if(x < 0 && x % 10 == 0){
            return false;
        }
        int number = x;
        int reverse = 0;
        while(number > 0){
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return x == reverse;
    }

}
