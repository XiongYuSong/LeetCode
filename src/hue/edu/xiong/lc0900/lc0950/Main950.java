package hue.edu.xiong.lc0900.lc0950;

import java.util.Arrays;

//950. 按递增顺序显示卡牌
public class Main950 {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int[] arr2 = new int[]{2, 3, 5, 7, 17, 13, 11};
        int[] arr3 = new int[]{1, 3, 5, 7, 9, 11, 13, 4, 8, 12, 6, 2, 10};
        //[1, 12, 2, 8, 3, 11, 4, 9, 5, 13, 6, 10, 7]
        System.out.println(Arrays.toString(deckRevealedIncreasing(arr1)));

        //[2, 13, 3, 11, 5, 17, 7]
        System.out.println(Arrays.toString(deckRevealedIncreasing(arr2)));

        System.out.println(Arrays.toString(deckRevealedIncreasing(arr3)));
    }

    /**
     * 1 <= A.length <= 1000
     * 1 <= A[i] <= 10^6
     * 对于所有的 i != j，A[i] != A[j]
     * 第一个条件，数组长度必定在[1,1000]之间
     * 第二个条件，数组元素必定在[1,10^6]之间
     * 第三个条件，没有重复值
     *
     * @param deck
     * @return
     */
    //已知按照输出为[2, 3, 5, 7, 11, 13, 17]正序，求输入的规则[2, 13, 3, 11, 5, 17, 7]；
    public static int[] deckRevealedIncreasing(int[] deck) {
        int[] ans = new int[deck.length];
//        Arrays.sort(deck);//输出规则定死了为递增输出[2, 3, 5, 7, 11, 13, 17]
        int flag = 1;//表示可以存放值
        int index = 0;//表示deck数组中前面的index个数已经放到应该放的位置了
        for (int j = 0; j < deck.length; j++) {
            if (ans[j] == 0) {
                if (flag == 1) {
                    ans[j] = deck[index];
                    index++;
                    if (index == deck.length) {
                        return ans;
                    }
                    flag = 0;
                } else {
                    flag = 1;
                }
            }
            if (j == deck.length - 1) {//里层无限在0-deck.length - 1循环下去
                j = -1;
            }
        }
        return ans;
    }

}
