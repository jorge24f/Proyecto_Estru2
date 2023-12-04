
package Package1;

public class BTree {
    
    private Node root;

    public BTree() {
        root = new Node();
    }

    public BTree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    
    
}
