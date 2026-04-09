class Solution {
     public int largestRectangleArea(int[] nums) {
        int n=nums.length;
        int max=0;
        Deque<Integer>st=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&nums[st.peek()]>=nums[i]){
                int el=st.pop();
                int nse=i;
                int pse=st.isEmpty()?-1:st.peek();
                max=Math.max(max,nums[el]*(nse-pse-1));

            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int el=st.pop();
            int nse=n;
            int pse=st.isEmpty()?-1:st.peek();
            max=Math.max(max,nums[el]*(nse-pse-1));

        }
        return max;

        
    }
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int prefixsum[][]=new int[rows][cols];
        int max=0;
        // int sum=0;
        for(int i=0;i<cols;i++){
            int sum=0;
            for(int j=0;j<rows;j++){
                if (matrix[j][i] == '0') {
                    sum =0;
        } 
        else {
            sum +=1;
        }
        prefixsum[j][i] = sum;
            }
        }
        for(int i=0;i<rows;i++){
            max=Math.max(max,largestRectangleArea(prefixsum[i]));
        }
        return max;
        
    }
}