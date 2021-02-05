package hue.edu.xiong.lc1300.lc1350;

import hue.edu.xiong.Main;

import java.util.*;

/**
 * @author Xiong YuSong
 * @date 2020/11/06
 */
public class Main1356 {
//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(new Main1356().sortByBits(new int[]{1633, 2181, 7558, 2650, 1920, 809, 4903, 2223, 4271, 4110, 7564, 5428, 1730, 5970, 9640, 3185, 7564, 5040, 4344, 9479, 2070, 6569, 9849, 73, 2961, 7991, 9419, 7946, 3293, 882, 4714, 3813, 278, 6121, 9244, 8248, 5424, 2377, 4270, 7656, 1983, 2928, 2876, 4746, 129, 5971, 522, 349, 1239, 9493, 4777, 1421, 1763, 8419, 5696, 726, 6130, 9164, 5290, 6793, 3670, 3090, 3395, 5597, 7557, 6246, 956, 7791, 677, 2284, 7280, 5309, 8274, 1760, 2383, 7003, 4094, 1681, 8885, 3010, 1551, 7419, 813, 9937, 7054, 9615, 8126, 2739, 3255, 334, 587, 634, 3382, 3316, 4630, 6077, 4687, 2226, 8910, 8357, 1961, 1454, 6416, 8838, 6295, 4523, 9736, 6165, 2849, 7877})));
//    }

//    // 一共只有10000个数，也就是  2 ^ 14
//    public int[] sortByBits(int[] arr) {
//        Arrays.sort(arr);
//        Map<Integer, List<Integer>> map = new HashMap<>();
//        for (int num : arr) {
//            int temp = num;
//            int count = 0;
//            while (temp > 0) {
//                if ((temp & 1) == 1) {
//                    count++;
//                }
//                temp >>= 1;
//            }
//            List<Integer> list = map.getOrDefault(count, new ArrayList<>());
//            list.add(num);
//            map.put(count, list);
//        }
//        int index = 0;
//        for (List<Integer> list : map.values()) {
//            for (int num : list) {
//                arr[index++] = num;
//            }
//        }
//        return arr;
//    }

    // 一共只有10000个数，也就是  2 ^ 14
//    public int[] sortByBits(int[] arr) {
//        Map<Integer, Queue<Integer>> map = new HashMap<>();
//        for (int num : arr) {
//            int temp = num;
//            int count = 0;
//            while (temp > 0) {
//                if ((temp & 1) == 1) {
//                    count++;
//                }
//                temp >>= 1;
//            }
//            Queue<Integer> queue = map.getOrDefault(count, new PriorityQueue<>());
//            queue.add(num);
//            map.put(count, queue);
//        }
//        int index = 0;
//        for (Queue<Integer> queue : map.values()) {
//            while (!queue.isEmpty()) {
//                arr[index++] = queue.poll();
//            }
//        }
//        return arr;
//    }
//
//    public int[] sortByBits(int[] arr) {
//        int length = arr.length;
//        for (int i = 0; i < length; i++) {
//            arr[i] = Integer.bitCount(arr[i]) * 100_000 + arr[i];
//        }
//        Arrays.sort(arr);
//        for (int i = 0; i < length; i++) {
//            arr[i] %= 100_000;
//        }
//        return arr;
//    }
//
//    public int[] sortByBits(int[] arr) {
//        int length = arr.length;
//        for (int i = 0; i < length; i++) {
//            int temp = arr[i];
//            int count = 0;
//            while (temp > 0) {
//                if ((temp & 1) == 1) {
//                    count++;
//                }
//                temp >>= 1;
//            }
//            arr[i] = count * 100000 + arr[i];
//        }
//
//        Arrays.sort(arr);
//        for (int i = 0; i < length; i++) {
//            arr[i] %= 100000;
//        }
//        return arr;
//    }

}
