public class LongestIncreasingSubSeuence {
    public static int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int maxlen=1;
        int dp[]=new int[n];
        dp[0]=1;
        for(int i=1;i<n;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            maxlen=Math.max(maxlen,dp[i]);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}
