class Solution {
    public void swap(int []nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

    }
    public void reverse(int[]nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }

    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0&&nums[i]>=nums[i+1]){//find the breakpoint or the pivot
            i--;
        }
        int j=n-1;
        if(i>=0){
            while(nums[i]>=nums[j]){
                j--;
            }
            swap(nums,i,j);
            
        }
        reverse(nums,i+1,n-1);
        
    }
}