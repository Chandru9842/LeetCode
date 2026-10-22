class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length()==0&&t.length()==1){
            return t.charAt(0);
        }
        else if(s.length()==1&&t.length()==0){
            return s.charAt(0);

        }
        
        HashMap<Character,Integer>map=new HashMap<>();
        for(char i:s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);

        }
        for(char i:t.toCharArray()){
            if(!map.containsKey(i)||map.get(i)==0){
                return i;
            }
            map.put(i,map.getOrDefault(i,0)-1);
        }
    
        
        return ' ';

        
    }
}