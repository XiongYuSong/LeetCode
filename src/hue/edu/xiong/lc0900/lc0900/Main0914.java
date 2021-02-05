package hue.edu.xiong.lc0900.lc0900;
/**
 * //给定一副牌，每张牌上都写着一个整数。
 * //
 * // 此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：
 * //
 * //
 * // 每组都有 X 张牌。
 * // 组内所有的牌上都写着相同的整数。
 * //
 * //
 * // 仅当你可选的 X >= 2 时返回 true。
 * //
 * //
 * //
 * // 示例 1：
 * //
 * // 输入：[1,2,3,4,4,3,2,1]
 * //输出：true
 * //解释：可行的分组是 [1,1]，[2,2]，[3,3]，[4,4]
 * //
 * //
 * // 示例 2：
 * //
 * // 输入：[1,1,1,2,2,2,3,3]
 * //输出：false
 * //解释：没有满足要求的分组。
 * //
 * //
 * // 示例 3：
 * //
 * // 输入：[1]
 * //输出：false
 * //解释：没有满足要求的分组。
 * //
 * //
 * // 示例 4：
 * //
 * // 输入：[1,1]
 * //输出：true
 * //解释：可行的分组是 [1,1]
 * //
 * //
 * // 示例 5：
 * //
 * // 输入：[1,1,2,2,2,2]
 * //输出：true
 * //解释：可行的分组是 [1,1]，[2,2]，[2,2]
 * //
 * //
 * //
 * //提示：
 * //
 * //
 * // 1 <= deck.length <= 10000
 * // 0 <= deck[i] < 10000
 * //
 * //
 * //
 * // Related Topics 数组 数学
 */

/**
 * @author Xiong YuSong
 * @date 2020/06/22
 */
public class Main0914 {
    public static void main(String[] args) {
        System.out.println(new Main0914().hasGroupsSizeX(new int[]{1, 2, 3, 4, 4, 3, 2, 1}));
    }

    public boolean hasGroupsSizeX(int[] deck) {
        int[] arr = new int[10000];
        for (int i = 0; i < deck.length; i++) {
            arr[deck[i]] += 1;
        }
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                minValue = Math.min(arr[i], minValue);
            }
        }
        for (int i = 2; i <= minValue; i++) {
            if (minValue % i == 0) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] != 0) {
                        if (arr[j] % i != 0) {
                            break;
                        }
                    }
                    if (j + 1 == arr.length) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
