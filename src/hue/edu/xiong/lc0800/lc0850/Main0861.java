package hue.edu.xiong.lc0800.lc0850;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/13
 */
public class Main0861 {

    public static void main(String[] args) {

    }

    public int matrixScore(int[][] A) {
        //有多少行
        int rows = A.length;
        //多少列
        int cols = A[0].length;
        int ans = 0;
        //第一次按照行循环，对A[i][0]位置的数查看，如果不为1则进行变换
        for (int i = 0; i < rows; i++) {
            if (A[i][0] != 1) {
                for (int j = 0; j < cols; j++) {
                    A[i][j] = A[i][j] == 0 ? 1 : 0;
                }
            }
        }
        //这个时候按列循环，查看每列的1的个数
        int count = 0;
        for (int j = 0; j < cols; j++) {
            count = 0;
            for (int i = 0; i < rows; i++) {
                if (A[i][j] == 1) {
                    count++;
                }
            }
            //这个时候查看是0多还是1多
            count = Math.max(count, rows - count);
            ans += count * Math.pow(2, (cols - 1 - j));
        }
        return ans;
    }

}
