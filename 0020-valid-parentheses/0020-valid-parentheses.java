class Solution {
    public boolean isValid(String s) {
        Deque<Character>st=new ArrayDeque<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char a=st.pop();
                if(c==')'&&a!='('||c==']'&&a!='['||c=='}'&&a!='{'){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}