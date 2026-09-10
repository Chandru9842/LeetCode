class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int max=0;
        HashSet<Character>set=new HashSet<>();
        for(int r=0;r<s.length();r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            max=Math.max(max,r-l+1);


        }
        return max;
    }
}

        // int m=s.length();
        // int maxLen=0;
        // for(int i=0;i<m;i++){
        //     int[]hash=new int[256];
        //     // Arrays.fill(hash,0);
        //     for(int j=i;j<m;j++){
        //         if(hash[s.charAt(j)]==1){
        //             break;
        //         }
        //         hash[s.charAt(j)]=1;
        //         int len = j - i + 1;
        //         maxLen = Math.max(maxLen, len);

        //     }
        
        // // for
        // }
        // return maxLen;
        // int m=s.length();
        // int maxLen=0;
        // for(int i=0;i<m;i++){
        //     HashMap<Character,Integer>mpp=new HashMap<>();
        //     for(int j=i;j<m;j++){
        //         if(mpp.containsKey(s.charAt(j))){
        //             break;
        //         }
        //         mpp.put(s.charAt(j),1);
        //         maxLen=Math.max(maxLen,j-i+1);

        //     }
        // }
        // return maxLen;
        
    