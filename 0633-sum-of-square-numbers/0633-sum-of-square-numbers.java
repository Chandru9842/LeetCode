class Solution {
    public boolean judgeSquareSum(int c) {
        long left=0;
        long right=(long)Math.sqrt(c);
        while(left<=right){
            long sum=left*left+right*right;
            if(sum==c) return true;
            if(sum>c){
                right--;
            }
            else{
                left++;
            }
        }
        return false;

        // for(int a=0;a*a<=c;a++){
        //     for(int b=0;b*b<=c;b++){
        //         if(a*a+b*b==c){
        //             return true;                   // very slow
        //         }
        //     }
        // }
        // return false;
        
    }
}