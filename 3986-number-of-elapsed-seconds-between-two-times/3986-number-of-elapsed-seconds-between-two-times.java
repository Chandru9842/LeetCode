class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String str1[]=startTime.split(":");
        String str2[]=endTime.split(":");
        int cnt=0;
        int cnt1=0;
        cnt+=Integer.parseInt(str1[0])*60*60;
        cnt+=Integer.parseInt(str1[1])*60;
        cnt+=Integer.parseInt(str1[2]);
        cnt1+=Integer.parseInt(str2[0])*60*60;
        cnt1+=Integer.parseInt(str2[1])*60;
        cnt1+=Integer.parseInt(str2[2]);
        int ans=cnt1-cnt;
        return ans;
        
    }
}