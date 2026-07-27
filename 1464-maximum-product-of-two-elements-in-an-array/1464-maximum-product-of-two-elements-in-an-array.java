class Solution {
    public int maxProduct(int[] nums) {
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         max=Math.max((nums[i]-1)*(nums[j]-1),max);
        //     }
        // }
        // return max;
        int max=Integer.MIN_VALUE;
        int max1=Integer.MIN_VALUE;
        for(int i:nums){
            if(i>max){
                max1=max;
                max=i;
            }
            else if(i>max1){
                max1=i;
            }
        }
        int product=(max-1)*(max1-1);

        return product;

        //  int first = Integer.MIN_VALUE;
        // int second = Integer.MIN_VALUE;

        // for (int num : nums) {
        //     if (num >= first) {
        //         second = first;
        //         first = num;
        //     } else if (num > second) {
        //         second = num;
        //     }
        // }

        // return (first - 1) * (second - 1);
        
    }
}