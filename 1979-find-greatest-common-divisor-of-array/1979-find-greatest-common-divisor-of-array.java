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
        Arrays.sort(nums);
        int small=nums[0];
        int large=nums[nums.length-1];
        return gcd(small,large);
        
    }
}