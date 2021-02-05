package hue.edu.xiong.lc0000.lc0000;

/**
 * @author Xiong YuSong
 * @date 2020/08/26
 */
public class Main0029 {
    public static void main(String[] args) {
//        System.out.println(new Main0029().divide(-2147483648, 2));//-1073741824
        System.out.println(new Main0029().divide(10, 3));//3
    }

    public int divide(int dividend, int divisor) {
        int ans = 0;
        int flag = 1;
        if (dividend > 0) {
            flag = opposite(flag);
            dividend = opposite(dividend);
        }
        if (divisor > 0) {
            flag = opposite(flag);
            divisor = opposite(divisor);
        }

        if (dividend > divisor) {
            return 0;
        }
        //第一次减一，第二次也是减一，然后再减去两倍的divisor
        int originDivisor = divisor;
        dividend -= divisor;
        ans -= 1;
        while (dividend <= divisor) {
            dividend -= divisor;
            divisor += divisor;
            ans += ans;
        }
        /// 这个时候肯定是两个负进去的，返回的也是个正数，我们这个时候ans是负数
        ans -= divide(dividend, originDivisor);
        if (ans == Integer.MIN_VALUE) {
            if (flag == 1) {
                return Integer.MAX_VALUE;
            } else {
                return Integer.MIN_VALUE;
            }
        } else {
            if (flag == 1) {
                return opposite(ans);
            } else {
                return ans;
            }
        }
    }

    public int opposite(int x) {
        return ~x + 1;
    }

//        int ans = -1;
//        int sign = 1;
//        if (dividend > 0) {
//            sign = opposite(sign);
//            dividend = opposite(dividend);
//        }
//        if (divisor > 0) {
//            sign = opposite(sign);
//            divisor = opposite(divisor);
//        }
//
//        int origin_dividend = dividend;
//        int origin_divisor = divisor;
//        if (dividend > divisor) {
//            return 0;
//        }
//
//        dividend -= divisor;
//        while (divisor >= dividend) {
//            ans = ans + ans;
//            divisor += divisor;
//            dividend -= divisor;
//        }
//        //此时我们传进的是两个负数，正常情况下，它就返回正数，但我们是在用负数累加，所以要取相反数
//        int a = ans + opposite(divide(origin_dividend - divisor, origin_divisor));
//        if (a == Integer.MIN_VALUE) {
//            if (sign > 0) {
//                return Integer.MAX_VALUE;
//            } else {
//                return Integer.MIN_VALUE;
//            }
//        } else {
//            if (sign > 0) {
//                return opposite(a);
//            } else {
//                return a;
//            }
//        }
//    }


}
