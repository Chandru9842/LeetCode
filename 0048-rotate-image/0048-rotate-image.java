class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n-1;j++){
                int temp=matrix[i][j];                 // 1 4 7
                //                                         2 5 8
                //                                          3 6 9
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        // how to  reverse;
        for(int i=0;i<n;i++){
            int left=0;
            int right=n-1;
            while(left<right){
                int temp=matrix[i][right];
                matrix[i][right]=matrix[i][left];
                matrix[i][left]=temp;
                left++;
                right--;
            }
            

        }

           



        
        
    }
}