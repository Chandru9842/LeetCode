class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            max=Math.max(max,i);
        }
        int move=0;
        for(int i:nums){
            move+=Math.abs(i-max);
        }
        return move;
        
    }
}