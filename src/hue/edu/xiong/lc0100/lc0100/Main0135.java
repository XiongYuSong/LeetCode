package hue.edu.xiong.lc0100.lc0100;

/**
 * @author Xiong YuSong
 * @date 2020/12/24
 */
public class Main0135 {
    int[] ans;

    public static void main(String[] args) {
        System.out.println(new Main0135().candy(new int[]{3, 2, 2, 3, 2, 3, 1, 5, 9, 4, 1}));
//        2 1 1 2 1 2 1 2 3 2 1
    }

    public int candy(int[] ratings) {
        int length = ratings.length;
        ans = new int[length];
        for (int i = 0; i < length; i++) {
            if (i != 0 && ratings[i] > ratings[i - 1]) {
                continue;
            }
            check(i, ratings, 0, length - 1);
        }
        for (int i = length - 1; i >= 0; i--) {
            if (i != 0 && ratings[i] > ratings[i - 1]) {
                continue;
            }
            check(i, ratings, 0, length - 1);
        }

        int count = 0;
        for (int num : ans) {
            count += num;
        }
        return count;
    }

    private void check(int i, int[] ratings, int left, int right) {
        if (i == left) {
            if (ratings[i + 1] >= ratings[i]) {
                ans[i] = 1;
            } else if (ans[i + 1] != 0) {
                ans[i] = ans[i + 1] + 1;
            }
            return;
        }
        if (i == right) {
            if (ratings[i - 1] >= ratings[i]) {
                ans[i] = 1;
            } else if (ans[i - 1] != 0) {
                ans[i] = ans[i - 1] + 1;
            }
            return;
        }
        if (ratings[i + 1] >= ratings[i] && ratings[i - 1] >= ratings[i]) {
            ans[i] = 1;
        } else if (ratings[i + 1] < ratings[i] && ratings[i - 1] < ratings[i]) {
            ans[i] = Math.max(ans[i - 1], ans[i + 1]) + 1;
        } else if (ratings[i + 1] < ratings[i]) {
            ans[i] = ans[i + 1] + 1;
        } else {
            ans[i] = ans[i - 1] + 1;
        }
    }
}
