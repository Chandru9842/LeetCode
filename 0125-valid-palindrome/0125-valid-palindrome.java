class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
       return ans(0,s);
        
    }
    public static boolean ans(int i,String s){
        if(i>=s.length()){
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            return false;
        }
        return ans(i+1,s);

    }
}