class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        Set<List<Integer>>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int count=0;
            List<Integer>temp=new ArrayList<>();
            for(int j=i;j<nums.length;j++){
                if(nums[j]%p==0){
                    count++;
                }
                if(count>k){
                    break;
                }
                temp.add(nums[j]);
                set.add(new ArrayList<>(temp));
            }
        }
        return set.size();

        
    }
}