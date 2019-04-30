package hue.edu.xiong;

public class Main {
    public static void main(String[] args) {
        String str1 = "slient";
        String str2 = "listena";
        System.out.println(str1.matches("["+str2+"^]+"));
        System.out.println(str2.matches("["+str1+"^]+"));
    }
}
