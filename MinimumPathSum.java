public class MinimumPathSum {
    public static int minSumPath(int[][] grid) {
        // Write your code here.
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] dp = new int[rows][cols];
        return helper(grid, 0, 0, dp);

    }

    private static int helper(int[][] grid, int r, int c, int[][] dp) {
        if (r == grid.length - 1 && c == grid[0].length-1) {
            return grid[r][c];
        }
        if (r >= grid.length || c >= grid[0].length) {
            return Integer.MAX_VALUE;
        }
        if (dp[r][c] != 0) {
            return dp[r][c];
        }
        int right = helper(grid, r, c + 1, dp);
        int down = helper(grid, r + 1, c, dp);

        int res = Math.min(right, down) + grid[r][c];
        dp[r][c] = res;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(minSumPath(new int[][] { { 5, 9, 6 }, { 11, 5, 2 } }));
    }
}
