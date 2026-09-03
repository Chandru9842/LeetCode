class Solution {
    public static boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    public int maxVowels(String s, int k) {
        int l=0;
        int cnt=0;
        int max=0;
        for(int r=0;r<s.length();r++){
            if(isVowel(s.charAt(r))){
                cnt++;
            }
            if(r-l+1==k){
                max=Math.max(max,cnt);
                if(isVowel(s.charAt(l))){
                    cnt--;
                }
                l++;

            }
        }
        return max;
        
    }
}