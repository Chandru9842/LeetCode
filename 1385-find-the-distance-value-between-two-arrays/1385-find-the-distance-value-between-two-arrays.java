class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int dist=0;
       for(int i=0;i<arr1.length;i++){
        boolean is=true;
        for(int j=0;j<arr2.length;j++){
            if(Math.abs(arr1[i]-arr2[j])<=d){
                is=false;
                break;
            }
        }
        if(is){        dist++;
         } }
       return dist;
        
    }
}