public class DeleteElement {
        public static Node deleteelement(Node head, int el)
        {
            if (head==null) return head;
            if(head.data==el)
            {
                head=head.next;
                return head;
            }
            Node temp=head;
            Node prev=null;
            while(temp!=null)
            {
                if (el==temp.data) {
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
            head=deleteelement(head,2);
            System.out.print("\nModified Linked List is: ");
            Main.printLl(head);

        }
    }