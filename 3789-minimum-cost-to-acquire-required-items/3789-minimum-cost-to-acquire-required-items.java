class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long c1=cost1,c2=cost2,c3=costBoth,n1=need1,n2=need2;
       long common=Math.min(n1,n2);
       long opt1=n1*c1+n2*c2;
       long opt3=Math.max(n1,n2)*c3;
       long opt2=common*c3+(n1-common)*c1+(n2-common)*c2;
       return Math.min(opt1,Math.min(opt2,opt3));
        
        
    }
}