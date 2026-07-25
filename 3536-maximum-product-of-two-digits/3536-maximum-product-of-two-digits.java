class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer>ans=new ArrayList<>();
        while(n!=0){
            int last=n%10;
            ans.add(last);
            n/=10;
        }
        int max=0;
        for(int i=0;i<ans.size();i++){
            int sum=0;
            for(int j=i+1;j<ans.size();j++){
                 sum=ans.get(i)*ans.get(j);
                max=Math.max(sum,max);

            }
        }
        return max;
        
        
    }
}