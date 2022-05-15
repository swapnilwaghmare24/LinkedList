package LinkedList;

public class LinkedList<T> {

    Node head;

    void push(T data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head= newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    void addNodeLast(T data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;

    }
    void print()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+ " --> ");
            temp=temp.next;
        }
        System.out.print("NULL");
    }
}
