class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int max=Integer.MAX_VALUE;
        int n=nums.size();
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums.get(j);
                int cnt=j-i+1;
                if(sum>0&&cnt>=l&&cnt<=r){
                    max=Math.min(max,sum);
                }


            }
        }
        return max==Integer.MAX_VALUE?-1:max;
        
    }
}