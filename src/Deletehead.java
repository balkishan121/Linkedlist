public class Deletehead {
    public static Node deletehead (Node head)
    {
        if(head==null) return head;
        else head=head.next;
        return head;
    }

    public static void main(String[] args) {
        int[] arr={2,5,7,8,9,45,14,22,19};
        Node head = Main.ArrtoLl(arr);
        System.out.print("Given Linked List is: ");
        Main.printLl(head);
        System.out.println("\nHead of the Linked List is: "+head.data);
        head=deletehead(head);
        System.out.print("Modified Linked List is: ");
        Main.printLl(head);
        System.out.println("\nHead after Removal old head is: "+head.data);

    }
}
