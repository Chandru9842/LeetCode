class Solution {
    public boolean isPalindrome(String s) {
    //     s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
    //    return ans(0,s);
        
    // }
    // public static boolean ans(int i,String s){
    //     if(i>=s.length()){
    //         return true;
    //     }
    //     if(s.charAt(i)!=s.charAt(s.length()-i-1)){
    //         return false;
    //     }
    //     return ans(i+1,s);
    int l=0;
    int r=s.length()-1;
    while(l<=r){
        if(!Character.isLetterOrDigit(s.charAt(l))){
            l++;
        }
        else if(!Character.isLetterOrDigit(s.charAt(r))){
            r--;
        }
        else{
            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
    }
    return true;

    }
}