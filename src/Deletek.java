public class Deletek {
    public static Node deleteK(Node head, int k)
    {
        if (head==null) return head;
        if (k==1)
        {
            head=head.next;
            return head;
        }
        Node temp=head;
        Node prev=null;
        int count=0;
        while(temp!=null)
        {
            count ++;
            if (count==k) {
                prev.next = prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr={2,5,7,8,9,45,14,22,19};
        Node head = Main.ArrtoLl(arr);
        System.out.print("Given Linked List is: ");
        Main.printLl(head);
        head=deleteK(head,4);
        System.out.print("\nModified Linked List is: ");
        Main.printLl(head);

    }
}
