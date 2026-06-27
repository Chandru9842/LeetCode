class Pair{
    String first;
    int second;
    public Pair(String first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String>set=new HashSet<>();
        for(int i=0;i<wordList.size();i++){
            set.add(wordList.get(i));
        }
        Deque<Pair>q=new ArrayDeque<>();
        q.offer(new Pair(beginWord,1));
        set.remove(beginWord);
        while(!q.isEmpty()){
            String word=q.peek().first;
            int steps=q.peek().second;
            q.poll();
            if(word.equals(endWord)==true){
                return steps;
            }
            for(int i=0;i<word.length();i++){
                for(char ch='a';ch<='z';ch++){
                    char replacedCharArray[]=word.toCharArray();
                    replacedCharArray[i]=ch;
                    String replaceWord=new String(replacedCharArray);
                    if(set.contains(replaceWord)==true){
                        set.remove(replaceWord);
                        q.offer(new Pair(replaceWord,steps+1));

                    }
                }
            }
        }
        return 0;

        
    }
}