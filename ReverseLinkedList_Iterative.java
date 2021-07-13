public class ReverseLinkedList_Iterative {
    Node head=null;
    Node tail=null;

    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            this.data=d;
            next=null;
        }
    }

    static Node reverse(Node node)
    {
        Node prev=null;
        Node next=null;
        Node current=node;

        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        node=prev;
        return node;
    }
    public void printList()
    {
        Node n=head;
        while(n!=null)
        {
            System.out.print(n.data+" ");
            n=n.next;
        }
    }

    public static void main(String args[])
    {
        ReverseLinkedList_Iterative list=new ReverseLinkedList_Iterative();
        list.head=new Node(1);
        Node second=new Node(2);
        Node third= new Node(3);

        list.head.next=second;
        second.next=third;
        third.next=null;
        list.head=list.reverse(list.head);
        list.printList();
    }
}
