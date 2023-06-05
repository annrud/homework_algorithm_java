package homework.redblacktree;

class Node {
    int key;
    Node left;
    Node right;
    boolean isRed;

    public Node(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
        this.isRed = true;
    }
}


