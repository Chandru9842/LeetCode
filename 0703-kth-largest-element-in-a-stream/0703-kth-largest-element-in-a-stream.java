class KthLargest {
    PriorityQueue<Integer>q;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k=k;

        q=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            q.add(nums[i]);
            if(q.size()>k){
                q.poll();
            }
        }

        
        
    }
    
    public int add(int val) {
        q.add(val);
        while(q.size()>k){
            q.poll();
        }
        return q.peek();
        
    }
}
