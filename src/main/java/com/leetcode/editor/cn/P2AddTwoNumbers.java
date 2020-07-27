package com.leetcode.editor.cn;
//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。 
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 示例： 
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
// 
// Related Topics 链表 数学 
// 👍 4591 👎 0


/**
 * @author mz
 */
public class P2AddTwoNumbers {
    public static void main(String[] args) {
        Solution solution = new P2AddTwoNumbers().new Solution();
        // TO TEST
        P2AddTwoNumbers.ListNode l1 = new P2AddTwoNumbers().new ListNode(5);
//        l1.next = new AddTwoNumbers().new ListNode(8);
//        l1.next.next = new AddTwoNumbers().new ListNode(3);

        P2AddTwoNumbers.ListNode l2 = new P2AddTwoNumbers().new ListNode(5);
//        l2.next = new AddTwoNumbers().new ListNode(6);
//        l2.next.next = new AddTwoNumbers().new ListNode(4);


        P2AddTwoNumbers.ListNode node = solution.addTwoNumbers(l1, l2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            ListNode ret = null;
            ListNode next = null;
            while (true) {

                int va = 0;
                if (l1 != null) {
                    va = l1.val;
                }

                int vb = 0;
                if (l2 != null) {
                    vb = l2.val;
                }

                int val = va + vb;

                boolean isExit = false;
                if (l1 != null) {
                    l1 = l1.next;
                } else {
                    l1 = null;
                }

                if (l2 != null) {
                    l2 = l2.next;
                } else {
                    l2 = null;
                }

                if (l1 == null && l2 == null) {
                    isExit = true;
                }

                if (ret == null) {

                    ret = new ListNode(val % 10);
                    if (val >= 10) {
                        next = new ListNode(val / 10);
                        ret.next = next;
                    } else if (!isExit) {
                        next = new ListNode(val / 10);
                        ret.next = next;
                    }


                } else {
                    val = val + next.val;
                    next.val = val % 10;
                    if (next.next != null) {
                        next.next.val += val / 10;
                        next = next.next;
                    } else {
                        if (!isExit || val >= 10) {
                            ListNode nxt = new ListNode(val / 10);
                            next.next = nxt;
                            next = nxt;
                        }
                    }
                }

                if (isExit) {
                    break;
                }
            }

            return ret;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}