class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[]hash1=new int[26];
        int[]hash2=new int[26];
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            hash1[ch-'a']++;
        }
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            hash2[ch-'a']++;
        }
        int a=1;
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            if(hash1[ch-'a']>hash2[ch-'a']){
                a=0;
            }
        }
        return (a==1)?true:false;
    }
}