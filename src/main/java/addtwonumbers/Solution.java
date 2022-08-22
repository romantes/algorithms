package addtwonumbers;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var l1string = toString(l1);
        var l2string = toString(l2);
        var resultString = addTwoNumbers(l1string, l2string);
        return stringToListNode(resultString);
    }

    private ListNode stringToListNode(String resultString) {
        final var chars = resultString.toCharArray();
        var listNode = new ListNode(Character.forDigit(chars[chars.length - 1], 10));
        for (int i = chars.length - 2; i >= 0; i--) {
            listNode.next = new ListNode(chars[i]);
            listNode = listNode.next;
        }
        return listNode;
    }

    private String addTwoNumbers(String l1string, String l2string) {
        final var i = Integer.parseInt(l1string);
        final var i1 = Integer.parseInt(l2string);
        final var sum = i + i1;
        return new String(Integer.toString(sum));
    }

    private String toString(ListNode listNode) {
        var result = new StringBuilder();
        var currNode = listNode;
        while (currNode != null) {
            result.append(Character.forDigit(currNode.val, 10));
            currNode = currNode.next;
        }
        return result.toString();
    }

    //maybe useless
    private int size(ListNode listNode) {
        int result = 0;
        ListNode currentListNode = listNode;
        while (currentListNode.next != null)
            result++;
        currentListNode = currentListNode.next;
        return result;
    }

    static class ListNode {
        int val;
        ListNode next;


        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof ListNode)) return false;

            ListNode listNode = (ListNode) o;

            return val == listNode.val;
        }

        @Override
        public int hashCode() {
            return val;
        }
    }
}

