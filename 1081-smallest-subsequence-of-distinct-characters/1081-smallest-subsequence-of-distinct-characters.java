class Solution {
    public String smallestSubsequence(String s) {
         int[]hash=new int[26];
        boolean[]vis=new boolean[26];
        for(char i:s.toCharArray()){
            hash[i-'a']++;

        }
        Deque<Character>st=new ArrayDeque<>();
        for(char j:s.toCharArray()){
            hash[j-'a']--;
            if(vis[j-'a']==true){
                continue;
            }
            while(!st.isEmpty()&&hash[st.peek()-'a']>0&&st.peek()>j){
                char a=st.pop();
                vis[a-'a']=false;
            }
            st.push(j);
            vis[j-'a']=true;
        }
        String ans="";
        while(!st.isEmpty()){
            ans+=st.peek();
            st.pop();
        }
        String res="";
        for(int i=ans.length()-1;i>=0;i--){
            res+=ans.charAt(i);
        }
        return res;
        
    }
}