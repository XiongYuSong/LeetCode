package hue.edu.xiong.lc0300.lc0300;

public class Main0338 {
    public static void main(String[] args) {

    }

    public int[] countBits(int num) {
        int[] ans = new int[num + 1];
        int min = 1;
        int max = 2;
        for (int i = 1; i <= num; i++) {
            if (i >= max) {
                min <<= 1;
                max <<= 1;
            }
            ans[i] = ans[i - min] + 1;
        }
        return ans;
    }
}
