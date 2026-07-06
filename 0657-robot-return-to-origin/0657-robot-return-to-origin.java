class Pair{
    int row;
    int col;
    public Pair(int col,int row){
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public boolean judgeCircle(String moves) {
        HashMap<Character,Pair>map=new HashMap<>();
        map.put('U',new Pair(1,0));
        map.put('D',new Pair(-1,0));
        map.put('L',new Pair(0,-1));
        map.put('R',new Pair(0,1));
        int x=0,y=0;
        for(int i=0;i<moves.length();i++){
            Pair a=map.get(moves.charAt(i));
            // System.out.println(a.row);
            
            // Pair[]pos=map.get(moves.charAt(i));
             x+=a.row;
             y+=a.col;
        }
        return x==0&&y==0;
    }
}