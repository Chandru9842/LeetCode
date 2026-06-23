class Solution {
    public void dfs(int row,int col,int[][]image,int[][]newImage,int inticolour,int[]delrow,int[]delcol,int color){
        newImage[row][col]=color;
        int n=image.length;
        int m=image[0].length;
        for(int i=0;i<4;i++){
            int nrow=row+delrow[i];
            int ncol=col+delcol[i];
            if(nrow>=0&&nrow<n&&ncol>=0&&ncol<m&&image[nrow][ncol]==inticolour&&newImage[nrow][ncol]!=color){
                dfs(nrow,ncol,image,newImage,inticolour,delrow,delcol,color);

            }
        }

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][]newImage=image;
        int inticolour=image[sr][sc];
        int delrow[]={-1,0,1,0};
        int delcol[]={0,1,0,-1};
        dfs(sr,sc,image,newImage,inticolour,delrow,delcol,color);
        return newImage;
        
    }
}