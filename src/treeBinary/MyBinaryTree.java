package treeBinary;

public class MyBinaryTree {
    BinaryNode root;

    public MyBinaryTree(BinaryNode root) {
        this.root = root;
    }

    public void insertNode(BinaryNode parent, BinaryNode nodeToInsert) {
        parent.addChild(nodeToInsert);
        nodeToInsert.setParent(parent);
    }
/*    public int getHeight(){
        return heigtOfTree(root);

    } */
    public static int heigtOfTree (BinaryNode node){ //wyswietlanie wysokosci drzewa
        if (node == null) {
            return 0;
        }
        int leftHeight = heigtOfTree(node.getLeftChild());
        int rightHeight = heigtOfTree(node.getRightChild());
        return Math.max(leftHeight, rightHeight) + 1;

    }
}
