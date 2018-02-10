package queue;

public class MyQueue {
    Node tail;
    int count;

    public Node getHead() {
        return tail;
    }

    public void setHead(Node head) {
        this.tail = head;
    }

    public int getCount() {
        return count;
    }

    public void add(Node node) {

        if (tail != null) {
            node.setNext(tail);

        } else {
            tail = node;
        }
        tail = node;
        count++;

    }

    public Node remove() {
        Node currentNode = tail.getNext();
        while (currentNode != null) {
            if (currentNode.getNext().getNext() == null) {
                currentNode.setNext(null);
                return currentNode.getNext();
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }
}