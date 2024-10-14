package hue.edu.xiong.lc0200.lc0200;

import java.util.HashSet;
import java.util.Set;

public class Main0208 {
    class Trie {
        Set<String> set;
        Set<String> set2;
        public Trie() {
            set = new HashSet<>();
            set2 = new HashSet<>();
        }

        public void insert(String word) {
            set.add(word);
            for (int i = 1; i <= word.length(); i++) {
                set2.add(word.substring(0, i));
            }
        }

        public boolean search(String word) {
            return set.contains(word);
        }

        public boolean startsWith(String prefix) {
            return set2.contains(prefix);
        }
    }
}
