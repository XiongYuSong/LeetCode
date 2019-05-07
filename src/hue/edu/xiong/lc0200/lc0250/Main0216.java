package hue.edu.xiong.lc0200.lc0250;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Xiong YuSong
 * @Date 2019/5/7
 */
public class Main0216 {

    // public List<List<Integer>> combinationSum3(int k, int n) {
    //     List<List<Integer>> ans = new ArrayList<>();
    //     fun(ans,new ArrayList<>(),1,k,n);
    //     return ans;
    // }
    // // left是出现过的最大值,k是递归的层数
    // private void fun(List<List<Integer>> ans,List<Integer> item,int left,int k,int n){
    //     if(k == 0){
    //         if(n == 0){
    //             ans.add(new ArrayList<Integer>(item));
    //         }
    //         return;
    //     }
    //     for(int i = left;i<10;i++){
    //         if(i > n) break;
    //         item.add(i);
    //         fun(ans,item,i+1,k-1,n-i);
    //         item.remove(item.size()-1);
    //     }
    // }


    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] nums = new int[]{0,1,2,3,4,5,6,7,8,9};
        fun(nums,ans,new ArrayList<>(),1,k,n);
        return ans;
    }
    // left是出现过的最大值,k是递归的层数
    private void fun(int[] nums, List<List<Integer>> ans, List<Integer> item, int left, int k, int n){
        if(k == 0){
            if(n == 0){
                ans.add(new ArrayList<Integer>(item));
            }
            return;
        }
        for(int i = left;i<nums.length;i++){
            if(nums[i] > n) break;
            item.add(nums[i]);
            fun(nums,ans,item,nums[i]+1,k-1,n-nums[i]);
            item.remove(item.size()-1);
        }
    }
}
