class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
            int min=Math.min(height[l],height[r]);
            int height1=r-l;
            int area=min*height1;
            max=Math.max(max,area);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max;

        
    }
}