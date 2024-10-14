package hue.edu.xiong.lc0200.lc0200;

public class Main0221 {
    public static void main(String[] args) {
        System.out.println(new Main0221().maximalSquare(new char[][]{{'0','1'}}));
    }
    public int maximalSquare(char[][] matrix) {
        int ans = 0;
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = matrix[i][j] == '1' ? 1 : 0;
                    ans = Math.max(ans, dp[i][j]);
                    continue;
                }
                if (matrix[i][j] == '1') {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    ans = Math.max(ans, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return ans * ans;
    }
}
