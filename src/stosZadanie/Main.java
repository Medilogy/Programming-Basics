package stosZadanie;

import stosZadanie.Node;

public class Main {
    public static void main(String[] args) {

        Node node1 = new Node(21);
        Node node2 = new Node(34);
        Node node3 = new Node(25);
        Node node4 = new Node(45);

        StockZad stack = new StockZad();

        stack.push(node1);
        stack.push(node2);
        stack.push(node3);
        stack.push(node4);

        Node popNode = stack.pop();
    }
}
