package dsa.linkedlist.doublyLL;

public class doublylinkedlist {
    public DoublyNode head;
    public DoublyNode tail;
    int size;

    public DoublyNode createDLL(int nodeValue) {
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size++;
        return head;
    }

    public void insertDLL(int nodeValue, int location) {
        if (head == null) {
            createDLL(nodeValue);
        } else if (location == 0) {
            DoublyNode node = new DoublyNode();
            node.value = nodeValue;
            node.next = head;
            node.prev = null;
            head.prev = node;
            head = node;
        } else if (location >= size) {
            DoublyNode newNode = new DoublyNode();
            newNode.value = nodeValue;
            newNode.next = null;
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        } else {
            DoublyNode temp = new DoublyNode();
            int index = 0;
            while (index < location - 1) {
                temp = temp.next;
                index++;
            }
            DoublyNode newNode = new DoublyNode();
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
        size++;
    }

    public void traversedLL() {

        if (head != null) {
            DoublyNode tempnode = head;

            for (int i = 0; i < size; i++) {
                System.out.print(tempnode.value);
                if (i != size - 1) {
                    System.out.print("->");
                }
                tempnode = tempnode.next;
            }
        } else {
            System.out.println("dll doesnt exist");
        }
        System.out.println();
    }

    public void reversetraversedLL() {

        if (head != null) {
            DoublyNode tempnode = tail;

            for (int i = 0; i < size; i++) {
                System.out.print(tempnode.value);
                if (i != size - 1) {
                    System.out.print("<-");
                }
                tempnode = tempnode.prev;
            }
        } else {
            System.out.println("dll doesnt exist");
        }
        System.out.println();
    }

    public boolean searchelement(int nodeValue) {
        if (head != null) {
            DoublyNode temp = head;
            for (int i = 0; i < size; i++) {
                if (temp.value == nodeValue) {
                    System.out.println("the Value is found at: " + i);
                    return true;
                }
                temp = temp.next;

            }
        }
        System.out.println("value not found ");
        return false;
    }

    public void deleteNodeDLL(int location) {
        if (head == null) {
            System.out.println("The DLL does not exist!");
            return;
        } else if (location == 0) {
            if (size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            } else {
                head = head.next;
                head.prev = null;
                size--;
            }
        } else if (location >= size) {
            DoublyNode tempNode = tail.prev;
            if (size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            } else {
                tempNode.next = null;
                tail = tempNode;
                size--;
            }
        } else {
            DoublyNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }

    // Delete entire DLL
    public void deleteDLL() {
        DoublyNode tempNode = head;
        for (int i = 0; i < size; i++) {
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("The DLL has been deleted!");
    }

}
