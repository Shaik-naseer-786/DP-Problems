public class TriangleMinSum {
    public static int minimumPathSum(int[][] triangle, int n) {
        // Write your code here.
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            dp[n-1][i]=triangle[n-1][i];

        }
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                dp[i][j]=triangle[i][j]+Math.min(dp[i+1][j],dp[i+1][j+1]);
            }
        }
        return dp[0][0];
    }
    public static void main(String[] args) {
        System.out.println(minimumPathSum(new int[][]{{2},{3,4},{6,5,7},{4,1,8,3}}, 4));
    }
}
