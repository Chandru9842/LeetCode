class Solution {
    // public String longestCommonPrefix(String[] strs) {
        // if(strs.length==0){
        //     return "";
        // }
        // for(int i=0;i<strs[0].length();i++){
        //     char ch=strs[0].charAt(i);
        //     for(int j=0;j<strs.length;j++){
        //         if(i >= strs[j].length()||ch!=strs[j].charAt(i)){
        //             return strs[0].substring(0,i);
        //         }
        //     }
        // }
        // return strs[0];
    

        
  
   public String longestCommonPrefix(String[] strs) { 
    Arrays.sort(strs);
    char [] a=strs[0].toCharArray();
    char[] b=strs[strs.length-1].toCharArray();
    String ans="";
    for(int i=0;i<a.length;i++){
        if(a[i]!=b[i]){
            break;
        }
        ans+=a[i];
    }
    return ans;

    }

}