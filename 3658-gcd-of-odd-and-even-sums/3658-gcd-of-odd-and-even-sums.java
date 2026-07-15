class Solution {
    public static int gcd(int a,int b){
        while(b!=0){

            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int odd=0;
        int even=0;
        for(int i=1;i<=n+n;i++){
            if(i%2==0){
                even+=i;
            }
            else{
                odd+=i;
            }
        }
        // System.out.print(odd);
        // System.out.print(even);
        return gcd(odd,even);
        
        
    }
}