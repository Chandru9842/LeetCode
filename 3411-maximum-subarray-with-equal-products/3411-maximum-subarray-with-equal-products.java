class Solution {
    public int maxLength(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            int pro=1;
            int g=0;
            int l=1;
            for(int j=i;j<nums.length;j++){
                pro*=nums[j];
                g=gcd(g,nums[j]);
                l=(l*nums[j])/(gcd(l,nums[j]));

                if(pro==g*l){
                    cnt=Math.max(cnt,j-i+1);
                }
                if(pro>1_000_000_000_000L){
                    break;
                }
                
            }
        
        }
        return cnt;
    
        
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
}
}