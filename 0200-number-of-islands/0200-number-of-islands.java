class Solution {
    void dfs(int row,int col,char[][]grid,int [][]vis,int[] delrow,int[] delcol){
       vis[row][col]=1;
       for(int i=0;i<4;i++){
        int nrow=row+delrow[i];
        int ncol=col+delcol[i];
        if(nrow<0||nrow>=grid.length||ncol<0||ncol>=grid[0].length||grid[nrow][ncol]=='0'||vis[nrow][ncol]==1){
            continue ;
        }
        dfs(nrow,ncol,grid,vis,delrow,delcol);
       }
    }
    public int numIslands(char[][] grid) {
        if(grid.length==0){
            return 0;
        }
        int n=grid.length;
        int count=0;
        int[]delrow=new int[]{-1,0,1,0};
        int[]delcol=new int[]{0,1,0,-1};
        int vis[][]=new int[n][grid[0].length];
        for(int i=0;i<n;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'&&vis[i][j]==0){
                    count++;
                    dfs(i,j,grid,vis,delrow,delcol);
                    

                }
            }
        }
        return count;
    }
}