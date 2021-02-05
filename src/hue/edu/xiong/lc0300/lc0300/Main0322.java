package hue.edu.xiong.lc0300.lc0300;

/**
 * //给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回
 * // -1。
 * //
 * //
 * //
 * // 示例 1:
 * //
 * // 输入: coins = [1, 2, 5], amount = 11
 * //输出: 3
 * //解释: 11 = 5 + 5 + 1
 * //
 * // 示例 2:
 * //
 * // 输入: coins = [2], amount = 3
 * //输出: -1
 * //
 * //
 * //
 * // 说明:
 * //你可以认为每种硬币的数量是无限的。
 * // Related Topics 动态规划
 */

/**
 * @author Xiong YuSong
 * @date 2020/06/13
 */
public class Main0322 {
    public static void main(String[] args) {
        System.out.println(new Main0322().coinChange(new int[]{2}, 4));
    }

//    public int coinChange(int[] coins, int amount) {
//        if (amount == 0) {
//            return 0;
//        }
//        int[] dp = new int[amount + 1];
//        for (int i = 0; i < coins.length; i++) {
//            if (coins[i] <= amount) {
//                dp[coins[i]] = 1;
//            }
//        }
//        for (int i = 1; i <= amount; i++) {
//            for (int j = 0; j < coins.length; j++) {
//                if (i - coins[j] > 0 && dp[i - coins[j]] != 0) {
//                    if (dp[i] == 0) {
//                        dp[i] = dp[i - coins[j]] + 1;
//                    } else {
//                        dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
//                    }
//                }
//            }
//        }
//        return dp[amount] == 0 ? -1 : dp[amount];
//    }

    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        int[] dp = new int[amount + 1];
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                dp[coins[i]] = 1;
            }
        }
        for (int i = 1; i <= amount; i++) {
            if (dp[i] == 0) {
                continue;
            }
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= amount - i) {
                    if (dp[i + coins[j]] == 0) {
                        dp[i + coins[j]] = dp[i] + 1;
                    } else {
                        dp[i + coins[j]] = Math.min(dp[i + coins[j]], dp[i] + 1);
                    }
                }
            }
        }
        return dp[amount] == 0 ? -1 : dp[amount];
    }
}
