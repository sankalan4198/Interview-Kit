public class ReverseLinkedList_Recursive {
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
    static Node reverse(Node curr)
    {
        if(curr==null)
        {
            return null;
        }
        else if(curr.next==null)
        {
            return curr;
        }
        else
        {
            Node nextNode=curr.next;
            curr.next=null;
            Node ret=reverse(nextNode);
            nextNode.next=curr;
            return ret;
        }

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
       ReverseLinkedList_Recursive list=new ReverseLinkedList_Recursive();
       list.head=new Node(1);
       Node second=new Node(2);
       Node third=new Node(3);

       list.head.next=second;
       second.next=third;
       third.next=null;
       list.head=list.reverse(list.head);
       list.printList();

   }
}
