class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][]=new int[n][n];
        int colbegin=0;
        int colend=matrix.length-1;
        int rowbegin=0;
        int rowend=matrix.length-1;
        int nums=1;
         while(rowbegin<=rowend&&colbegin<=colend){
            for(int i=colbegin;i<=colend;i++){
                matrix[rowbegin][i]=nums++;
                
            }
            rowbegin++;
            for(int i=rowbegin;i<=rowend;i++){
                matrix[i][colend]=nums++;
            }
            colend--;
            if(rowbegin<=rowend){
            for(int i=colend;i>=colbegin;i--){
                matrix[rowend][i]=nums++;
            }
            rowend--;
            }
            if(colbegin<=colend){
            for(int i=rowend;i>=rowbegin;i--){
                matrix[i][colbegin]=nums++;
            }
            colbegin++;
            }

        }
        return matrix;
        
    }
}