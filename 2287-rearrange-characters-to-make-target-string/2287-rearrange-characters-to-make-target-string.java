class Solution {
    public int rearrangeCharacters(String s, String t) {
        int[]sstr=new int[26];
        int[]tstr=new int[26];
        int ans=1000;
        for(int i=0;i<s.length();i++){
            sstr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            tstr[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(tstr[i]>0){
                ans=Math.min(ans,sstr[i]/tstr[i]);
            }
        }
        return ans;
        
    }
}