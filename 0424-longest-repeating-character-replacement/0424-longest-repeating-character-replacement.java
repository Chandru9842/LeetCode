class Solution {
    public int characterReplacement(String s, int k) {
        // int max=0;
        // for(int i=0;i<s.length();i++){
        //     int[]hash=new int[26];
        //     int maxf=0;
        //     for(int j=i;j<s.length();j++){             TC->O(N*N);
        //         hash[s.charAt(j)-'A']++;
        //         maxf=Math.max(maxf,hash[s.charAt(j)-'A']);
        //         int change=(j-i+1)-maxf;
        //         if(change<=k){
        //             max=Math.max(max,j-i+1);
        //         }
        //         else{
        //             break;
        //         }



        //     }
        // }
        // return max;
        // int l=0,r=0,max=0,maxf=0;
        // Map<Character,Integer>mpp=new HashMap<>();
        // while(r<s.length()){
        //     mpp.put(s.charAt(r),mpp.getOrDefault(s.charAt(r),0)+1);
        //     maxf=Math.max(maxf,mpp.get(s.charAt(r)));
        //     while((r-l+1)-maxf>k){
        //         mpp.put(s.charAt(l),mpp.get(s.charAt(l))-1);
        //         maxf=0;
        //         for(int a:mpp.values()){
        //             maxf=Math.max(maxf,a);     TC->O(N+N)*26;
        //         }
        //         l++;

        //     }
        //     if((r-l+1)-maxf<=k){
        //         max=Math.max(r-l+1,max);
        //     }
        //     r++;

        // }
        // return max;
        //  int l=0,r=0,max=0,maxf=0;
        // Map<Character,Integer>mpp=new HashMap<>();
        // while(r<s.length()){
        //     mpp.put(s.charAt(r),mpp.getOrDefault(s.charAt(r),0)+1);
        //     maxf=Math.max(maxf,mpp.get(s.charAt(r)));
        //     while((r-l+1)-maxf>k){
        //         mpp.put(s.charAt(l),mpp.get(s.charAt(l))-1);
        //         // maxf=0;
        //         // for(int a:mpp.values()){
        //         //     maxf=Math.max(maxf,a);
        //         // }                                 //TC->O(N+N);
        //         l++;

        //     }
        //     if((r-l+1)-maxf<=k){
        //         max=Math.max(r-l+1,max);
        //     }
        //     r++;

        // }
        // return max;


        //  int l=0,r=0,max=0,maxf=0;
        // Map<Character,Integer>mpp=new HashMap<>();
        // while(r<s.length()){
        //     mpp.put(s.charAt(r),mpp.getOrDefault(s.charAt(r),0)+1);
        //     maxf=Math.max(maxf,mpp.get(s.charAt(r)));
        //     if((r-l+1)-maxf>k){
        //         mpp.put(s.charAt(l),mpp.get(s.charAt(l))-1);
        //         maxf=0;
        //         for(int a:mpp.values()){
        //             maxf=Math.max(maxf,a);//TC->O(N)
        //         }
        //         l++;

        //     }
        //     if((r-l+1)-maxf<=k){
        //         max=Math.max(r-l+1,max);
        //     }
        //     r++;

        // }
        // return max;


        // int max=0;
        // for(int i=0;i<s.length();i++){
        //     int maxf=0;
        //     int[]hash=new int[256];
        //     for(int j=i;j<s.length();j++){
        //         hash[s.charAt(j)-'A']++;
        //         maxf=Math.max(maxf,hash[s.charAt(j)-'A']);
        //         int change=(j-i+1)-maxf;
        //         if(change<=k){
        //             max=Math.max(j-i+1,max);
        //         }
        //     }
        // }
        // return max;

        int l=0;
        int max=0;
        int maxf=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int r=0;r<s.length();r++){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            maxf=Math.max(maxf,map.get(s.charAt(r)));
            int change=(r-l+1)-maxf;
            while(change>k){
                map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)-1);
                // maxf=0;
                // for(int value:map.values()){
                //     maxf=Math.max(maxf,value);
                // }
                l++;
                change=(r-l+1)-maxf;

            }
            if(change<=k){
                max=Math.max(r-l+1,max);

            }
        }
        return max;
        
    }
}