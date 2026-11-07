class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer>ans=new ArrayList<>();
        int l=0;
        // int max=0;
        TreeMap<Integer,Integer>map=new TreeMap<>();
        for(int r=0;r<nums.length;r++){
            // max=Math.max(nums[r],max);
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            if(r-l+1>k){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                }
                l++;

            }
            if(r-l+1==k){
                int max=map.lastKey();
                ans.add(max);
            }

        }
        int[]res=new int[ans.size()];
        for(int i=0;i<res.length;i++){
            res[i]=ans.get(i);
        }
        return res;

        
    }
}