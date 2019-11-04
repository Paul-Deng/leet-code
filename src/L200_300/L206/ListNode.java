package L200_300.L206;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }

    public void showList(){
        while(next != null){
            System.out.print(val + "->");
            next = next.next;
        }
    }
}
