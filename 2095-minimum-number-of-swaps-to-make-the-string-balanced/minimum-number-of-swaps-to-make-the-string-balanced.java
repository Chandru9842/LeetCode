class Solution {
    public int minSwaps(String s) {
        int count=0;
        int imbalance=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='['){
                count++;
            }
            else{
                if(count>0){
                    count--;
                }
                else{
                    imbalance++;
                }
            }

        }
        return (count+1)/2;
        
    }
}