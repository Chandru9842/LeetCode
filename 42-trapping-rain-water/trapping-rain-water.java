class Solution {
    public int trap(int[] height) {
        int left_max[]=new int[height.length];
        int right_max[]=new int[height.length];
        right_max[height.length-1]=height[height.length-1];
        left_max[0]=height[0];
        // to calculate the left max for each i;
        for(int i=1;i<height.length;i++){
            left_max[i]=Math.max(height[i],left_max[i-1]);
        }
        // to claculate the right max for each i;
        for(int i=height.length-2;i>=0;i--){
            right_max[i]=Math.max(height[i],right_max[i+1]);
        } 
        int total=0;
        for(int i=0;i<height.length;i++){
            total+=Math.min(left_max[i],right_max[i])-height[i];
        }
        return total;

        
    }
}