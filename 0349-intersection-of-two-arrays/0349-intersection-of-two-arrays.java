class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<>();
        ArrayList<Integer>lst=new ArrayList<>();
        for(int i:nums1){
            set.add(i);
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                lst.add(nums2[i]);
                                set.remove(nums2[i]);

            }
           
        }
        
        int[] arr = new int[lst.size()];
        int i = 0;

        for (int num : lst) {
            arr[i++] = num;
        }

        return arr;

        
    }
}