class Solution {
    public String removeDuplicates(String s) {
        Deque<Character>st=new ArrayDeque<>();
        String s1="";
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() &&ch==st.peek()){
               st.pop();
            }
            else{
                st.push(ch);
            }
            // st.push(ch);
        }
        while(!st.isEmpty()){
            s1+=st.peek();
            st.pop();
        }
        for(int i=s1.length()-1;i>=0;i--){
            ans+=s1.charAt(i);
        }
        return ans;
        
    }
}