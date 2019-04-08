package hue.edu.xiong.lc0000.lc0050;

public class Main0059 {
    public static void main(String[] args) {

    }

    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int c = 1, j = 0;
        int num = (int) Math.pow(n, 2);
        //从1开始放到n^2
        while (c <= num) {
            //因为是正方形，所以从（0,0）开始遍历一周，然后（1,1）开始遍历一周
            for (int i = j; i < n - j; i++)
                arr[j][i] = c++;
            for (int i = j + 1; i < n - j; i++)
                arr[i][n - j - 1] = c++;
            for (int i = n - j - 2; i >= j; i--)
                arr[n - j - 1][i] = c++;
            for (int i = n - j - 2; i > j; i--)
                arr[i][j] = c++;
            j++;
        }
        return arr;
    }
}
