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
    void addNodePosition(T data,int position)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node previous = head;
        int count = 1;
        while(count < position-1)
        {
            previous=previous.next;
            count++;
        }
        Node temp=previous.next;
        newNode.next=temp;
        previous.next=newNode;
    }
    void deletFirst()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        head = temp.next;

    }
    void deletLast()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node secondLast = head;
        Node last = head.next;
        while(last.next!=null)
        {
            last=last.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    void deleteSpecificData(T data)
    {
        Node seconLast = head;
        Node last = head.next;
        while (last.data!=data)
        {
            last=last.next;
            seconLast=seconLast.next;
        }
        Node temp = last.next;
        seconLast.next=temp;

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
