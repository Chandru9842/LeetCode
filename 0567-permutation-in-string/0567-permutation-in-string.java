class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[]hashs2=new int[26];
        int[]hashs1=new int[26];
        for(int i=0;i<s1.length();i++){
            hashs2[s1.charAt(i)-'a']++;
        }
        int l=0;
        for(int r=0;r<s2.length();r++){
            hashs1[s2.charAt(r)-'a']++;
            if(r-l+1>s1.length()){
                hashs1[s2.charAt(l)-'a']--;
                l++;
            }
            if(r-l+1==s1.length()){
                if(Arrays.equals(hashs2,hashs1)){
                    return true;
                }
            }
        }
        return false;
    }
}