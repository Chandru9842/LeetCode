class Solution {
    public static int gcd(int a,int b){
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
    public int findGCD(int[] nums) {
        // Arrays.sort(nums);
        // int small=nums[0];
        // int large=nums[nums.length-1];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println(max+" "+min);
        return gcd(min,max);
    
        
    }
}