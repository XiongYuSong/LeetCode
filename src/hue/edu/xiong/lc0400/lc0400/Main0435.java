package hue.edu.xiong.lc0400.lc0400;

import java.util.*;

public class Main0435 {

    public static void main(String[] args) {
        eraseOverlapIntervals(new int[][]{{1, 2}, {1, 3}, {2, 3}, {3, 4}, {-100, -2}, {5, 7}});
    }

    //18ms
//    public static int eraseOverlapIntervals(int[][] intervals) {
//        int count = 0;
//        Map<Integer, Integer> map = new TreeMap<>();
//        for (int i = 0; i < intervals.length; i++) {
//            if (map.containsKey(intervals[i][0])) {
//                if (map.get(intervals[i][0]) > intervals[i][1]) {
//                    map.put(intervals[i][0], intervals[i][1]);
//                }
//                //存在重复的开头必定会丢弃一个区间,这里因为题目要求丢弃的区间最小,所以,我们将大一点的区间丢弃
//                count++;
//            } else {
//                map.put(intervals[i][0], intervals[i][1]);
//            }
//        }
//        //如果前后两个区间重合,必定会丢弃一个,这里我们选择丢弃区间右坐标较大的哪一个区间;
//        int end = Integer.MIN_VALUE;
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            Integer key = entry.getKey();
//            if (key < end) {
//                count++;
//                Integer value = entry.getValue();
//                end = value < end ? value : end;
//            } else {
//                end = entry.getValue();
//            }
//        }
//        return count;
//    }

    //68ms
    public static int eraseOverlapIntervals(int[][] intervals) {
        int count = 0;
        if (intervals.length == 0) return count;
        Arrays.sort(intervals, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            } else {
                return o1[0] - o2[0];
            }
        });
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            //代表开始区间相同,只会取第一个,选择区间最小的,这样不会影响后面区间
            if (intervals[i][0] == start) {
                count++;
                continue;
            }
            //代表有重复区间段,也会丢弃一个,这里丢弃右边界比较大的一个
            if (intervals[i][0] < end) {
                count++;
                //那个右边界比较小,就用哪一个的右边界
                if (intervals[i][1] < end) {
                    end = intervals[i][1];
                }
            } else {
                end = intervals[i][1];
            }
            start = intervals[i][0];
        }
        return count;
    }

}
