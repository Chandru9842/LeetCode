class Solution {
    public int trap(int[] height) {
    //   int[]left=new int[height.length];
    //   int[]right=new int[height.length];
    //   int max=0;
    //   for(int i=0;i<height.length;i++){
    //     if(height[i]>=max){
    //         max=height[i];
    //     }
    //     left[i]=max;
    //   }
    //  max=-1;
    //  for(int i=height.length-1;i>=0;i--){
    //     if(height[i]>=max){
    //         max=height[i];
    //     }
    //     right[i]=max;
    //  }
    //  int water=0;
    //  for(int i=0;i<height.length;i++){
    //     water+=Math.min(left[i],right[i])-height[i];
    //  }
    //  return water;

    int l=0;
    int r=height.length-1;
    int water=0;
    int lmax=Integer.MIN_VALUE;
    int rmax=Integer.MIN_VALUE;
    while(l<r){
      
        
        if(height[l]<height[r]){
              lmax=Math.max(height[l],lmax);
              water+=lmax-height[l];
              l++;

        }
        else{
            rmax=Math.max(height[r],rmax);
            water+=rmax-height[r];
            r--;

        }

    }
    return water;

    }
}