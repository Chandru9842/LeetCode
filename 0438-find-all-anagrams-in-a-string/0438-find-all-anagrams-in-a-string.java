class Solution {
    // public static boolean isanagram(char[] a1,char[] b1){
    // //     if (a1.length != b1.length) {
    // //         return false;
    // //         }
    // //     // char[]a=a1.toCharArray();
    // //     // char[]b=b1.toCharArray();
    // //     // Arrays.sort(a);
    // //     // Arrays.sort(b);
    // //     for(int i=0;i<a1.length;i++){
    // //         if(a1[i]!=b1[i]){
    // //             return false;
    // //         }
    // //     }
    // //     return true;
    // // }
    public List<Integer> findAnagrams(String s, String p) {
    //     ArrayList<Integer>ans=new ArrayList<>();
    //     int l=0;
    //     String sum="";
    //     char[]a=p.toCharArray();
    //     for(int r=0;r<s.length();r++){
    //         sum+=s.charAt(r);
    //         if(r-l+1==p.length()){
    //             char[]b=sum.toCharArray();
    //             Arrays.sort(b);
    //             Arrays.sort(a);
    //             if(isanagram(a,b)){
    //                 ans.add(l);
                
    //             }
    //             sum=sum.substring(1);
    //             l++;
    //         }
    //     }
    //     return ans;
        

    



    int l=0;
    ArrayList<Integer>ans=new ArrayList<>();
    int[]hashp=new int[26];
    int[]hashs=new int[26];
    for(int i=0;i<p.length();i++){
        hashp[p.charAt(i)-'a']++;
    }
    for(int r=0;r<s.length();r++){
        hashs[s.charAt(r)-'a']++;
      
        if(r-l+1>p.length()){
            hashs[s.charAt(l)-'a']--;
            l++;
        }
          if(r-l+1==p.length()){
            if(Arrays.equals(hashs,hashp)){
                ans.add(l);
            }
        }

    }
    return ans;

    }
}