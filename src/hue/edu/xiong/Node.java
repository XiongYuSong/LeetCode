package hue.edu.xiong;

/**
 * @Author Xiong YuSong
 * @Date 2019/5/3
 */
public class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {
    }

    public Node(int _val, Node _next, Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
