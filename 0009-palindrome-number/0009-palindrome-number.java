class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false; //negative no not works in Palindrome
            }
         int count=0;
         int dup = x;
         while(x!= 0){
            int last = x%10;
            count=((count*10)+last);
            x=x/10;
            


         }
       if(dup==count){
        return true;
       }
       else{
        return false;
       }
    }
}