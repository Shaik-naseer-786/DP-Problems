import java.util.Arrays;

public class UniquePath {
    public static void main(String[] args) {
        // System.out.println(path(3, 3));
        int[][] dp=new int[4][8];
        for(int[] a:dp){
        Arrays.fill(a, -1);
        }
        System.out.println(path(3, 7, dp));

    }

    public static int path(int r, int c, int[][] dp) {
        if (r == 1 || c == 1) {
            return 1;
        }
        if (dp[r][c] != -1) {
            return dp[r][c];
        }
        int down = path(r - 1, c, dp);
        // System.out.println(down,dp);
        int right = path(r, c - 1, dp);
        return dp[r][c] = down + right;
    }
}
