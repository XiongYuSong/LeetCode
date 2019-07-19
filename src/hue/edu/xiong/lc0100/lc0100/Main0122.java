package hue.edu.xiong.lc0100.lc0100;

public class Main0122 {

    public static void main(String[] args) {
    }

//    public static int maxProfit(int[] prices) {
//        int ans = 0;
//        int min = 0;//表示没有买入股票
//        for (int i = 0; i < prices.length; i++) {
//            if (i == prices.length - 1) break;
//            if (prices[i] <= prices[i + 1]) {
//                if (min == 0) {
//                    min = prices[i];
//                }
//            } else {
//                if (min != 0) {
//                    ans = prices[i] - min;
//                    min = 0;
//                }
//            }
//        }
//        return ans;
//    }


    public int maxProfit(int[] prices) {
        int ans = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] <= prices[i]) {
                ans += prices[i] - prices[i - 1];
            }
        }
        return ans;
    }
}
