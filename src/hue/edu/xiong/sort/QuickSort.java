package hue.edu.xiong.sort;

import hue.edu.xiong.utils.GenRandomArray;

import java.util.Arrays;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/23
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = GenRandomArray.generateRandomArray(100, 2000);
        int[] ret = new int[100];
        System.arraycopy(arr, 0, ret, 0, 100);
        quickSort(arr, 0, arr.length - 1);
        Arrays.sort(ret);
        System.out.println("排序是否成功：" + GenRandomArray.isEqual(arr, ret));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ret));
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int l = left;
        int r = right;
        int num = arr[left];
        while (l < r) {
            while (l < r && arr[r] > num) {
                r--;
            }
            arr[l] = arr[r];
            while (l < r && arr[l] <= num) {
                l++;
            }
            arr[r] = arr[l];
        }
        arr[l] = num;
        quickSort(arr, left, l - 1);
        quickSort(arr, l + 1, right);
    }
}
