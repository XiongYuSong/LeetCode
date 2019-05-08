package hue.edu.xiong.lc0400.lc0450;

import java.util.Arrays;

/**
 * @Author Xiong YuSong
 * @Date 2019/5/8
 */
public class Main0473 {

    public boolean makesquare(int[] nums) {
        if(nums.length < 4)
            return false;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if(sum % 4 != 0) {
            return false;
        }
        Arrays.sort(nums);//关键点1,这里排序之后，后面递归的num数就可以往后面拍，比如15-5--第三位肯定就不会从10,9,8,7,6,5开始找了，只会找4以及比4小的
        boolean[] flag = new boolean[nums.length];
        for(int i =0;i<4;i++){//关键点2,从大数往小数匹配，这样保证小数一定可以组成正方形的边
            if(!dfs(nums,flag,nums.length -1,sum/4)){
                return false;
            }
        }
        return true;
    }
    private boolean dfs(int[] nums,boolean[] flag,int num,int target){
        if(target == 0){
            return true;
        }
        for(int i = num;i >= 0;i--){ //这里不能用i == nums.length-1,需要一个可以改变的值
            if(!flag[i]){
                if(target-nums[i] < 0) continue;
                flag[i] = true;
                if(dfs(nums,flag,i-1,target-nums[i])){
                    return true;
                }
                flag[i] = false;
            }
        }
        return false;
    }
}
