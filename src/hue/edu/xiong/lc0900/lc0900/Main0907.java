package hue.edu.xiong.lc0900.lc0900;

public class Main0907 {

    public int sumSubarrayMins(int[] arr) {
        int mod = 1000000007;
        long answer = 0;
        int left = 0;
        long currPeriodAnswer = 0;
        for (; left < arr.length; left++) {
            int right = left;
            int currMin = arr[left];
            if (currPeriodAnswer != 0) {
                // 这里判断上个周期是否满足当前周期的计算数量
                if (arr[left] < arr[left - 1]) {
                    currPeriodAnswer -= arr[left - 1];
                    answer += currPeriodAnswer;
                    continue;
                }
            }
            currPeriodAnswer = 0;
            for (; right < arr.length; right++) {
                if (currMin > arr[right]) {
                    currMin = arr[right];
                }
                currPeriodAnswer += currMin;
            }
            answer += currPeriodAnswer;
        }
        return (int) (answer % mod);
    }
}
