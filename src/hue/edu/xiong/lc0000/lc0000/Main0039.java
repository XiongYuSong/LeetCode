package hue.edu.xiong.lc0000.lc0000;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Xiong YuSong
 * @Date 2019/5/6
 */
public class Main0039 {

    // 优化了五次，运行速度6ms，比排名第一的速度还要快（排名第一在我这运行7ms）
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> item = new ArrayList<>();
        fun(ans,item,candidates,0,target);
        return ans;
    }

    private void fun(List<List<Integer>> ans,List<Integer> item,int[] candidates,int num,int target){
        if(num == candidates.length){
            if(0 == target){
                ans.add(new ArrayList<>(item));
            }
            return;
        }
        fun(ans,item,candidates,num+1,target);
        int i = 0;
        for(;i<target/candidates[num];i++){
            if(target - (i+1)*candidates[num] < 0 ){
                break;
            }
            item.add(candidates[num]);
            fun(ans,item,candidates,num+1,target - (i+1)*candidates[num]);
        }
        for(i--;i>=0;i--){
            item.remove(item.size()-1);
        }
    }
}
