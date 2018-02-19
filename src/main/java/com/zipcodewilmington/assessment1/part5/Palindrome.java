package com.zipcodewilmington.assessment1.part5;

public class Palindrome {
    int count = 1; //both use count - initialized to 1 because tests were 1 off...


    private void checkPalindrome(String input, int left, int right) {
        while(left >= 0 && right < input.length() && input.charAt(left) == input.charAt(right)){
            //Check for the palindrome string if == fails then its not a palindrome!
            count++;    //Increment the count if palindrome substring is found (to count how many palindromes are in string)
            left--;         //Moving the left side over by one
            right++;        //Moving the right side over by one
        }
    }
    public Integer countPalindromes(String input){

        for(int i=0; i< input.length()-1; i++){
            checkPalindrome(input,i,i);           // checking if its odd length palindromic sub-string
            checkPalindrome(input,i,i + 1);   // will never run and go into the while loop
        }
        return count;
    }
}
