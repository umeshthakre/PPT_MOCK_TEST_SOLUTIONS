public class SolutionMockTest2 {
    public static double findSqrt(double x)
    {
        if (x < 2)
            return x;

        double y = x;
        double z = (y + (x / y)) / 2;

        while (Math.abs(y - z) >= 0.00001) {
            y = z;
            z = (y + (x / y)) / 2;
        }
        return z;
    }

    private  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode temp = null;

        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            ListNode node = new ListNode(sum % 10);

            carry = sum / 10;

            if (temp == null) {
                temp = head = node;
            }

            else {
                temp.next = node;
                temp = temp.next;
            }
        }

        if (carry > 0) {
            temp.next = new ListNode(carry);
        }
        return head;
    }

    class ListNode{
        int val;
        ListNode next;

        ListNode(int data){
            val = data;
            next = null;
        }
    }

}

