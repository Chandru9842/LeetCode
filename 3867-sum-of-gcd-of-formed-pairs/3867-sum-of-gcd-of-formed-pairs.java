class Solution {
    public static int findgcd(int a,int  b){
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
        
    }
    public long gcdSum(int[] nums) {
        int []prefixGcd=new int[nums.length];
        int max=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            prefixGcd[j]=findgcd(nums[i],max);
            j++;
        }
        Arrays.sort(prefixGcd);
        

        int l=0;
        int r=nums.length-1;
        long cnt=0;
     

        while(l<r){
            
            cnt+=findgcd(prefixGcd[l],prefixGcd[r]);
            
            l++;
            r--;
        }
        return (long)cnt;
        
    }
}