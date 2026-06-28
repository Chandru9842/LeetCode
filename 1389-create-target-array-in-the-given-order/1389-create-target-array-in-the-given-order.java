class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Pair>ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            ans.add(index[i],new Pair(index[i],nums[i]));
        }
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            Pair p=ans.get(i);
            res[i] = ans.get(i).second;
        }
        return res;
        
    }
}