class Solution {
    public int maxProductDifference(int[] nums) {
        int firstmin=Integer.MAX_VALUE;
        int secondmin=Integer.MAX_VALUE;
        int firstmax=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for(int i:nums){
            if(i>firstmax){
               
                secondmax=firstmax;
                 firstmax=i;

            }
            else if(i>secondmax){
                secondmax=i;
            }
            if(i<firstmin){
                secondmin=firstmin;
                firstmin=i;
            }
            else if(i<secondmin){
                secondmin=i;
            }
        }
        int max=firstmax*secondmax;
        int min=firstmin*secondmin;
        return max-min;
       
        
    }
}