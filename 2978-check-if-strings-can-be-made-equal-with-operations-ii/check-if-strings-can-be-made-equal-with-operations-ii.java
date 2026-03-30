class Solution {
    // public boolean swap(int i,int j,char[] s1,char[] s2){
    //     char temp=s1[i];
    //     s1[i]=s1[j];
    //     s1[j]=temp;
    //     if(Arrays.equals(s1,s2)){
    //         return true;
    //     }
    //     temp=s1[i];
    //     s1[i]=s1[j];
    //     s1[j]=temp;
    //    return false;
      

    // }
    public boolean checkStrings(String s1, String s2) {
        // if(s1.length()!=s2.length()){
        //     return false;
        // }
        // char []a=s1.toCharArray();
        // char[]b=s2.toCharArray();
        // if(Arrays.equals(a,b)){
        //     return true;
        // }
        // for(int i=0;i<s1.length();i+=2){
        //     for(int j=i+2;j<s1.length();j+=2){
        //         if(swap(i,j,a,b)){
        //         return true;
        //         }

        //     }

        // }
        // for(int i=1;i<s1.length();i+=2){
        //     for(int j=i+2;j<s1.length();j+=2){
        //         if(swap(i,j,a,b));
        //         return true;

        //     }
        // }
        // return false;
        char[]even=new char[(s1.length()+1/2)];
        char[]even1=new char[(s2.length()+1/2)];
        char[]odd=new char[s1.length()/2];
        char[]odd1=new char[s2.length()/2];

        int e=0,e1=0,o=0,o1=0;
        for(int i=0;i<s1.length();i++){
            if(i%2==0){
                even[e++]=s1.charAt(i);
                even1[e1++]=s2.charAt(i);
            }
            else{
                odd[o++]=s1.charAt(i);
                odd1[o1++]=s2.charAt(i);
            }
        }
        Arrays.sort(even);
        Arrays.sort(even1);
        Arrays.sort(odd);
        Arrays.sort(odd1);
        if(Arrays.equals(even,even1)&&Arrays.equals(odd,odd1)){
            return true;
        }
        return false;







        
    }
}