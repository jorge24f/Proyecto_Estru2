package Package1;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class BTree implements Serializable {

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

    public void guardarBTree(String path) throws FileNotFoundException, IOException {
        try ( ObjectOutputStream oops = new ObjectOutputStream(new FileOutputStream(path))) {
            oops.writeObject(this);
        } catch (FileNotFoundException exc) {
            try {
                ObjectOutputStream crear = new ObjectOutputStream(new FileOutputStream(path));
                crear.writeObject(this);
                crear.close();
            } catch (IOException excep) {
            }
        }
//        FileOutputStream fw = null;
//        ObjectOutputStream bw = null;
//        try {
//            fw = new FileOutputStream(archivo);
//            bw = new ObjectOutputStream(fw);
//            bw.writeObject(this);
//            bw.flush();
//        } catch (Exception ex) {
//        } finally {
//            try {
//                bw.close();
//                fw.close();
//            } catch (Exception ex) {
//            }
//        }
    }

    public BTree CargarBTree(String nombrearch) throws FileNotFoundException, IOException, ClassNotFoundException {
        try ( ObjectInputStream oips = new ObjectInputStream(new FileInputStream(nombrearch))) {
            return (BTree) oips.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            return null;
        }
//        try {
//            if (archivo.exists()) {
//                FileInputStream entrada = new FileInputStream(archivo);
//                ObjectInputStream objeto = new ObjectInputStream(entrada);
//                try {
//                    return (BTree) objeto.readObject();
//                } catch (EOFException e) {
//                    //encontro el final del archivo
//                }
//                objeto.close();
//                entrada.close();
//            } //fin if           
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return null;
    }

    // Helper method to insert a key into the node
    public boolean insertarLlave(Key key, Node nodo) {
        root.toString();
        if (nodo.isLeaf() && nodo.getKeys()[nodo.getKeys().length - 1] == null) {//cuando es hoja y tiene espacio
            //System.out.println("entro en insert simple");
            insertarEnHoja(key, nodo);
            //System.out.println("Insertado correctamente");
            return true;

            //toca split
        } else if (nodo.isLeaf() && nodo.getKeys()[nodo.getKeys().length - 1] != null) {//cuando es hoja y no tiene espacio

            Node[] splitResult = splitNode(nodo, key);
            //System.out.println("Entro en split\n");
            if (nodo.getParent() != null) {//si no es raiz
                int temp = 0;

                splitResult[0].setParent(nodo.getParent());
                splitResult[1].setParent(nodo.getParent());
                //System.out.println("Entro en split sin raiz\n");
                //System.out.println(nodo.toString());
                for (int i = 0; i < nodo.getParent().getKeys().length; i++) {
                    if (nodo.getParent().getKeys()[i] == null) {
                        nodo.getParent().getKeys()[i] = nodo.getKeys()[2];
                        temp = i;
                        break;
                    }
                }
                //System.out.println("pos a insertar nodo izquierdo: " + temp);
                nodo.getParent().getChildNodes()[temp] = splitResult[0];
                insertarEnHoja(key, splitResult[1]);
                nodo.getParent().getChildNodes()[temp + 1] = splitResult[1];

            } else {//si es raiz
                int temp = 0;
                for (int i = 0; i < nodo.getKeys().length; i++) {
                    if (nodo.getKeys()[i] == null) {
                        temp = i;
                        break;
                    }
                }
                Key temp1 = nodo.getKeys()[2];
                for (int i = temp; i < 5; i++) {
                    nodo.getKeys()[i] = null;
                }
                nodo.getKeys()[temp] = temp1;
                insertarEnHoja(key, splitResult[1]);
                splitResult[0].setParent(nodo);
                splitResult[1].setParent(nodo);
                nodo.addChildNode(splitResult[0]);
                nodo.addChildNode(splitResult[1]);
            }
            return true;
        }
        //Cuando no es hoja
        int pos = 0;
        for (int i = 0; i < nodo.getKeys().length; i++) {
            if (nodo.getKeys()[i] != null && key.getContenido() > nodo.getKeys()[pos].getContenido()) {
                pos++;
            }
        }

        if (nodo.getKeys()[0] != null && pos == 0 && key.getContenido() < nodo.getKeys()[0].getContenido()) {
            return insertarLlave(key, nodo.getChildNodes()[pos]);
        }
        return insertarLlave(key, nodo.getChildNodes()[pos]);
    }

    public Node[] splitNode(Node nodo, Key key) {
        Key[] temp = nodo.getKeys();
        Node newNode1 = new Node();
        Node newNode2 = new Node();
        newNode1.setLeaf(true);
        newNode2.setLeaf(true);
        nodo.setLeaf(false);

        newNode1.getKeys()[0] = temp[0];
        newNode1.getKeys()[1] = temp[1];

        newNode2.getKeys()[0] = temp[3];
        newNode2.getKeys()[1] = temp[4];
        
        return new Node[]{newNode1, newNode2};
    }

    // Helper method to insert a child into the children array
    private void insertarHijo(int index, Node child, Node nodo) {
        // Shift the children array to make space for the new child
        for (int i = nodo.getChildNodes().length - 1; i > index; i--) {
            nodo.getChildNodes()[i] = nodo.getChildNodes()[i - 1];
        }

        // Insert the child en lugar correcto
        nodo.getChildNodes()[index] = child;

        if (child != null) {
            child.setParent(nodo);
        }
    }

    // Helper method
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
                    if (arr[j] != null && arr[j + 1] != null && arr[j].getContenido() > arr[j + 1].getContenido()) {
                        // Swap arr[j] and arr[j + 1]
                        Key temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }

    public boolean deleteKey(Key key) {
        return deleteKey(root, key);
    }

    private boolean deleteKey(Node currentNode, Key key) {
        if (currentNode == null) {
            return false;
        }

        int index = findKeyIndex(currentNode, key);

        if (index < currentNode.getKeys().length && currentNode.getKeys()[index] != null
                && currentNode.getKeys()[index].equals(key)) {

            if (currentNode.isLeaf()) {
                deleteKeyFromLeaf(currentNode, index);
            } else { // If the node is not a leaf, delete the key from the appropriate child
                deleteKeyFromNonLeaf(currentNode, index);
            }
            return true;
        } else {
            boolean isLastChild = (index == currentNode.getKeys().length);

            boolean keyDeleted = deleteKey(currentNode.getChildNodes()[index], key);

            if (keyDeleted) {
                //handleChildDeletion(currentNode, index, isLastChild);
            }
            return keyDeleted;
        }
    }

    private int findKeyIndex(Node node, Key key) {
        int index = 0;
        while (index < node.getKeys().length && node.getKeys()[index] != null
                && key.getContenido() > node.getKeys()[index].getContenido()) {
            index++;
        }
        return index;
    }

    private void deleteKeyFromLeaf(Node node, int index) {
        for (int i = index; i < node.getKeys().length - 1; i++) {
            node.getKeys()[i] = node.getKeys()[i + 1];
        }
        node.getKeys()[node.getKeys().length - 1] = null;
    }

    private void deleteKeyFromNonLeaf(Node node, int index) {
        Key key = node.getKeys()[index];

        if (node.getChildNodes()[index].getKeys().length >= 2) {
            Key predecessor = findPredecessor(node.getChildNodes()[index]);
            node.getKeys()[index] = predecessor;
            deleteKey(node.getChildNodes()[index], predecessor);
        } else if (node.getChildNodes()[index + 1].getKeys().length >= 2) {
            Key successor = findSuccessor(node.getChildNodes()[index + 1]);
            node.getKeys()[index] = successor;
            deleteKey(node.getChildNodes()[index + 1], successor);
        } else {
            mergeNodes(node, index);
            deleteKey(node.getChildNodes()[index], key);
        }
    }

    private Key findPredecessor(Node node) {
        while (!node.isLeaf()) {
            node = node.getChildNodes()[node.getKeys().length];
        }
        return node.getKeys()[node.getKeys().length - 1];
    }

    private Key findSuccessor(Node node) {
        while (!node.isLeaf()) {
            node = node.getChildNodes()[0];
        }
        return node.getKeys()[0];
    }

    private void mergeNodes(Node parentNode, int index) {
        Node leftChild = parentNode.getChildNodes()[index];
        Node rightChild = parentNode.getChildNodes()[index + 1];

        leftChild.getKeys()[leftChild.getKeys().length - 1] = parentNode.getKeys()[index];

        for (int i = 0; i < rightChild.getKeys().length; i++) {
            leftChild.getKeys()[i + leftChild.getKeys().length] = rightChild.getKeys()[i];
        }

        for (int i = 0; i < rightChild.getChildNodes().length; i++) {
            leftChild.getChildNodes()[i + leftChild.getChildNodes().length] = rightChild.getChildNodes()[i];
            if (rightChild.getChildNodes()[i] != null) {
                rightChild.getChildNodes()[i].setParent(leftChild);
            }
        }

        for (int i = index; i < parentNode.getKeys().length - 1; i++) {
            parentNode.getKeys()[i] = parentNode.getKeys()[i + 1];
        }
        parentNode.getKeys()[parentNode.getKeys().length - 1] = null;

        for (int i = index + 1; i < parentNode.getChildNodes().length - 1; i++) {
            parentNode.getChildNodes()[i] = parentNode.getChildNodes()[i + 1];
        }
        parentNode.getChildNodes()[parentNode.getChildNodes().length - 1] = null;
    }

    @Override
    public String toString() {
        return root.toString();
    }
}