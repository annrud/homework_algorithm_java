package homework.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        System.out.println("Original list:");
        list.display();

        list.reverse();

        System.out.println("Reversed list:");
        list.display();
    }
}
