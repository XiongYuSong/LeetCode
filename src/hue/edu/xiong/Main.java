package hue.edu.xiong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static final int b = 11;
    static final int c = 11;
    int a = 1;
    class SSS{
        int a2 = a;
    }
    public void fun(){
        a = 2;
    }

    public static void main(String[] args) {
        SSS sss1 = new Main().new SSS();
    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int k = scanner.nextInt();
//        int[] arr = new int[n];
//        //k次数之前，进行数组的一个初始化，这里是+k时间 //这里k必定小于n
//        int num = 0;
//        for (int i = 1; i < k; i++) {
//            num = (num + k) % n;
//            if (arr[num] == 0) {
//                arr[num] = i;
//            }
//        }
//        //初始化第二步，+1时间的一个初始化
//        arr[0] = 0;
//        for (int i = 1; i < k; i++) {
//            if (arr[i] == 0) {
//                arr[i] = Math.min(arr[i - 1] + 1, i);
//            } else {
//                arr[i] = Math.min(arr[i], Math.min(arr[i - 1] + 1, i));
//            }
//        }
//        //到此为止，前k项全部初始化完成，后面就是dp方程
//        for (int i = k; i < arr.length; i++) {
//            arr[i] = Math.min(arr[i - 1], arr[i - k]) + 1;
//        }
//        int ans = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            ans = arr[i] > ans ? arr[i] : ans;
//        }
//        System.out.println(ans);
//    }

//    public static void main(String[] args) {
//        int mod = 1000000007;
//        Scanner scanner = new Scanner(System.in);
//        int k = 100;
//        int ans = 0;
//        for (int i = 0; i < k; i++) {
//            for (int j = 0; j < k; j++) {
//                ans += gcd(i + 1, j + 1);
//                ans %= mod;
//            }
//        }
//        System.out.println(ans);
//    }
//
//    //最大公因数
//    private static int gcd(int i, int j) {
//        int num = 1;
//        while (i % 2 == 0 && j % 2 == 0) {
//            num <<= 1;
//            i = i / 2;
//            j = j / 2;
//        }
//        while (i != j) {
//            //判断哪个数大 i > j
//            if (i < j) {//交换位置
//                i = i ^ j;
//                j = i ^ j;
//                i = i ^ j;
//            }
//            int temp = i - j;
//            i = j;
//            j = temp;
//        }
//        return (i * num) * (i * num);
//    }
}
