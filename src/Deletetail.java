public class Deletetail {
    public static Node deletetail(Node head)
    {
        if (head==null||head.next==null) return head;
        Node temp=head;
        while(temp.next.next!=null)
        {
           temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    public static void main(String[] args) {
        int[] arr={2,5,7,8,9,45,14,22,19};
        Node head = Main.ArrtoLl(arr);
        System.out.print("Given Linked List is: ");
        Main.printLl(head);
        deletetail(head);
        System.out.print("\nModified Linked List is: ");
        Main.printLl(head);

    }
}