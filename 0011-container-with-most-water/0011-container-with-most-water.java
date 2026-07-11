class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int height1=Math.min(height[left],height[right]);
            int breadth=right-left;
            int Area=breadth*height1;
            max=Math.max(max,Area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }


        }
        return max;

        
    }
}