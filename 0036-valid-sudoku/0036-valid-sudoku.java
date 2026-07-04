class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set <String>set=new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                    char c=board[i][j];
                    if(c=='.'){
                        continue;
                    }
                   String row=c+"in row"+i;
                    String col=c+"in col"+j;
                    String box=c+"in the box"+(i/3)+"-"+(j/3);

                   if(set.contains(row)){
                    return false;
                   }
                   set.add(row);
                //    String col=c+"in col"+j;
                   if(set.contains(col)){
                    return false;
                   }
                   set.add(col);
                //    String box=c+"in the box"+(i/3)+"-"+(j/3);
                   if(set.contains(box)){
                    return false;
                   }
                   set.add(box);

        }
        }
        return true; 
    }
    
}