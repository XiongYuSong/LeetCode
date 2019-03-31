package hue.edu.xiong.lc0500.lc0500;

import java.util.HashMap;
import java.util.Map;

//535. TinyURL 的加密与解密
public class Main0535 {

    public static void main(String[] args) {
        String url = encode("ssssssssssssssssssssss");
        System.out.println(url);
        System.out.println(decode(url));
    }

    private static Map<String, String> map = new HashMap<>();
    private static final String TINYURL_BASIC = "http://tinyurl.com/";
    private static final String INDEX = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // Encodes a URL to a shortened URL.
    public static String encode(String longUrl) {
        char[] ch = new char[6];
        String tinyurl = null;
        while (true) {
            for (int i = 0; i < ch.length; i++) {
                //随机Math.random()只会出现[0,1)，包括0，不包括1。乘以62取整的原因是找出[0,62)的整数
                ch[i] = INDEX.charAt((int) (Math.random() * 62));
            }
            tinyurl = TINYURL_BASIC + new String(ch);
            //如果存在相同的tinyurl，则需要重新随机tinyurl
            if (!map.containsKey(tinyurl)) {
                map.put(tinyurl, longUrl);
                return tinyurl;
            }
        }
    }

    // Decodes a shortened URL to its original URL.
    public static String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}
