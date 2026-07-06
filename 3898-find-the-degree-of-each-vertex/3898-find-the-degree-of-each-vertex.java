class Solution {
    public int[] findDegrees(int[][] matrix) {
        int ans[]=new int[matrix.length];
        int n=matrix.length;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(matrix[i][j]==1){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
        
    }
}