class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>res=new ArrayList<>();
        helper(n,n,"",res);
        return res;

        
    }
    void helper(int left,int right,String ans,List<String>res){
        if(left>right||left<0||right<0){
            return;
        }
        if(left==0&&right==0){
            res.add(ans);
        }
        helper(left-1,right,ans+"(",res);
        helper(left,right-1,ans+")",res);

    }
}