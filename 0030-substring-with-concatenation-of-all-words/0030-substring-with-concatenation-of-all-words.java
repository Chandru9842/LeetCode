class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        ArrayList<Integer>ans=new ArrayList<>();
        HashMap<String,Integer>map=new HashMap<>();
        for(String i:words){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int wordcount=words.length;
        int wordlength=words[0].length();
        int tot=wordcount*wordlength;
       for(int offset = 0; offset < wordlength; offset++) {
        HashMap<String,Integer> seen = new HashMap<>();
        int count = 0;
        int l = offset;
         for(int r = offset; r + wordlength <= s.length(); r += wordlength) {
            String word=s.substring(r,r+wordlength);
            if(!map.containsKey(word)){
                seen.clear();
                count=0;
                l=r+wordlength;
                continue;

            }
            seen.put(word,seen.getOrDefault(word,0)+1);
            count++;
            while (seen.get(word) > map.get(word)) {
                String left=s.substring(l,l+wordlength);
                seen.put(left,seen.getOrDefault(left,0)-1);
                l+=wordlength;
                count--;
    // remove the left word
}
         if(count==wordcount){
            ans.add(l);
         }
        }
        }
        return ans;
        
    }
}