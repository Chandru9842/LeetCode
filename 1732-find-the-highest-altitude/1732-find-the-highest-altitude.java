class Solution {
    public int largestAltitude(int[] gain) {
        int[]ans=new int[gain.length+1];
        ans[0]=0;
        int j=1;
        int max=0;
        for(int i=0;i<gain.length;i++){
            if(i==0){
            ans[j]=gain[i];
            // j++;
            max=Math.max(max,ans[j]);
            j++;
            }
            else{ans[j]=ans[j-1]+gain[i];
            // j++;
            max=Math.max(max,ans[j]);
            j++;
            }




        }
        return max;
        
    }
}