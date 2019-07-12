package hue.edu.xiong.lc0400.lc0450;

import java.util.Map;
import java.util.TreeMap;

public class Main0452 {
    public static void main(String[] args) {
        findMinArrowShots(new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}});
    }

    public static int findMinArrowShots(int[][] points) {
        //判断每一个横坐标开始的最小的气球
        int count = 0;
        if (points.length == 0 || points.length == 1) {
            return points.length;
        }
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < points.length; i++) {
            if (map.containsKey(points[i][0])) {
                if (map.get(points[i][0]) > points[i][1]) {
                    map.put(points[i][0], points[i][1]);
                }
            } else {
                map.put(points[i][0], points[i][1]);
            }
        }
        //然后每一个最短的气球都炸了,其他也一定炸
        int minPoint = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (key > minPoint) {
                //这表示可以从minPoint这里射一箭了
                count++;
                minPoint = value;//最小射箭点要变成当前的气球的右边界射箭点
            }
            //特殊情况,当前气球的右边界小于之前的最小射箭点,这个点要左移
            if (value < minPoint) {
                minPoint = value;
            }
        }
        return count;
    }
}
