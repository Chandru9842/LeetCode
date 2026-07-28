class Solution {
    public String smallestPalindrome(String s) {
        char[]ch=s.toCharArray();
        int n=s.length();
        int mid=n/2;
        Arrays.sort(ch,0,mid);
        for(int i=0;i<mid;i++){
            ch[n-i-1]=ch[i];
        }
        return new String(ch);

        
    }
}