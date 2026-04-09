class Solution {
    public int largestRectangleArea(int[] nums) {
        // int n=heights.length-1;
        // int left=0;
        // int right=0;
        // long area=0;
        // for(int i=0;i<=n;i++){
        //     int height=heights[i];
        //     left=i;
        //     while(left>=0&&heights[left]>=height){
        //         left--;
        //     }
        //     right=i;
        //     while(right<n+1&&heights[right]>=height){
        //         right++;
        //     }
        //     int width=right-left-1;
        //     int areamax=width*height;
        //     area=Math.max(areamax,area);

        // }
        // return (int)area;
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
}