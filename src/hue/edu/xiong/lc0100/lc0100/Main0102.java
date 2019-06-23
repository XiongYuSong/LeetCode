package hue.edu.xiong.lc0100.lc0100;

import hue.edu.xiong.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Xiong YuSong
 * @Date 2019/5/11
 */
public class Main0102 {

    //递归写法
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        fun(ans,root,0);
        return ans;
    }
    private void fun(List<List<Integer>> ans,TreeNode root,int num){
        if(num >= ans.size()){
            ans.add(new ArrayList<Integer>());
        }
        ans.get(num).add(root.val);
        if(root.left!=null) fun(ans,root.left,num+1);
        if(root.right!=null) fun(ans,root.right,num+1);
    }

//     //迭代写法
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>> ans = new ArrayList<>();
//         if(root == null) return ans;

//         List<TreeNode> item = new ArrayList<>();
//         item.add(root);

//         while(!item.isEmpty()){
//             List<TreeNode> currItem = new ArrayList<>();
//             List<Integer> list = new ArrayList<>();
//             for(TreeNode treeNode:item){
//                 list.add(treeNode.val);
//                 if(treeNode.left!=null) currItem.add(treeNode.left);
//                 if(treeNode.right!=null) currItem.add(treeNode.right);
//             }
//             item = currItem;
//             ans.add(list);
//         }
//         return ans;
//     }
}
