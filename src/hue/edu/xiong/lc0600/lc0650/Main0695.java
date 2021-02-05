package hue.edu.xiong.lc0600.lc0650;
/**
 * //给定一个包含了一些 0 和 1 的非空二维数组 grid 。
 * //
 * // 一个 岛屿 是由一些相邻的 1 (代表土地) 构成的组合，这里的「相邻」要求两个 1 必须在水平或者竖直方向上相邻。你可以假设 grid 的四个边缘都被
 * //0（代表水）包围着。
 * //
 * // 找到给定的二维数组中最大的岛屿面积。(如果没有岛屿，则返回面积为 0 。)
 * //
 * //
 * //
 * // 示例 1:
 * //
 * // [[0,0,1,0,0,0,0,1,0,0,0,0,0],
 * // [0,0,0,0,0,0,0,1,1,1,0,0,0],
 * // [0,1,1,0,1,0,0,0,0,0,0,0,0],
 * // [0,1,0,0,1,1,0,0,1,0,1,0,0],
 * // [0,1,0,0,1,1,0,0,1,1,1,0,0],
 * // [0,0,0,0,0,0,0,0,0,0,1,0,0],
 * // [0,0,0,0,0,0,0,1,1,1,0,0,0],
 * // [0,0,0,0,0,0,0,1,1,0,0,0,0]]
 * //
 * //
 * // 对于上面这个给定矩阵应返回 6。注意答案不应该是 11 ，因为岛屿只能包含水平或垂直的四个方向的 1 。
 * //
 * // 示例 2:
 * //
 * // [[0,0,0,0,0,0,0,0]]
 * //
 * // 对于上面这个给定的矩阵, 返回 0。
 * //
 * //
 * //
 * // 注意: 给定的矩阵grid 的长度和宽度都不超过 50。
 * // Related Topics 深度优先搜索 数组
 */

/**
 * @author Xiong YuSong
 * @date 2020/06/18
 */
public class Main0695 {
    public static void main(String[] args) {
        System.out.println(new Main0695().maxAreaOfIsland(new int[][]{{1, 1, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 1, 1}, {0, 0, 0, 1, 1}}));
    }
    int ans = 0;
    int count = 0;

    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null) {
            return 0;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    //这里去染色地图
                    dfs(grid, i, j);
                    //染色完操作
                    ans = Math.max(ans, count);
                    count = 0;
                }
            }
        }
        return ans;
    }

    private void dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0 ) {
            return;
        }
        grid[i][j] = 0;
        count++;
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
    //定义一个矩形记录是否染色，避免重复计算
}
