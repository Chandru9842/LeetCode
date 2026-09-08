class Solution {
    public String countAndSay(int n) {

        String a = "1";

        for(int x = 1; x < n; x++) {

            StringBuilder ans = new StringBuilder();

            for(int i = 0; i < a.length(); ) {

                char ch = a.charAt(i);
                int cnt = 0;

                while(i < a.length() && a.charAt(i) == ch) {
                    cnt++;
                    i++;
                }

                ans.append(cnt);
                ans.append(ch);
            }

            a = ans.toString();
        }

        return a;
    }
}