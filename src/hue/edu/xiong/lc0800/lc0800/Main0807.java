package hue.edu.xiong.lc0800.lc0800;

public class Main0807 {
    public static void main(String[] args) {

    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        //每行最高建筑
        int[] rowsHeight = new int[grid.length];
        //每列最高建筑
        int[] colsHeight = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                rowsHeight[i] = grid[i][j] > rowsHeight[i] ? grid[i][j] : rowsHeight[i];
                colsHeight[j] = grid[i][j] > colsHeight[j] ? grid[i][j] : colsHeight[j];
            }
        }
        int ans = 0;
        int currMinHeight;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                //找出当前最小高度
                currMinHeight = rowsHeight[i] > colsHeight[j] ? colsHeight[j] : rowsHeight[i];
                ans += grid[i][j] - currMinHeight;
            }
        }
        return ans;
    }
}
