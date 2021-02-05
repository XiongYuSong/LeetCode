package hue.edu.xiong.lc0400.lc0450;

/**
 * @author Xiong YuSong
 * @date 2020/10/30
 */
public class Main0463 {
//    int ans = 0;
//
//    public int islandPerimeter(int[][] grid) {
//        if (grid == null || grid.length == 0 || grid[0].length == 0)
//            return 0;
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                if (grid[i][j] == 1) {
//                    check(grid, i + 1, j);
//                    check(grid, i - 1, j);
//                    check(grid, i, j + 1);
//                    check(grid, i, j - 1);
//                }
//            }
//        }
//        return ans;
//    }
//
//    private void check(int[][] grid, int i, int j) {
//        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
//            ans++;
//        }
//    }

//    int ans = 0;
//
//    public int islandPerimeter(int[][] grid) {
//        if (grid == null || grid.length == 0 || grid[0].length == 0)
//            return 0;
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                if (grid[i][j] == 1) {
//                    dfs(grid, i, j);
//                    return ans;
//                }
//            }
//        }
//        return ans;
//    }
//
//    private void dfs(int[][] grid, int i, int j) {
//        grid[i][j] = 2;
//        if (island(grid, i + 1, j))//上
//            dfs(grid, i + 1, j);
//        if (island(grid, i - 1, j))//下
//            dfs(grid, i - 1, j);
//        if (island(grid, i, j + 1))//右
//            dfs(grid, i, j + 1);
//        if (island(grid, i, j - 1))//左
//            dfs(grid, i, j - 1);
//    }
//
//    private boolean island(int[][] grid, int i, int j) {
//        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
//            ans++;
//            return false;
//        }
//        if (grid[i][j] == 2) {
//            return false;
//        }
//        return true;
//    }

    int land = 0;
    int border = 0;

    public int islandPerimeter(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;
        int height = grid.length;
        int width = grid[0].length;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (grid[i][j] == 1) {
                    land++;
                    if (i + 1 < height && grid[i + 1][j] == 1)
                        border++;
                    if (j + 1 < width && grid[i][j + 1] == 1)
                        border++;
                }
            }
        }
        return 4 * land - 2 * border;
    }

}
