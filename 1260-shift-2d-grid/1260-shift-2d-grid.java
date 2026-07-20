class Solution {
    public static int[][] fun(int[][]grid,int[][]arr,int k,int count){

        if(count==k){
            return grid;
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(j!=grid[0].length-1){
                    arr[i][j+1]=grid[i][j];
                }
                else if (i != grid.length - 1) {
            arr[i + 1][0] = grid[i][j];
        } else {
            arr[0][0] = grid[i][j];
        }
            }
            

        }
        int[][]temp=new int[grid.length][grid[0].length];
        return fun(arr,temp,k,count+1);
    }
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>>ans=new ArrayList<>();
        int [][]arr=new int[grid.length][grid[0].length];
        int[][]lst=fun(grid,arr,k,0);
        for(int[]i:lst){
            ArrayList<Integer>res=new ArrayList<>();
            for(int j:i){
                res.add(j);
            }
            ans.add(res);

        }
        return ans;

        
    }
}