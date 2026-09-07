class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        StringBuilder[]rows=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            rows[i]=new StringBuilder();
        }

        int row=0;
        int direction=1;
        for(char ch:s.toCharArray()){
            rows[row].append(ch);
            if(row==numRows-1){
                direction=-1;
            }
            if(row==0){
                direction=1;
            }
            row+=direction;
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<numRows;i++){
            ans.append(rows[i]);
        }
        return ans.toString();

        
    }
}