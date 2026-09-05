class Solution {
    public int strStr(String haystack, String needle) {
        // for(int i=0;i<haystack.length();i++){
        //     for(int j=i;j<=haystack.length();j++){
        //         if(haystack.substring(i,j).equals(needle)){
        //             return i;
        //         }
        //     }
        // }
        // return -1;
         for(int i=0;i+needle.length()<=haystack.length();i++){
            // for(int j=i;j<=haystack.length();j++){
                if(haystack.substring(i,i+needle.length()).equals(needle)){
                    return i;
                }
            }
        // }
        return -1;
    }
}