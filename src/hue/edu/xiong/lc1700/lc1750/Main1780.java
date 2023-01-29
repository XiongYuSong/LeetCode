package hue.edu.xiong.lc1700.lc1750;

/**
 * @author xiongyusong
 */
public class Main1780 {
    public static void main(String[] args) {
        System.out.println(new Main1780().checkPowersOfThree(1));
    }

    static int[] arr = new int[]{1, 3, 9, 27, 81, 243, 729, 2187, 6561, 19683, 59049, 177147, 531441, 1594323, 4782969};

    public boolean checkPowersOfThree(int n) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (n >= arr[i]) {
                n -= arr[i];
            }
        }
        return n == 0;
    }
}
