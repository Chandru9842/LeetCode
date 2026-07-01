
class Tuple{
    int dis;
    int row;
    int col;
    public Tuple(int dis,int row,int col){
        this.dis=dis;
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        Deque<Tuple>q=new ArrayDeque<>();
        int n=grid.length;
        int m=grid[0].length;
        int src[]=new int[]{0,0};
        int des[]=new int []{n-1,n-1};
        int vis[][]=new int[n][m];
        for(int i=0;i<vis.length;i++){
            for(int j=0;j<vis[i].length;j++){
            vis[i][j]=(int)1e9;
        }
        }
        // Arrays.fill(vis,(int)1e9);//wont works for the 2D array;
        if(grid[0][0]==1||grid[n-1][n-1]==1){
            return -1;
        }
       
        q.offer(new Tuple(1,0,0));
        vis[0][0]=1;
        
        if(n == 1 && m == 1){
               return 1;
        }
        int delrow[]={-1,-1,0,1,1,1,0,-1};
        int delcol[]={0,1,1,1,0,-1,-1,-1};
        while(!q.isEmpty()){
            int row=q.peek().row;
            int col=q.peek().col;
            int dis=q.peek().dis;
            q.poll();
            for(int i=0;i<8;i++){
                int nrow=row+delrow[i];
                int ncol=col+delcol[i];
                if(nrow>=0&&nrow<n&&ncol>=0&&ncol<m&&grid[nrow][ncol]==0&&dis+1<vis[nrow][ncol]){
                    vis[nrow][ncol]=dis+1;
                    if(nrow==des[0]&&ncol==des[1]){
                        return dis+1;
                    }
                    q.add(new Tuple(dis+1,nrow,ncol));
                }

            }

        }
        return -1;


        
    }
}