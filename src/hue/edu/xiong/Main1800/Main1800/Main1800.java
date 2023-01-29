package hue.edu.xiong.Main1800.Main1800;

public class Main1800 {
    public static void main(String[] args) {
        System.out.println(new Main1800().squareIsWhite("h3"));
    }

    public boolean squareIsWhite(String coordinates) {
        char[] chars = coordinates.toCharArray();
        return (chars[0] + chars[1]) % 2 == 1;
    }
}
