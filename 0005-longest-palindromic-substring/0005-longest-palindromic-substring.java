class Solution {
    public boolean ispalindrone(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
                l++;
                r--;
            
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(ispalindrone(s,i,j)){
                    String tempans=s.substring(i,j+1);
                    // the ans will change so i create the tempans;
                    // i=0; the ans be "aba" //length=3;
                    // i=1;the ans be like aabbaa /length=6
                    // so we check the ans.length()<tempans.lenght()
                    // ans=tempans;

                
                if(ans.length()<tempans.length()){
                    ans=tempans;
                }
                }
            }
        }
        return ans;
        
    }
}



// effecient solution
// class Solution {

//     public String expand(String s, int left, int right) {
//         while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
//             left--;
//             right++;
//         }
//         return s.substring(left + 1, right);
//     }

//     public String longestPalindrome(String s) {

//         String res = "";

//         for(int i = 0; i < s.length(); i++) {

//             String odd = expand(s, i, i);       // odd length
//             String even = expand(s, i, i + 1);  // even length

//             if(odd.length() > res.length())
//                 res = odd;

//             if(even.length() > res.length())
//                 res = even;
//         }

//         return res;
//     }
// }