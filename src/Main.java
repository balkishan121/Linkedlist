    public class Main {
        public static Node ArrtoLl(int []arr)
        {
            Node head=new Node (arr[0]);
            Node mover = head;
            for(int i =1;i<arr.length;i++) {
                Node temp = new Node(arr[i]);
                mover.next = temp;
                mover = temp;
            }
            return head;
        }
        public static void printLl(Node head)
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        public static int lenghtOfLl(Node head)
        {
            int count =0;
            Node temp=head;
            while(temp!=null)
            {
                count++;
                temp=temp.next;
            }

            return count;
        }
        public static boolean checkElement(Node head, int val)
        {
            Node temp=head;
            while(temp!=null) {
                if (temp.data == val)
                    return true;
                temp = temp.next;
            }
            return false;
        }
        public static void main(String[] args)
    {
        int[] arr={2,5,7,8,9,45,14,22,1,7,1,9,78,3,574,9};
        Node head = ArrtoLl(arr);
//        System.out.println(head.data);
        System.out.print("Given Linked List is: ");
         printLl(head);
        System.out.println("\nLenght of the Linked List is: "+ lenghtOfLl(head));
        System.out.println(checkElement(head, 2));
    }
}