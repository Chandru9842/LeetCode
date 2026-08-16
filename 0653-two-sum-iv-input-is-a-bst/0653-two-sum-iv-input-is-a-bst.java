class Solution {
    void dfs(TreeNode root,int k,ArrayList<Integer>ans){
        if(root==null){
            return;
        }
        dfs(root.left,k,ans);
        ans.add(root.val);
        dfs(root.right,k,ans);
    }
    public static boolean two(ArrayList<Integer>ans,int k){
        int[]arr=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i]=ans.get(i);
        }
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==k){
                return true;
            }
            if(sum<k){
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer>ans=new ArrayList<>();
        dfs(root,k,ans);
        return two(ans,k);

        
    }
}