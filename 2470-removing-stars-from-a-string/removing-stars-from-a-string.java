class Solution {
    public String removeStars(String s) {
        Deque<Character>st=new ArrayDeque<>();
        String s1="";
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='*'){
                st.push(ch);
            }
            else{
                st.pop();
            }

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