package hue.edu.xiong.lc0000.lc0050;

/**
 * @Author Xiong YuSong
 * @Date 2019/6/23
 */
public class Main0088 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        m--;
        n--;
        while (m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n]) {
                nums1[index--] = nums1[m--];
            } else {
                nums1[index--] = nums2[n--];
            }
        }
        while (m >= 0) {
            nums1[index--] = nums1[m--];
        }
        while (n >= 0) {
            nums1[index--] = nums2[n--];
        }
    }
}
