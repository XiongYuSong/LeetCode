package hue.edu.xiong.lc0000.lc0050;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/16
 */
public class Main0074 {

    public static void main(String[] args) {

    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows * cols - 1;
        while (left < right) {
            int mid = left + right >> 1;
            if (matrix[mid / cols][mid % cols] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return matrix[left / cols][left % cols] == target ? true : false;
    }
}
