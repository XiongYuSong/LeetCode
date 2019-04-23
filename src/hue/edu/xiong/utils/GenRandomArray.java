package hue.edu.xiong.utils;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/22
 */
public class GenRandomArray {

    public static int[] generateRandomArray(int size, int value) {
        //产生的数组长度是size
        int[] arr = new int[size];
        //产生的数组中的数的范围是-value ~ value
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((value + 1) * Math.random()
                    - (int) (value * Math.random()));
        }
        return arr;
    }

    //判断两个数组是否相等
    public static boolean isEqual(int[] arr1, int[] arr2) {
        if((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null))
            return false;
        if(arr1 == null && arr2 == null)
            return true;
        if(arr1.length != arr2.length)
            return false;
        for(int i = 0;i < arr1.length;i++) {
            if(arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
}
