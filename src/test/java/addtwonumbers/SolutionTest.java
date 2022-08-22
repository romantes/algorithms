package addtwonumbers;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    public void test1() {
        var node1 =
                new Solution.ListNode(2,
                        new Solution.ListNode(4,
                                new Solution.ListNode(3)));

        var node2 =
                new Solution.ListNode(5,
                        new Solution.ListNode(6,
                                new Solution.ListNode(7)));

        var expected =
                new Solution.ListNode(7,
                        new Solution.ListNode(0,
                                new Solution.ListNode(8)));


        var actual = new Solution().addTwoNumbers(node1, node2);
        Assertions.assertEquals(expected, actual);
    }
}