class Solution {
    public int maxProduct(int n) {
        // ArrayList<Integer>ans=new ArrayList<>();
        // while(n!=0){
        //     int last=n%10;
        //     ans.add(last);
        //     n/=10;
        // }
        // int max=0;
        // for(int i=0;i<ans.size();i++){
        //     for(int j=i+1;j<ans.size();j++){
        //         int sum=ans.get(i)*ans.get(j);
        //         if(sum>max){
        //             max=sum;
        //         }

        //     }
        // }
        // return max;

        int max=-1;
        int max1=-1;
        while(n!=0){
            int last=n%10;
            if(last>=max){
                max1=max;
                max=last;
            }
            else if(last>max1){
                max1=last;

            }
            n/=10;

        }
        return max*max1;
        // PriorityQueue<Integer>pq=new PriorityQueue<>();
        // while(n!=0){
        //     int last=n%10;
        //     pq.offer(last);
        //     if(pq.size()>2){
        //         pq.poll();
        //     }
        //     n/=10;
        // }
        // return pq.poll()*pq.poll();
        
        
    }
}