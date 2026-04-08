class Solution {
    public int[] nextGreaterElements(int[] nums) {
        // ArrayList<Integer>a=new ArrayList<>();
        // int n=nums.length;
        // for(int i=0;i<=n-1;i++){
        //     int greater=-1;
        //     for(int j=i+1;j<=i+n-1;j++){
        //         int index=j%n;
        //         if(nums[index]>nums[i]){
        //             greater=nums[index];
        //             // a.add(nums[index]);
        //             break;
        //         }
        //         // a.add(greater);
        //     }
        //     a.add(greater);
        // }
        // int []result=new int[a.size()];
        // for(int i=0;i<a.size();i++){
        //     result[i]=a.get(i);
        // }
        // return result;
        int n=nums.length;
        int greater=-1;
        Deque<Integer>st=new ArrayDeque<>();
        ArrayList<Integer>lst=new ArrayList<>();
        for(int i=2*n-1;i>=0;i--){
            int idx=i%n;
            while(!st.isEmpty()&&st.peek()<=nums[idx]){
                st.pop();
            }
            if(!st.isEmpty()&&st.peek()>=nums[idx]){
                lst.add(st.peek());
            }
            else{
                lst.add(greater);
            }
            st.push(nums[idx]);
        }
        Collections.reverse(lst);
        int[]arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=lst.get(i);
        }
        return arr;
        
        
    }
}