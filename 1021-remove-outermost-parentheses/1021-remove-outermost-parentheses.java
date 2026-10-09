class Solution {
    public String removeOuterParentheses(String s) {
        int cnt=0;
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(cnt>0){
                    st.add(ch);
                }
                cnt++;

            }
            else{
                cnt--;
                if(cnt>0){
                    st.add(ch);
                }

            
            }
        }
        StringBuilder str=new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.peek());
            st.pop();
        }
    
        return str.reverse().toString();
    }
}