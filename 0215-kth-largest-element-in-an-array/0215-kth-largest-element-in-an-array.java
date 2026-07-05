class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        // return nums[nums.length-k];

        // optimal approach


        // PriorityQueue<Integer>q=new PriorityQueue<>();
        // for(int i=0;i<nums.length;i++){
        //     q.offer(nums[i]);
        //     if(q.size()>k){
        //         q.poll();

        //     }
        // }
        // return q.peek();


        // my idea
        PriorityQueue<Integer>q=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            q.offer(nums[i]);
        }
        while(q.size()>k){
            q.poll();
        }
        return q.poll();

        
    }
}