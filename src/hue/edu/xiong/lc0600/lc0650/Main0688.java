package hue.edu.xiong.lc0600.lc0650;

/**
 * @author Xiong YuSong
 * @date 2020/12/09
 */
public class Main0688 {

    public static void main(String[] args) {
        System.out.println(new Main0688().knightProbability(8, 10, 6, 4));
    }

    public double knightProbability(int n, int k, int r, int c) {
        if (r < 0 || r >= n || c < 0 || c >= n) {
            return 0;
        }

        if (k == 0) {
            return 1;
        }

        return (knightProbability(n, k - 1, r - 2, c - 1)
                + knightProbability(n, k - 1, r - 1, c - 2)
                + knightProbability(n, k - 1, r + 1, c - 2)
                + knightProbability(n, k - 1, r + 2, c - 1)

                + knightProbability(n, k - 1, r - 2, c + 1)
                + knightProbability(n, k - 1, r - 1, c + 2)
                + knightProbability(n, k - 1, r + 1, c + 2)
                + knightProbability(n, k - 1, r + 2, c + 1)) / 8.0;
    }
}
