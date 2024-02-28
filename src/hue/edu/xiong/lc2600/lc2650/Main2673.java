package hue.edu.xiong.lc2600.lc2650;

public class Main2673 {
    public static void main(String[] args) {
        System.out.println(new Main2673().minIncrements(7,new int[]{1,5,2,2,3,3,1}));
    }
    public int minIncrements(int n, int[] cost) {
        int[] nums = new int[n / 2 + 1];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int costIndex = i + n / 2 + 1;
            while (costIndex > 1) {
                nums[i] += cost[costIndex - 1];
                costIndex /= 2;
            }
            nums[i] += cost[costIndex - 1];
            max = Math.max(max, nums[i]);
        }
        System.out.println();
        return fun(nums, max, 0, nums.length - 1);
        // 先称为一个叶子阶段数字的数组 nums
        // 然后获取最大值
        // 先处理 [0 - n / 2] 的数据，然后再处理 [n / 2+1 , n] 的数据 0-3，4-7，则增加x值使得数组中最大的值等于最大值
        // 一直到 最后一个值，计算x的总数，并且返回
    }

    private int fun(int[] nums, int max, int l, int r) {
        if (l == r) {
            return max - nums[l];
        }
        int currMax = Integer.MIN_VALUE;
        for (int i = l; i <= r; i++) {
            currMax = Math.max(currMax, nums[i]);
        }
        int mid = (l + r) / 2;
        return fun(nums, currMax, l, mid) + fun(nums, currMax, mid + 1, r) + max - currMax;
    }
}
