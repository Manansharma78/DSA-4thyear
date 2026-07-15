package day6;

import java.util.*;

public class PowerSet {

    static class Solution { 

        public List<String> AllPossibleStrings(String s) {
            List<String> ans = new ArrayList<>();
            generate(s, 0, "", ans);
            Collections.sort(ans);
            return ans;
        }

        private void generate(String s, int idx, String curr, List<String> ans) {
            if (idx == s.length()) {
                if (!curr.isEmpty())
                    ans.add(curr);
                return;
            }

            generate(s, idx + 1, curr, ans);
            generate(s, idx + 1, curr + s.charAt(idx), ans);
        }
    }

}   