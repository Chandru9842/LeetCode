class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int ans=intervals.length;
        for(int i=0;i<intervals.length;i++){
            for(int j=0;j<intervals.length;j++){
                if(i==j){
                    continue;
                }
            int u=intervals[i][0];
            int v=intervals[i][1];
            int u1=intervals[j][0];
            int v1=intervals[j][1];
            if(u1<=u&&v<=v1){
                ans--;
                break;
            }

        }
        }
        return ans;
        
    }
}