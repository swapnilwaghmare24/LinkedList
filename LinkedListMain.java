package LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList();
        //linkedList.push(70);
        //linkedList.push(30);
        //linkedList.push(56);
        // linkedList.print();
        //linkedList.addNodeLast(56);
        //linkedList.addNodeLast(30);
        //linkedList.addNodeLast(70);
        //linkedList.print();
        linkedList.addNodeLast(56);
        linkedList.addNodePosition(30,2);
        linkedList.addNodeLast(70);
        linkedList.print();
        linkedList.deletFirst();
        System.out.println();
        linkedList.print();
    }
}
