class Solution {
    public void sortColors(int[] nums) {
        // //dutch national flag concept
        // int n=nums.length;
        // int mid=0;
        // int low=0;
        // int high=n-1;
        // while(mid<=high){
        //     if(nums[mid]==0){
        //         int temp=nums[low];
        //         nums[low]=nums[mid];
        //         nums[mid]=temp;
        //         mid++;
        //         low++;
        //     }
        //     else if(nums[mid]==1){
        //         mid++;
        //     }
        //     else{
        //         int temp=nums[mid];
        //         nums[mid]=nums[high];
        //         nums[high]=temp;
        //         // mid++;
                
        //         high--;
        //     }
        // }
        // Arrays.sort(nums);
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }

        }
        
    }
}