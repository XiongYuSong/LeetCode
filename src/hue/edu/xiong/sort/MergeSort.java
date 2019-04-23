package hue.edu.xiong.sort;

import hue.edu.xiong.utils.GenRandomArray;

import java.util.Arrays;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/22
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = GenRandomArray.generateRandomArray(100, 300);
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) >> 1;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] ret = new int[right - left + 1];
        int p1 = left;
        int p2 = mid + 1;
        int index = 0;
        while (p1 <= mid && p2 <= right) {
            if (arr[p1] < arr[p2]) {
                ret[index++] = arr[p1++];
            } else {
                ret[index++] = arr[p2++];
            }
        }
        while (p1 <= mid) {
            ret[index++] = arr[p1++];
        }
        while (p2 <= right) {
            ret[index++] = arr[p2++];
        }
        for (int i = 0; i < ret.length; i++) {
            arr[i + left] = ret[i];
        }
    }
}
