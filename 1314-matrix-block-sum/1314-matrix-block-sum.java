class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int ans[][] = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int sum = 0;
                for(int x = i-k;x<=i+k;x++)
                {
                    for(int y = j-k;y<=j+k;y++)
                    {
                        if(x>=0 && x<m && y>=0 && y<n)
                        {
                            sum+=mat[x][y];
                        }
                    }
                }
                ans[i][j]=sum;
            }
        }
        return ans;
    }
}