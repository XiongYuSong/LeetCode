package hue.edu.xiong;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
//        Random random = new Random();
//        int[] arr = new int[102];
//        for (int i = 0; i < 10000; i++) {
//            int i1 = (int) (random.nextDouble() * 100);
//            arr[i1] += 1;
//        }
//        System.out.println();
        System.out.println("Boolean.FALSE.equals(null) : " + Boolean.FALSE.equals(null));;
        System.out.println("Boolean.FALSE.equals(null) : " + Boolean.FALSE.equals(false));;
        System.out.println("Boolean.FALSE.equals(null) : " + Boolean.FALSE.equals(true));;
        System.out.println("Boolean.FALSE.equals(null) : " + Boolean.TRUE.equals(null));;
        System.out.println("Boolean.FALSE.equals(null) : " + Boolean.TRUE.equals(false));;
        System.out.println("Boolean.FALSE.equals(null) : " + Boolean.TRUE.equals(true));;

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
