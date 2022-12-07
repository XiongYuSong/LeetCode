package hue.edu.xiong.lc1700.lc1750;

import java.util.List;

public class Main1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        if ("type".equals(ruleKey)) {
            return func(0, items, ruleValue);
        } else if ("color".equals(ruleKey)) {
            return func(1, items, ruleValue);
        } else if ("name".equals(ruleKey)) {
            return func(2, items, ruleValue);
        }
        return 0;
    }

    private int func(int i, List<List<String>> items, String ruleValue) {
        int answer = 0;
        for (List<String> item : items) {
            if (ruleValue.equals(item.get(i))) {
                answer++;
            }
        }
        return answer;
    }
}
