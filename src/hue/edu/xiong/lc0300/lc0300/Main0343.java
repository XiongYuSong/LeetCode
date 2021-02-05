package hue.edu.xiong.lc0300.lc0300;

/**
 * @author Xiong YuSong
 * @date 2020/07/30
 */
public class Main0343 {
    public static void main(String[] args) {
        System.out.println(new Main0343().integerBreak(10));
    }

    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i < n + 1; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], (dp[j] <= j ? j : dp[j]) * (i - j));
            }
        }
        return dp[n];
    }
}
