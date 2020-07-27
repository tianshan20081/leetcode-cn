package com.leetcode.editor.cn;
//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。 
//
// 示例 1: 
//
// 输入: "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 输入: "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 输入: "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
// Related Topics 哈希表 双指针 字符串 Sliding Window 
// 👍 3961 👎 0

import java.util.ArrayList;
import java.util.List;

public class P3LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Solution solution = new P3LongestSubstringWithoutRepeatingCharacters().new Solution();
        // TO TEST
//        int maxLen = solution.lengthOfLongestSubstring("abcabcbb");
        int maxLen = solution.lengthOfLongestSubstring("dvdf");
        System.out.println(maxLen);
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLongestSubstring(String s) {

            if (s.length() == 0) {
                return 0;
            }
            int maxLen = 1;
            int len = s.length();
            int index = 0;

            List<String> list = new ArrayList<String>(len);

            while (index < len) {
                list.clear();
                list.add(s.charAt(index) + "");
                for (int i = index + 1; i < len; i++) {
                    String chr = s.charAt(i) + "";
                    if (list.contains(chr)) {
                        if (i - index > maxLen) {
                            maxLen = i - index;
                        }
                        break;
                    }

                    list.add(chr);

                    if (list.size() > maxLen) {
                        maxLen = list.size();
                    }
//                    index = i - 1;
                }

                index++;
            }
            return maxLen;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}