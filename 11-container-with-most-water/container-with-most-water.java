class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left<right){
            int height1=Math.min(height[left],height[right]);
            int breath=right-left;
            int Area=height1*breath;
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

//             int currentArea = Math.min(height[left], height[right]) * (right - left);
//             maxArea = Math.max(maxArea, currentArea);

//             if (height[left] < height[right]) {
//                 left++;
//             } else {
//                 right--;
//             }
//         }

//         return maxArea;