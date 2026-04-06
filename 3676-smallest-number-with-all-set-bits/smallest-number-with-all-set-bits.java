class Solution {
    public int smallestNumber(int a) {
        // String a=Integer.toBinaryString(n);
       while((a&(a+1))!=0){
        a++;

       }
       return a;
        

        
    }
}