package completeTree;

public class Main {
    public static void main(String[] args) {
        Node<String> root = new Node<>("A");
        Node<String> rootChild1 = new Node<>("B");
        Node<String> rootChild2 = new Node<>("C");
        Node<String> rootChild3 = new Node<>("D");

        Node<String> bChild1 = new Node<>("E");
        Node<String> bChild2 = new Node<>("F");
        Node<String> bChild3 = new Node<>("G");

        Node<String> dChild1 = new Node<>("H");

        CompleteBinaryTree tree = new CompleteBinaryTree(root, 100);
        tree.insertNode(root, rootChild1, true);
        tree.insertNode(root, rootChild2, false);

        tree.insertNode(rootChild1, rootChild3, true);
        tree.insertNode(rootChild1, bChild1, false);

        tree.insertNode(rootChild2, bChild2, true);
        tree.insertNode(rootChild2, bChild3, false);

        tree.insertNode(rootChild3, dChild1, true);


        Node[] rootChildren = tree.getChildren(root);
        Node[] rootChild1Children = tree.getChildren(rootChild1);
        Node parent = tree.getParent(rootChild2);

        System.out.println("pre-order");
        System.out.println(tree.heigtOfTree(root));
        tree.printPreOrder(root);

        System.out.println(" ");
        System.out.println("in-order");
        System.out.println(tree.heigtOfTree(root));
        tree.printInOrder(root);

        System.out.println(" ");
        System.out.println("post-order");
        System.out.println(tree.heigtOfTree(root));
        tree.printPostOrder(root);
    }

}
