// Given an integer x, return true if x is a 
// palindrome
// , and false otherwise.

class Solution {
    public boolean isPalindrome(int x) {
        if(x==0)
        {
            return true;
        }
        int temp=x;
        int rv=0;
        while(temp>0)
        {
            int rem_digit=temp%10;
             rv=(rv*10)+rem_digit;
             temp/=10;

             if(x==rv)
             {
                 return true ;
             }
        }
        return false;
    }
}
