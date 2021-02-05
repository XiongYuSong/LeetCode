package hue.edu.xiong.lc0900.lc0950;
/**
 * //在给定的网格中，每个单元格可以有以下三个值之一：
 * //
 * //
 * // 值 0 代表空单元格；
 * // 值 1 代表新鲜橘子；
 * // 值 2 代表腐烂的橘子。
 * //
 * //
 * // 每分钟，任何与腐烂的橘子（在 4 个正方向上）相邻的新鲜橘子都会腐烂。
 * //
 * // 返回直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1。
 * //
 * //
 * //
 * // 示例 1：
 * //
 * //
 * //
 * // 输入：[[2,1,1],[1,1,0],[0,1,1]]
 * //输出：4
 * //
 * //
 * // 示例 2：
 * //
 * // 输入：[[2,1,1],[0,1,1],[1,0,1]]
 * //输出：-1
 * //解释：左下角的橘子（第 2 行， 第 0 列）永远不会腐烂，因为腐烂只会发生在 4 个正向上。
 * //
 * //
 * // 示例 3：
 * //
 * // 输入：[[0,2]]
 * //输出：0
 * //解释：因为 0 分钟时已经没有新鲜橘子了，所以答案就是 0 。
 * //
 * //
 * //
 * //
 * // 提示：
 * //
 * //
 * // 1 <= grid.length <= 10
 * // 1 <= grid[0].length <= 10
 * // grid[i][j] 仅为 0、1 或 2
 * //
 * // Related Topics 广度优先搜索
 */

import java.util.LinkedList;

/**
 * @author Xiong YuSong
 * @date 2020/07/01
 */
public class Main0994 {
    public static void main(String[] args) {
//        [[2,1,1],[1,1,0],[0,1,1]]
        System.out.println(new Main0994().orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}));
    }

    int count = 0;

    class DoubleNumber {
        int a;
        int b;

        public DoubleNumber(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public int orangesRotting(int[][] grid) {
        LinkedList<DoubleNumber> queue = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    count++;
                } else if (grid[i][j] == 2) {
                    queue.add(new DoubleNumber(i, j));
                }
            }
        }
        if (count == 0) {
            return 0;
        }
        int ans = 0;
        while (queue.size() != 0) {
            int index = queue.size();
            for (int i = 0; i < index; i++) {
                DoubleNumber doubleNumber = queue.pop();
                func(doubleNumber.a + 1, doubleNumber.b, grid, queue);
                func(doubleNumber.a, doubleNumber.b + 1, grid, queue);
                func(doubleNumber.a - 1, doubleNumber.b, grid, queue);
                func(doubleNumber.a, doubleNumber.b - 1, grid, queue);
            }
            ans++;
        }
        return count == 0 ? ans - 1 : -1;
    }

    private void func(int i, int j, int[][] grid, LinkedList<DoubleNumber> queue) {
        if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 1) {
            grid[i][j] = 2;
            queue.add(new DoubleNumber(i, j));
            count--;
        }
    }
}
