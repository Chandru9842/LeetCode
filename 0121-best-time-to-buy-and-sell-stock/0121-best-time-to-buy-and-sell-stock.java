class Solution {
    public int maxProfit(int[] nums) {
    //     int maxprofit=0;
    //    for(int i=0;i<nums.length;i++){
    //     for(int j=i+1;j<nums.length;j++){
    //         int price=nums[j]-nums[i];
    //         if(price>maxprofit){
    //             maxprofit=price;
    //         }
    //     }
    //    }
    //    return maxprofit;
    int max=0;
    int min=Integer.MAX_VALUE;
    for(int i:nums){
        if(i<min){
            min=i;
        }
        max=Math.max(max,i-min);
    }
    return max;
    
    }

}
