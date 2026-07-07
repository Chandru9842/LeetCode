class Solution {
    String reverse(String nonzeros){
        String rev="";
        for(int i=nonzeros.length()-1;i>=0;i--){
            rev+=nonzeros.charAt(i);
        }
        return rev;
    }
    public long sumAndMultiply(int n) {
        int temp=n;
        String nonzeros="";
        long sum=0;
        while(temp!=0){
            int last=temp%10;
            if(last!=0){
                nonzeros+=last;
                sum+=last;

            }
            temp=temp/10;
        }
        System.out.println(nonzeros);
        String a1=reverse(nonzeros);
        long ans=0;
        for(int i=0;i<a1.length();i++){
            char ch=a1.charAt(i);
            ans+=ch-'0';
            ans*=10;

        }
        ans=ans/10;
        // System.out.println(ans);
        // reverse(ans);
        return ans*sum;
        
    }
}