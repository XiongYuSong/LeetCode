package hue.edu.xiong.sort;

import hue.edu.xiong.utils.GenRandomArray;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/22
 */
public class KMergeSort {
    public static void main(String[] args) {
        int[] arr1 = GenRandomArray.generateRandomArray(100, 2000);
        MergeSort.mergeSort(arr1, 0, arr1.length - 1);
        int[] arr2 = GenRandomArray.generateRandomArray(100, 2000);
        MergeSort.mergeSort(arr2, 0, arr2.length - 1);
        int[] arr3 = GenRandomArray.generateRandomArray(100, 2000);
        MergeSort.mergeSort(arr3, 0, arr3.length - 1);
        int[] arr4 = GenRandomArray.generateRandomArray(100, 2000);
        MergeSort.mergeSort(arr4, 0, arr4.length - 1);
        int[] arr5 = GenRandomArray.generateRandomArray(100, 2000);
        MergeSort.mergeSort(arr5, 0, arr5.length - 1);

        int[] ans = meger(arr1, arr2, arr3, arr4, arr5);

        int[] ret = new int[500];
        System.arraycopy(arr1, 0, ret, 0, 100);
        System.arraycopy(arr2, 0, ret, 100, 100);
        System.arraycopy(arr3, 0, ret, 200, 100);
        System.arraycopy(arr4, 0, ret, 300, 100);
        System.arraycopy(arr5, 0, ret, 400, 100);
        Arrays.sort(ret);
        System.out.println("排序是否成功：" + GenRandomArray.isEqual(ans, ret));
    }

    private static int[] meger(int[] arr1, int[] arr2, int[] arr3, int[] arr4, int[] arr5) {
        int[] ret = new int[arr1.length + arr2.length + arr3.length + arr4.length + arr5.length];
        int l1 = 0;
        int l2 = 0;
        int l3 = 0;
        int l4 = 0;
        int l5 = 0;
        int index = 0;
        PriorityQueue<Integer> head = new PriorityQueue<>();
        head.offer(arr1[l1++]);
        head.offer(arr2[l2++]);
        head.offer(arr3[l3++]);
        head.offer(arr4[l4++]);
        head.offer(arr5[l5++]);
        while (!head.isEmpty()) {
            Integer poll = head.poll();
            ret[index++] = poll;
            if (l1 < arr1.length && poll == arr1[l1 - 1]) {
                head.offer(arr1[l1++]);
                continue;
            }
            if (l2 < arr2.length && poll == arr2[l2 - 1]) {
                head.offer(arr2[l2++]);
                continue;
            }
            if (l3 < arr3.length && poll == arr3[l3 - 1]) {
                head.offer(arr3[l3++]);
                continue;
            }
            if (l4 < arr4.length && poll == arr4[l4 - 1]) {
                head.offer(arr4[l4++]);
                continue;
            }
            if (l5 < arr5.length && poll == arr5[l5 - 1]) {
                head.offer(arr5[l5++]);
                continue;
            }
        }
        return ret;
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {

            int k0 = left;
            int k1 = (right + left) / 5;
            int k2 = (right + left) / 5 * 2;
            int k3 = (right + left) / 5 * 3;
            int k4 = (right + left) / 5 * 4;
            int k5 = right;
            mergeSort(arr, k0, k1);
            mergeSort(arr, k1 + 1, k2);
            mergeSort(arr, k2 + 1, k3);
            mergeSort(arr, k3 + 1, k4);
            mergeSort(arr, k4 + 1, k5);
            meger(arr, k0, k1, k2, k3, k4, k5);

        }

    }

    private static void meger(int[] arr, int k0, int k1, int k2, int k3, int k4, int k5) {
        int[] ret = new int[arr.length];
        int l0 = k0;
        int l1 = k1 + 1;
        int l2 = k2 + 1;
        int l3 = k3 + 1;
        int l4 = k4 + 1;
        int index = k0;
        PriorityQueue<Integer> head = new PriorityQueue<>();
        head.offer(arr[l0++]);
        head.offer(arr[l1++]);
        head.offer(arr[l2++]);
        head.offer(arr[l3++]);
        head.offer(arr[l4++]);
        while (!head.isEmpty()) {
            Integer poll = head.poll();
            ret[index++] = poll;
            if (l0 <= k1 && poll == arr[l0 - 1]) {
                head.offer(arr[l0++]);
            }
            if (l1 <= k2 && poll == arr[l1 - 1]) {
                head.offer(arr[l1++]);
            }
            if (l2 <= k3 && poll == arr[l2 - 1]) {
                head.offer(arr[l2++]);
            }
            if (l3 <= k4 && poll == arr[l3 - 1]) {
                head.offer(arr[l3++]);
            }
            if (l4 <= k5 && poll == arr[l4 - 1]) {
                head.offer(arr[l4++]);
            }
        }
        for (int i = k0; i <= k5; i++) {
            arr[i] = ret[i];
        }
    }
}
