public class Deletehead {
    public static Node deletehead (Node head)
    {
        if(head==null) return head;
        else head=head.next;
        return head;
    }

    public static void main(String[] args) {
        int[] arr={2,5,7,8,9,45,14,22,1,7,1,9,78,3,574,9};
        Node head = Main.ArrtoLl(arr);
        System.out.print("Given Linked List is: ");
        Main.printLl(head);
        System.out.println("\nHead of the Linked List is: "+head.data);
        head=deletehead(head);
        System.out.println("Head after Removal old head is: "+head.data);
    }
}
