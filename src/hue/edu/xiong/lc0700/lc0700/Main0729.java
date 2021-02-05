package hue.edu.xiong.lc0700.lc0700;

import java.util.*;

/**
 * @author Xiong YuSong
 * @date 2020/12/11
 */
public class Main0729 {
    public static void main(String[] args) {
        MyCalendar obj = new MyCalendar();
        boolean param_1 = obj.book(20, 29);
        param_1 = obj.book(13, 22);
        param_1 = obj.book(44, 50);
        param_1 = obj.book(1, 7);
        param_1 = obj.book(2, 10);
        param_1 = obj.book(14, 20);
        param_1 = obj.book(19, 25);
        param_1 = obj.book(19, 25);
    }
}

class MyCalendar {

    HashMap<Integer, Integer> map;
    ArrayList<Integer> list;

    public MyCalendar() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        if (list.size() == 0) {
            list.add(start);
            map.put(start, end);
            return true;
        }

        // 获取小于当前结束时间的第一个时间点start0，end0
        int index0 = fun2(list, end, 0, list.size() - 1);
        int start0 = list.get(index0);
        int end0 = map.get(start0);



        if (end >= start0) {
            if (end == start0 && index0 != 0) {
                index0--;
                start0 = list.get(index0);
                end0 = map.get(start0);
            }
            if (end == start0) {
                if (index0 == 0) {
                    fun1(list, start);
                    map.put(start, end);
                    return true;
                } else {

                }
            }

            // 现在 end 肯定大于 start0 ，这个时候end0 <= start
            if (end > start0) {
                if (start >= end0) {
                    fun1(list, start);
                    map.put(start, end);
                    return true;
                } else {
                    return false;
                }
            }
        }
        fun1(list, start);
        map.put(start, end);
        return true;
    }

    private void fun1(ArrayList<Integer> list, int start) {
        int index0 = fun2(list, start, 0, list.size() - 1);
        if (index0 == 0 && list.get(index0) > start) {
            list.add(index0, start);
        } else {
            list.add(index0 + 1, start);
        }
    }

    //二分查找法模板一:查找等于或者小于target的最后一个值
    private int fun2(ArrayList<Integer> arr, int target, int l, int r) {
        while (l < r) {
            int mid = (l + r + 1) >> 1;
            if (target < arr.get(mid)) r = mid - 1;
            else l = mid;
        }
        return l;
    }
}