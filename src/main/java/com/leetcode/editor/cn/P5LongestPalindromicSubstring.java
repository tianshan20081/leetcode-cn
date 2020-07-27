package com.leetcode.editor.cn;
//给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。 
//
// 示例 1： 
//
// 输入: "babad"
//输出: "bab"
//注意: "aba" 也是一个有效答案。
//  ac :a
//
// 示例 2： 
//
// 输入: "cbbd"
//输出: "bb"
// 
// Related Topics 字符串 动态规划 
// 👍 2426 👎 0

import java.util.ArrayList;
import java.util.List;

public class P5LongestPalindromicSubstring {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Solution solution = new P5LongestPalindromicSubstring().new Solution();
//        String maxString = solution.longestPalindrome("babad");//bab
//        String maxString = solution.longestPalindrome("ac");// a
//        String maxString = solution.longestPalindrome("ccc"); //ccc
//        String maxString = solution.longestPalindrome("abcda");//a

//        String maxString = solution.longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth");
        String maxString = solution.longestPalindrome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println(maxString);
        System.out.println("耗时：" + (System.currentTimeMillis() - start));
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestPalindrome(String s) {
            int length = s.length();
            if (length <= 1) {
                return s;
            }

            int maxlen = 0;
            String maxStr = "";
            StringBuilder builder = new StringBuilder(1000);
            for (int i = 0; i < length; i++) {
                String cha = s.charAt(i) + "";

                builder.delete(0, builder.length());

                builder.append(cha);

                if (maxlen == 0) {
                    maxlen = 1;
                    maxStr = builder.toString();
                }

                int j = i + maxlen;
                if (j > length) {
                    break;
                }

                builder.append(s, i + 1, j);
                for (; j < length; j++) {
                    builder.append(s.charAt(j));
                    int len = builder.length();

                    if (len > maxlen && isHuiWen(builder)) {
                        maxlen = len;
                        String str = builder.toString();
                        maxStr = str;
                    }
                }
            }
            return maxStr;
        }

        private boolean isHuiWen(StringBuilder builder) {
            int length = builder.length();
            int middle = length / 2 + length % 2;
            int j = length - 1;
            for (int i = 0; i < middle; i++) {
                if (builder.charAt(i) != builder.charAt(j)) {
                    return false;
                }
                j--;
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}