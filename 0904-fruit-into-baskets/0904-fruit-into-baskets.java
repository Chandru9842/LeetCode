class Solution {
    public int totalFruit(int[] fruits) {
        // // int maxlen=0;
        // // int n=fruits.length;
        // // for(int i=0;i<n;i++){
        // //     Set<Integer>set=new HashSet<>();
        // //     for(int j=i;j<n;j++){
        // //         set.add(fruits[j]);
        // //         if(set.size()<=2){
        // //             maxlen=Math.max(maxlen,j-i+1);
        // //         }
        // //         else{
        // //             break;
        // //         }
        // //     }
        // // }
        // // return maxlen;
        
        // int l=0;
        // int r=0;
        // int maxlen=0;
        // int n=fruits.length;
        // Map<Integer,Integer>mpp=new HashMap<>();
        // while(r<n){
        //     mpp.put(fruits[r],mpp.getOrDefault(fruits[r],0)+1);
        //     if(mpp.size()>2){
        //         while(mpp.size()>2){
        //              mpp.put(fruits[l],mpp.get(fruits[l])-1);
        //              if(mpp.get(fruits[l])==0){
        //                 mpp.remove(fruits[l]);
        //              }
        //              l++;
        //         }                           //TC->O(2N),sc->O(N);
               


        //     }
        //      if(mpp.size()<=2){
        //             maxlen=Math.max(maxlen,r-l+1);

        //         }
        //         r++;
        //     // return maxlen;

        // }
        // return maxlen;
    //     class Solution {
    // public int totalFruit(int[] fruits) {

        int l=0;
        int max=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int r=0;r<fruits.length;r++){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            while(map.size()>2){
                map.put(fruits[l],map.get(fruits[l])-1);
                if(map.get(fruits[l])==0){
                    map.remove(fruits[l]);
                    
                }
                l++;

            }
            max=Math.max(r-l+1,max);
        }
        return max;
    }
}

