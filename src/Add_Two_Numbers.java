public class Add_Two_Numbers {
    public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a =new ListNode(0);
        ListNode newnode ;
        if (l1!=null&&l2!=null) {
            while (a.next != null) {
                a = a.next;
            }
            a = a.next;
            a.val = l1.val + l2.val;
            l1 = l1.next;
            l2 = l2.next;
        }
        return a;
    }
}
