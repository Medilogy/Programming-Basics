package completeTree;

public class CompleteBinaryTree {

    public static final int LEFT_NODE_POSITION = 1;
    public static final int RIGHT_NODE_POSITION = 2;
    public static final int MAX_CHILDREN_NUMBER = 2;
    int count;
    Node[] array = new Node[100];

    public CompleteBinaryTree(Node root, int capacity) {
        array = new Node[capacity];
        int baseRootPosition = 0;
        array[baseRootPosition] = root;
        root.setPosition(baseRootPosition);
        count = 1;
    }

    public void insertNode(Node parent, Node nodeToInsert, boolean left) {
        count++;
        int childPosition = left ? LEFT_NODE_POSITION : RIGHT_NODE_POSITION; //
        int insertNodePosition = 2 * parent.getPosition() + childPosition;
        array[insertNodePosition] = nodeToInsert;
        nodeToInsert.setPosition(insertNodePosition);
    }

    public void insertRightNode(Node parent, Node nodeToInsert) {
        count++;
        int insertNodePosition = 2 * parent.getPosition() + 2;
        array[insertNodePosition] = nodeToInsert;
        nodeToInsert.setPosition(insertNodePosition);
    }

    public Node getLeftChild(Node node) {
        return array[2 * node.getPosition() + LEFT_NODE_POSITION];
    }

    public Node getRightChild(Node node) {
        return array[2 * node.getPosition() + RIGHT_NODE_POSITION];
    }
    public Node getParent (Node node){
        return array[Math.floorDiv((node.getPosition()-1),2)];
    }

    public Node[] getChildren(Node node) {
//        Node[] children = new Node[MAX_CHILDREN_NUMBER];
//        int leftPosition = 2 * node.getPosition() + LEFT_NODE_POSITION;
//        int rightPosition = 2 * node.getPosition() + RIGHT_NODE_POSITION;
//        children[0] = array[leftPosition];
//        children[1] = array[rightPosition];
        return new Node[]{getLeftChild(node), getRightChild(node)};
    }
    public int heigtOfTree(Node node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = heigtOfTree(getLeftChild(node));
        int rightHeight = heigtOfTree(getRightChild(node));
        return Math.max(leftHeight, rightHeight) + 1;

    }
    public void printPreOrder(Node node) {
        System.out.print(node.toString());
        if (getLeftChild(node) != null) {
            printPreOrder(getLeftChild(node));
        }
        if (getRightChild(node) != null) {
            printPreOrder(getRightChild(node));
        }
    }
    public void printInOrder(Node node) {

        if (getLeftChild(node) != null) {
            printInOrder(getLeftChild(node));
        }
        System.out.print(node.toString());
        if (getRightChild(node) != null) {
            printInOrder(getRightChild(node));
        }
    }

    public void printPostOrder(Node node) {

        if (getLeftChild(node) != null) {
            printPostOrder(getLeftChild(node));
        }

        if (getRightChild(node) != null) {
            printPostOrder(getRightChild(node));
        }
        System.out.print(node.toString());
    }
}
