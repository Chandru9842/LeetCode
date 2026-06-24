class Tuple{
    int row;
    int col;
    int steps;
    public Tuple(int row,int col,int steps){
        this.row=row;
        this.col=col;
        this.steps=steps;

    }

}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        Deque<Tuple>q=new ArrayDeque<>();
        int dist[][]=new int[n][m];
        int vis[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    q.offer(new Tuple(i,j,0));
                    vis[i][j]=1;

                }
                else{
                    vis[i][j]=0;
                }

            }
        }
        int delrow[]={-1,0,1,0};
        int delcol[]={0,1,0,-1};
        while(!q.isEmpty()){
            int row=q.peek().row;
            int col=q.peek().col;
            int steps=q.peek().steps;
            dist[row][col]=steps;
            q.poll();
            for(int i=0;i<4;i++){
                int nrow=row+delrow[i];
                int ncol=col+delcol[i];
                if(nrow>=0&&nrow<n&&ncol>=0&&ncol<m&&vis[nrow][ncol]==0){
                    vis[nrow][ncol]=1;
                    q.offer(new Tuple(nrow,ncol,steps+1));
                }
            }
        }
        return dist;
        
    }
}