class Solution {
    public int[] sortArray(int[] arr) {
        // int n=arr.length;
        // for(int i=0;i<n-1;i++){
        //     int mid=i;
        //     for(int j=i;j<n;j++){
        //         if(arr[j]<arr[mid]){
        //             mid=j;
        //         }
        //     }
        //     int temp=arr[mid];
        //     arr[mid]=arr[i];
        //     arr[i]=temp;
        // }
        // return arr;
       


        // Arrays.sort(arr);
        // return arr;

        // method 2
        PriorityQueue<Integer>q=new PriorityQueue<>();
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i:arr){
            q.add(i);
        }
        while(!q.isEmpty()){
            ans.add(q.peek());
            q.poll();
        }
        int res[]=new int[ans.size()];
        for(int i=0;i<res.length;i++){
            res[i]=ans.get(i);
        }
        return res;
        
    }
}