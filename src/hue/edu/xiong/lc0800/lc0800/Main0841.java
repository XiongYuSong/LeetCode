package hue.edu.xiong.lc0800.lc0800;

import java.util.List;

/**
 * @author Xiong YuSong
 * @date 2020/09/01
 */
public class Main0841 {
    int openRoomTotal = 1;//默认0房间是开启的
    Boolean[] flagArr;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        flagArr = new Boolean[rooms.size()];
        flagArr[0] = true;
//        fun(rooms,0)
        return flagArr.length == openRoomTotal;
    }
}
