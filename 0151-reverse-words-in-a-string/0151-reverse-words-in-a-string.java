
class Solution {
    // public String reverseWords(String s1) {
    //     // String[]ans=new String[s.length()];
    //     String[]words=s1.trim().split("\s+");
    //     String[]ans=new String[words.length];
    //     String ans1="";
    //     int j=0;
    //     for(int i=words.length-1;i>=0;i--){
    //         ans[j]=words[i];
    //         ans1+=ans[j]+" ";
    //         j++;
    //     }
    //     return ans1.trim();
        
    // }
     public String reverseWords(String s1) {
        s1=s1.trim();
        String[]words=s1.split("\\s+");
        StringBuilder ans=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            ans.append(words[i]);
            if(i!=0){
                ans.append(" ");
            }
        }
         return  ans.toString();

     }
    
}

// Ahhh okay Chand 😄
// You’re asking only about these two:

// trim()
// split("\\s+")

// Let’s focus only on them clearly 👇

// ✅ 1️⃣ trim() – What Exactly It Does?
// s.trim()
// 🔹 Removes:

// Spaces at the beginning

// Spaces at the end

// 🔹 Does NOT remove:

// Spaces between words

// Example
// String s = "   hello   world   ";
// System.out.println(s.trim());
// Output:
// "hello   world"

// 👉 Middle spaces remain.

// ✅ 2️⃣ split("\\s+") – What It Does?
// s.split("\\s+")

// It breaks the string into words.

// 🔍 Breakdown of "\\s+"
// Part	Meaning
// \s	any whitespace (space, tab, newline)
// +	one or more
// \\	escape for Java

// So:

// \\s+

// means:

// Split wherever there are one or more spaces.

// Example
// String s = "hello     world   java";
// String[] words = s.split("\\s+");

// Output:

// ["hello", "world", "java"]

// Even if there are many spaces, it treats them as one separator.

// 🔥 Why We Use Both Together?
// s.trim().split("\\s+")
// Step 1 → trim()

// Removes outer spaces.

// Step 2 → split("\\s+")

// Breaks words properly.

// Full Example
// String s = "   hello   world   java   ";
// String[] words = s.trim().split("\\s+");

// Final result:

// ["hello", "world", "java"]

// No empty strings ✅
// No extra spaces ✅

// 🎯 Simple One-Line Meaning

// trim() → cleans outside spaces

// split("\\s+") → separates words properly