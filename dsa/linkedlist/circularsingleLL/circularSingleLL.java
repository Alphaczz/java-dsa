package dsa.linkedlist.circularsingleLL;



public class circularSingleLL {
    Node head;
    Node tail;
    int size;

    public Node createsLL(int nodeValue) {
        head = new Node();
        tail = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertionCSLL(int location, int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createsLL(nodeValue);
            return;
        }
        if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >= size) {
            node.next = tail.next;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index == location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    public void traverseCSLL() {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print("->"); 
                }
                tempNode=tempNode.next;
              
            }  
        } else {
            System.err.println("the circular single linked list doesnt exist\n");
        }
        System.out.println();
    }

    public void searchElement(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            int index = 0;

            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println(tempNode);
                    System.out.println(index);
                } else {
                    tempNode = tempNode.next;
                    index++;
                }
            }

        }
    }

    public void deleteElement(int location) {
        if (head == null) {
            System.out.println("CSLL doesnt exist");
            return;
        } else if (location == 0) {
            head = head.next;
            tail.next = head;
            size--;
            if (size == 0) {
                head = null;
                tail = null;
                head.next = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                head.next = null;
                tail=head=null;
                size--;
                return;

            }
            tempNode.next = head;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }

    }
}
