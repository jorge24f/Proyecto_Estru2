package Package1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class BTree implements Serializable{
    
    private Node root;
   
    public BTree() {
        root = new Node();
        root.setLeaf(true);
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

    public void guardarBTree(String path) throws FileNotFoundException, IOException{
        try(ObjectOutputStream oops = new ObjectOutputStream(new FileOutputStream(path))){
        oops.writeObject(this);
        }
        catch(FileNotFoundException exc){
            try{
                ObjectOutputStream crear = new ObjectOutputStream(new FileOutputStream(path));
                crear.writeObject(this);
                crear.close();
            }
            catch(IOException excep){
            }
        }
    }
    
    public BTree CargarBTree(String nombrearch) throws FileNotFoundException, IOException, ClassNotFoundException{
        try(ObjectInputStream oips = new ObjectInputStream(new FileInputStream(nombrearch))){
            return (BTree)oips.readObject();
        } catch(IOException | ClassNotFoundException ex){
            return null;
        }
    }
    
    // Helper method to insert a key into the node
    public void insertarLlave(Key key, Node nodo) {
        // Check if the node is a leaf and has space for the key
        if ((nodo.isLeaf() && nodo.getKeys()[nodo.getKeys().length-1] == null)) {
            insertarEnHoja(key, nodo);
        } else if (nodo.getKeys()[nodo.getKeys().length-1] != null) {
            // If the node is full, split it and then insert the key
            splitNode(nodo);
            insertarLlave(key, nodo.getParent());
        } else {
            // If the node is not a leaf and has space, find the appropriate child and insert
            int index = encontrarPosHijo(key, nodo);
            insertarLlave(key, nodo.getChildNodes()[index]);
        }
    }
    
     public Node[] splitNode(Node nodo) {
        // Create a new node to hold the keys and children to the right of the middle index
        Node newNode = new Node();
        newNode.setKeys(Arrays.copyOfRange(nodo.getKeys(), 5 / 2 + 1, 5));
        newNode.setChildNodes(Arrays.copyOfRange(nodo.getChildNodes(), 5 / 2 + 1, 5 + 1));
        newNode.setLeaf(true);

        // Update the current node to only include keys and children to the left of the middle index
        nodo.setKeys(Arrays.copyOfRange(nodo.getKeys(), 0, 5 / 2));
        nodo.setChildNodes(Arrays.copyOfRange(nodo.getChildNodes(), 0, 5 / 2 + 1));

        // Update the parent references for the new node and its children
        for (Node child : newNode.getChildNodes()) {
            if (child != null) {
                child.setParent(newNode);
            }
        }

        // If the current node is the root, create a new root
        if (nodo.getParent() == null) {
            Node newRoot = new Node();
            newRoot.setKeys(new Key[]{newRoot.getKeys()[5 / 2]});
            newRoot.setChildNodes(new Node[]{nodo, newNode});
            newRoot.setLeaf(false);

            // Update parent references for the new root and its children
            nodo.setParent(newRoot);
            newNode.setParent(newRoot);

            return new Node[]{nodo, newNode, newRoot};
        } else {
            // Insert the middle key into the parent node
            insertarLlave(nodo.getKeys()[5 / 2], nodo);

            // Find the index of the new key in the parent node
            int index = encontrarPosHijo(nodo.getKeys()[5 / 2], nodo);

            // Insert the new node into the parent's children array
            insertarHijo(index + 1, newNode, nodo);

            return new Node[]{nodo, newNode};
        }
    }

     
    // Helper method to insert a child into the children array
    private void insertarHijo(int index, Node child, Node nodo) {
        // Shift the children array to make space for the new child
        for (int i = nodo.getChildNodes().length - 1; i > index; i--) {
            nodo.getChildNodes()[i] = nodo.getChildNodes()[i - 1];
        }

        // Insert the child into the appropriate position
        nodo.getChildNodes()[index] = child;

        // Update the parent reference for the child
        if (child != null) {
            child.setParent(nodo);
        }
    }

    // Helper method to insert a key into a leaf node
    private void insertarEnHoja(Key key, Node nodo) {

        for (int i = 0; i < nodo.getKeys().length; i++) {
            if (nodo.getKeys()[i] == null) {
                nodo.getKeys()[i] = key;
                break;
            }
        }
        sortKeys(nodo.getKeys());
    }

    private static void sortKeys(Key[] arr) {
        int n = arr.length;

        if (arr[1] != null) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (arr[j] != null && arr[j + 1] != null &&arr[j].getContenido() > arr[j + 1].getContenido()) {
                        // Swap arr[j] and arr[j + 1]
                        Key temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }
    
    // Helper method to find the index of the child to insert the key
    private int encontrarPosHijo(Key key, Node nodo) {
        int index = 0;
            while (index < nodo.getKeys().length && key.getContenido() > nodo.getKeys()[index].getContenido()) {
                index++;
            }
        return index;
    }

    @Override
    public String toString() {
        return "BTree{" + "root=" + root + '}';
    }
  
}