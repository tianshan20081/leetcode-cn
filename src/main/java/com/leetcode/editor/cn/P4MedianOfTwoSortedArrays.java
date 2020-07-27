package com.leetcode.editor.cn;
//给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。 
//
// 请你找出这两个正序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。 
//
// 你可以假设 nums1 和 nums2 不会同时为空。 
//
// 
//
// 示例 1: 
//
// nums1 = [1, 3]
//nums2 = [2]
//
//则中位数是 2.0
// 
//
// 示例 2: 
//
// nums1 = [1, 2]
//nums2 = [3, 4]
//
//则中位数是 (2 + 3)/2 = 2.5
// 
// Related Topics 数组 二分查找 分治算法 
// 👍 2904 👎 0

import com.alibaba.fastjson.JSON;

import java.util.Arrays;

public class P4MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Solution solution = new P4MedianOfTwoSortedArrays().new Solution();
        // TO TEST
        double medianSortedArrays = solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2});
//        double medianSortedArrays = solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});

        System.out.println(medianSortedArrays);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int len1 = nums1.length;
            int len2 = nums2.length;

            int[] max = new int[len1 + len2];
            int mLen = max.length;
//            for (int i = 0; i < mLen; i++) {
//                if (i < len1) {
//                    max[i] = nums1[i];
//                } else {
//                    max[i] = nums2[i - len1];
//                }
//
//            }
//            Arrays.sort(max);

            int j = 0, k = 0;
            for (int i = 0; i < mLen; i++) {

                if (j >= len1) {
                    /* j 已经取完了 */
                    int k1 = nums2[k];
                    max[i] = k1;
                    k++;
                } else if (k >= len2) {
                    int j1 = nums1[j];
                    max[i] = j1;
                    j++;
                } else {
                    int j1 = nums1[j];
                    int k1 = nums2[k];
                    if (j1 <= k1) {
                        max[i] = j1;
                        j++;
                    } else {
                        max[i] = k1;
                        k++;
                    }
                }
            }

//            System.out.println(JSON.toJSONString(max));

            if (mLen % 2 == 0) {
                int l = mLen / 2 - 1;
                return (max[l] + max[l + 1]) / 2.0;
            } else {
                return max[mLen / 2];
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}