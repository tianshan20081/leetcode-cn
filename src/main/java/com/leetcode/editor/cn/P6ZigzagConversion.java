package com.leetcode.editor.cn;
//将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。 
//
// 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下： 
//
// L   C   I   R
//E T O E S I I G
//E   D   H   N
// 
//
// 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。 
//
// 请你实现这个将字符串进行指定行数变换的函数： 
//
// string convert(string s, int numRows); 
//
// 示例 1: 
//
// 输入: s = "LEETCODEISHIRING", numRows = 3
//输出: "LCIRETOESIIGEDHN"
// 
//
// 示例 2: 
//
// 输入: s = "LEETCODEISHIRING", numRows = 4
//输出: "LDREOEIIECIHNTSG"
//解释:
//
//L     D     R
//E   O E   I I
//E C   I H   N
//T     S     G 
// Related Topics 字符串 
// 👍 754 👎 0

import com.alibaba.fastjson.JSON;

public class P6ZigzagConversion {
    public static void main(String[] args) {
        Solution solution = new P6ZigzagConversion().new Solution();
        // TO TEST
        String convert = solution.convert("LEETCODEISHIRING", 4);
        System.out.println(convert);

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String convert(String s, int numRows) {
            int len = s.length();
            int col = len / numRows + 1;
            String[][] dst = new String[col][numRows];
            int index = 0;
            int no = 0;

            while (true) {
                if (index >= len) {
                    break;
                }


                index++;
            }
            System.out.println(JSON.toJSONString(dst));
            StringBuilder builder = new StringBuilder();
            for (int r = 0; r < numRows; r++) {
                for (int c = 0; c < col - 1; c++) {
                    String ch = dst[r][c];
                    if (ch != null) {
                        builder.append(ch);
                    }
                }
            }
            return builder.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}