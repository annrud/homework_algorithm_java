package homework.redblacktree;

public class Main {
    public static void main(String[] args) {
        LeftLeaningRedBlackTree tree = new LeftLeaningRedBlackTree();

        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);
        tree.insert(18);
        tree.insert(19);
        tree.insert(8);

        System.out.print("Inorder Traversal: ");
        tree.printInorderTraversal();
    }
}
