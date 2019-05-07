package hue.edu.xiong.lc0000.lc0050;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Main0078 {
    //别人写的，偶尔1ms，经常2ms
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums.length == 0){
            return result;
        }
        dfs(nums, 0, new ArrayList<Integer>(), result);
        return result;
    }
    public void dfs(int[] s, int index, List<Integer> path, List<List<Integer>> result){
        result.add(new ArrayList<Integer>(path));
        for(int i = index; i < s.length; i++){
            path.add(s[i]);
            dfs(s, i+1, path, result);
            path.remove(path.size()-1);
        }
    }


// 2ms 回溯法
//     public List<List<Integer>> subsets(int[] nums) {
//         List<List<Integer>> ans = new ArrayList<>();
//         List<Integer> item = new ArrayList<>();
//         fun(ans,item,0,nums);
//         return ans;
//     }
//     private void fun(List<List<Integer>> ans,List<Integer> item,int num,int[] nums){
//         if(num == nums.length){
//             ans.add(new ArrayList<Integer>(item));
//             return;
//         }
//         fun(ans,item,num+1,nums);
//         item.add(nums[num]);
//         fun(ans,item,num+1,nums);
//         item.remove(item.size()-1);

//     }


    // 3ms 位运算
    // public static List<List<Integer>> subsets(int[] nums) {
    //     List<List<Integer>> ans = new ArrayList<>();
    //     List<Integer> item = null;
    //     String str = null;
    //     int pow = (int) Math.pow(2, nums.length);
    //     for (int i = 0; i < pow; i++) {
    //         str = Integer.toBinaryString(i + pow);
    //         item = new ArrayList<>();
    //         for (int j = 1; j <= nums.length; j++) {
    //             if (str.charAt(j) == '1') {
    //                 item.add(nums[j - 1]);
    //             }
    //         }
    //         ans.add(item);
    //     }
    //     return ans;
    // }
}
