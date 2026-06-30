class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            ArrayList<Integer>lst=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||i==j){
                    lst.add(1);
                }
                else{
                    List<Integer>temp=ans.get(i-1);
                    lst.add(temp.get(j)+temp.get(j-1));
                                    
                }
            }
            ans.add(lst);

        }
        return ans.get(rowIndex);
        
    }
}