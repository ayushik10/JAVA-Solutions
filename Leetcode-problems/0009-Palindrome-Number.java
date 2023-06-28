// 0009. PALINDROME NUMBER

class Solution {
    public boolean isPalindrome(int x) {
        
        int palindrome = 0;
        int num = x;

        while(x != 0)
        {
            int rem = x % 10;
            palindrome = (palindrome*10) + rem;
            x = x / 10;
        }

        if (palindrome == num && num >=0) 
        return true;
        else 
        return false;
         
    }
}
