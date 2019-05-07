package hue.edu.xiong.lc0000.lc0050;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Xiong YuSong
 * @Date 2019/5/6
 */
public class Main0090 {


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> item = new ArrayList<>();
        fun(ans,item,0,nums);
        return ans;
    }
    private void fun(List<List<Integer>> ans,List<Integer> item,int num,int[] nums){
        if(num == nums.length){
            ans.add(new ArrayList<Integer>(item));
            return;
        }
        int count = 1;//判断当前数的个数，相同的数为一层
        for(int i = num+1;i<nums.length;i++){
            if(nums[i] == nums[num]){
                count++;
            }else{
                break;
            }
        }
        fun(ans,item,num+count,nums);//当前数不显示的递归
        for(int i = 0;i<count;i++){//当前数显示1...count个的递归
            item.add(nums[num]);
            fun(ans,item,num+count,nums);
        }
        for(int i = 0;i<count;i++){//递归回来之后清除
            item.remove(item.size()-1);
        }
    }
}
