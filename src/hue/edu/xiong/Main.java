package hue.edu.xiong;

import java.util.Arrays;
import java.util.List;

public class Main {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        // 上一个字符的位置
        int[] arr = new int[128];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        int ans = 1;
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            int index = s.charAt(right);
            int lastCharIndex = arr[index];
            if (lastCharIndex == -1 || lastCharIndex < left) {
                arr[index] = right;
                ans = Math.max(ans, right - left + 1);
            } else {
                arr[index] = right;
                left = lastCharIndex + 1;
            }
            right++;
        }
        return ans;
    }

    public static void main(String[] args) {
//        System.out.println(new Main().lengthOfLongestSubstring("abcabcbb"));
//        Random random = new Random();
//        int[] arr = new int[102];
//        for (int i = 0; i < 10000; i++) {
//            int i1 = (int) (random.nextDouble() * 100);
//            arr[i1] += 1;
//        }
//        System.out.println();
//        System.out.println("Boolean.FALSE.equals(null) : " + Boolean.FALSE.equals(null));;
//        System.out.println("Boolean.FALSE.equals(null) : " + Boolean.FALSE.equals(false));;
//        System.out.println("Boolean.FALSE.equals(null) : " + Boolean.FALSE.equals(true));;
//        System.out.println("Boolean.FALSE.equals(null) : " + Boolean.TRUE.equals(null));;
//        System.out.println("Boolean.FALSE.equals(null) : " + Boolean.TRUE.equals(false));;
//        System.out.println("Boolean.FALSE.equals(null) : " + Boolean.TRUE.equals(true));;
//        System.out.println(new Main().maxScore(Arrays.asList(Arrays.asList(9,5,7,3), Arrays.asList(8,9,6,1), Arrays.asList(6,7,14,3), Arrays.asList(2,5,3,1))));
        System.out.println(new Main().maxScore(Arrays.asList(Arrays.asList(4,3,2), Arrays.asList(3,2,1))));
    }

    public int maxScore(List<List<Integer>> grid) {
        int[][] dp = new int[grid.size()][grid.get(0).size()];
        int ans = -100000;
        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.get(0).size(); j++) {
                if (i == 0 && j == 0) {
                    // 1 <= grid[i][j] <= 105
                    dp[i][j] = -100000;
                } else if (i == 0) {
                    dp[i][j] = funLeft(i, j, dp, grid);
                } else if (j == 0) {
                    dp[i][j] = funUp(i, j, dp, grid);
                } else {
                    dp[i][j] = Math.max(funLeft(i, j, dp, grid), funUp(i, j, dp, grid));
                }
                ans = Math.max(ans, dp[i][j]);
            }
        }
        return ans;
    }

    private int funUp(int i, int j, int[][] dp, List<List<Integer>> grid) {
        int ans = -100000;
        int current = grid.get(i).get(j);
        for (i--; i >= 0; i--) {
            int i1 = current - grid.get(i).get(j);
            int i2 = current - grid.get(i).get(j) + dp[i][j];
            int i3 = Math.max(i1, i2);

            ans = Math.max(i3, ans);
        }
        return ans;
    }

    private int funLeft(int i, int j, int[][] dp, List<List<Integer>> grid) {
        int ans = -100000;
        int current = grid.get(i).get(j);
        for (j--; j >= 0; j--) {
            int i1 = current - grid.get(i).get(j);
            int i2 = current - grid.get(i).get(j) + dp[i][j];
            int i3 = Math.max(i1, i2);

            ans = Math.max(i3, ans);
        }
        return ans;
    }


//    public static void main(String[] args) {
//        // 每100毫秒创建100线程，每个线程创建一个1M的对象，即每100ms申请100M堆空间
//        Executors.newScheduledThreadPool(1).scheduleAtFixedRate(() -> {
//            for (int i = 0; i < 100; i++) {
//                new Thread(() -> {
//                    try {
//                        //  申请1M
//                        byte[] temp = new byte[1024 * 1024];
//                        Thread.sleep(new Random().nextInt(1000)); // 随机睡眠1秒以内
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }).start();
//            }
//        }, 1000, 100, TimeUnit.MILLISECONDS);
//    }

//    public static void main(String[] args) throws ClassNotFoundException {
//        ReentrantLock reentrantLock = new ReentrantLock();
//        AtomicInteger atomicInteger = new AtomicInteger();
//        LongAdder longAdder = new LongAdder();
//        //没有4,和有很多重复的7
//        int[] arr1 = new int[]{1, 2, 3, 5, 6, 7, 7, 7, 7, 8, 9, 10, 11, 13, 14};
//        int target = 7;
//        int index = fun1(arr1, target, 0, arr1.length - 1);
//        System.out.println("下标为: " + index + " ,值为: " + arr1[index]);
//        index = fun2(arr1, target, 0, arr1.length - 1);
//        System.out.println("下标为: " + index + " ,值为: " + arr1[index]);
//    }

    //二分查找法模板一:查找等于或者小于target的最后一个值
    private static int fun2(int[] arr, int target, int l, int r) {
        while (l < r) {
            int mid = (l + r + 1) >> 1;
            if (target < arr[mid]) r = mid - 1;
            else l = mid;
        }
        return l;
    }

    //二分查找法模板二:查找等于或者大于target的第一个值
    private static int fun1(int[] arr, int target, int l, int r) {
        while (l < r) {
            int mid = (l + r) >> 1;
            if (target > arr[mid]) l = mid + 1;
            else r = mid;
        }
        return l;
    }
}
