public class ListNode {

    public Object cargo;
    public ListNode next;

    public ListNode() {
        this.cargo = null;
        this.next = null;
    }

    public ListNode(Object cargo) {
        this.cargo = cargo;
        this.next = null;
    }

    public ListNode(Object cargo, ListNode next) {
        this.cargo = cargo;
        this.next = next;
    }

    public String toString() {
        return "ListNode(" + cargo.toString() + ")";
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        ListNode node0 = new ListNode(0, node1);
        System.out.println(node0);
    }
}