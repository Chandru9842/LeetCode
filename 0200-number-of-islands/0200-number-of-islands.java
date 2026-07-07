class Solution {
    void dfs(int i,int j,char[][]grid,int [][]vis){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]=='0'||vis[i][j]==1){
            return;
        }
        vis[i][j]=1;
        dfs(i+1,j,grid,vis);
        dfs(i,j+1,grid,vis);
        dfs(i-1,j,grid,vis);
        dfs(i,j-1,grid,vis);
    }
    public int numIslands(char[][] grid) {
        if(grid.length==0){
            return 0;
        }
        int n=grid.length;
        int count=0;
        int vis[][]=new int[n][grid[0].length];
        for(int i=0;i<n;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'&&vis[i][j]==0){
                    count++;
                    dfs(i,j,grid,vis);
                    

                }
            }
        }
        return count;
    }
}