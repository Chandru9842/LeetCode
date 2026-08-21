class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int n=n1+n2;
        int i=0;
        int j=0;
        int count=0;
        int index1=n/2;
        int index2=(n/2)-1;
        int indexele1=Integer.MAX_VALUE;
        int indexele2=Integer.MAX_VALUE;
        while(i<n1&&j<n2){
            if(nums1[i]<nums2[j]){
                if(count==index1){
                    indexele1=nums1[i];
                }
                if(count==index2){
                    indexele2=nums1[i];
                }
                count++;
                i++;
            }
            else{
                if(count==index1){
                    indexele1=nums2[j];
                }
                if(count==index2){
                    indexele2=nums2[j];
                }
                count++;
                j++;
            }
        }
        while(i<n1){
                if(count==index1){
                    indexele1=nums1[i];
                }
                if(count==index2){
                    indexele2=nums1[i];
                }
                count++;
                i++;

        }
        while(j<n2){
             if(count==index1){
                    indexele1=nums2[j];
                }
                if(count==index2){
                    indexele2=nums2[j];
                }
                count++;
                j++;
            }

        if(n%2==1){
            return indexele1;
        }
        return (indexele1+indexele2)/2.0;

        
    }
}