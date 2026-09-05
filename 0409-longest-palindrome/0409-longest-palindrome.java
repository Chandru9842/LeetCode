class Solution {
    public int longestPalindrome(String s) {
        // s=s.toLowerCase();
        int[]hash=new int[128];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hash[ch]++;
        }
    boolean odd=false;
    int ans=0;
        for(int cnt:hash){
            int count=(cnt/2)*2;
            ans+=count;
            if(cnt%2!=0){
                odd=true;
            }
        }
        if(odd){
            ans++;
        }
        return ans;
    }
}