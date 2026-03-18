package hue.edu.xiong;

import java.util.*;

public class Main {


    public static void main(String[] args) {
//        [0,1,0,2,1,0,1,3,2,1,2,1]
//        System.out.println(new Main().trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
//        new Main().moveZeroes(new int[]{0, 1, 0, 3, 12});
        new Main().lengthOfLongestSubstring("abba");
    }

    public int lengthOfLongestSubstring(String s) {
        // a = 65+32 = 97 A = 65
        if (s.isEmpty()) {
            return 0;
        }
        // 上一个字符的位置
        int[] arr = new int[128];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        int ans = 0;
        int left = 0;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (arr[ch] > -1 && )


        }

    }


    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int leftIndex = i + 1;
            int rightIndex = nums.length - 1;
            int target = -nums[i];
            while (leftIndex < rightIndex) {
                if (nums[leftIndex] + nums[rightIndex] > target) {
                    rightIndex--;
                } else if (nums[leftIndex] + nums[rightIndex] < target) {
                    leftIndex++;
                } else {
                    ans.add(Arrays.asList(nums[i], nums[leftIndex], nums[rightIndex]));
                    rightIndex--;
                    leftIndex++;
                }
            }
        }
        return new ArrayList<>(ans);
    }

    public void moveZeroes(int[] nums) {
        int leftIndex = 0;
        int rightIndex = 0;
        while (rightIndex < nums.length) {
            if (nums[rightIndex] != 0) {
                nums[leftIndex] = nums[rightIndex];
                leftIndex++;
            }
            rightIndex++;
        }
        while (leftIndex < nums.length) {
            nums[leftIndex] = 0;
            leftIndex++;
        }
    }

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int ans = 0;
        for (int i = 0; i <= nums.length; i++) {
            int currentNum = nums[i];
            if (!set.contains(currentNum - 1)) {
                int count = 1;
                currentNum++;
                while (set.contains(currentNum)) {
                    count++;
                    currentNum++;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int ans = target - nums[i];
            if (map.containsKey(ans)) {
                return new int[]{i, map.get(ans)};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            }
        }
        return new ArrayList<>(map.values());
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
