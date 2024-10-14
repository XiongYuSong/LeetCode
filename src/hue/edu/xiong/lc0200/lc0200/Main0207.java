package hue.edu.xiong.lc0200.lc0200;

import java.util.*;

public class Main0207 {
    public static void main(String[] args) {
        System.out.println(new Main0207().canFinish(2, new int[][]{{1, 0}, {0, 1}}));
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, Set<Integer>> prerequisitesMap = new HashMap<>();
        // 这里设置为 1 表示可以完成学习，
        int[] numCoursesArr = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            Set<Integer> itemList = prerequisitesMap.computeIfAbsent(prerequisites[i][0], k -> new HashSet<>());
            itemList.add(prerequisites[i][1]);
        }
        for (int i = 0; i < numCourses; i++) {
            if (numCoursesArr[i] == 0) {
                if (!dfs(i, prerequisitesMap, numCoursesArr, new int[numCourses])) {
                    return false;
                }
            }
        }
        return true;
    }

    // 如果前置条件为 null，表示可以学习，则将 numCoursesArr[i] 设置为 1，只有明确表示为false的时候才返回false
    // 判断是否成环
    private boolean dfs(int i, Map<Integer, Set<Integer>> prerequisitesMap, int[] numCoursesArr, int[] checkCyc) {
        if (checkCyc[i] == 1) {
            // 表示成环，无法获得解
            return false;
        }
        checkCyc[i] = 1;
        Set<Integer> list = prerequisitesMap.get(i);
        if (list == null) {
            // 表示没有前置条件，可以学习
            numCoursesArr[i] = 1;
            return true;
        }
        for (Integer integer : list) {
            if (numCoursesArr[integer] == 0) {
                if (!dfs(integer, prerequisitesMap, numCoursesArr, checkCyc)) {
                    return false;
                }
            }
        }
        // 如果前置条件都可以学习，则表示可以学习
        numCoursesArr[i] = 1;
        return true;
    }
}
