
package Package1;

import java.io.Serializable;
import java.util.Arrays;

public class Node implements Serializable{
    // T = 6
    private int numKeys;
    private boolean leaf;
    private Key[] keys = new Key[5];
    private Node[] childNodes = new Node[6];
    private Node parent;

    public Node() {
    }

    public Node(int numKeys, boolean leaf) {
        this.numKeys = numKeys;
        this.leaf = leaf;
    }

    public int getNumKeys() {
        return numKeys;
    }

    public boolean isLeaf() {
        return leaf;
    }

    public Key[] getKeys() {
        return keys;
    }

    public Node[] getChildNodes() {
        return childNodes;
    }

    public void setNumKeys(int numKeys) {
        this.numKeys = numKeys;
    }

    public void setLeaf(boolean leaf) {
        this.leaf = leaf;
    }

    public void setKeys(Key[] keys) {
        this.keys = keys;
    }

    public void setChildNodes(Node[] childNodes) {
        this.childNodes = childNodes;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
    
    public boolean isEmpty(){ // Verifica si el arreglo de llaves no contine ninguna llave
        if(keys[0] == null){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean hasSpace(){ // Verifica si el arreglo de llaves tiene espacios disponibles
        for (int i = 0; i <keys.length; i++) {
            if(keys[i] == null){
                return true;
            }
        }
        return false;
    }
    
    public Node addChildNode(Node childNode) {
        for (int i = 0; i < childNodes.length; i++) {
            if (childNodes[i] == null) {
                childNodes[i] = childNode;
                childNode.setParent(this);
                return this;
            }
        }
        return this;
    }
    
    @Override
    public String toString() {
        String llaves = "";
        for (int i = 0; i < 5; i++) {
            if (keys[i] != null) {
                llaves += "Key'{'rrn=" + keys[i].getRrn() + ", contenido=" + keys[i].getContenido() + '}';
            }
        }
        String hijos = "";
        for (int i = 0; i < 6; i++) {
            if (childNodes[i] != null) {
                hijos += "Hijo " + i + ": ";
                for (int j = 0; j < 5; j++) {
                    if (childNodes[i].getKeys()[j] != null) {
                        hijos += "Key'{'rrn=" + childNodes[i].getKeys()[j].getRrn() + ", contenido=" + childNodes[i].getKeys()[j].getContenido() + '}';
                    }
                }
            }
        }
        return "Node{"
                + "leaf=" + leaf
                + "  " + llaves
                + ", childNodes=" + hijos
                + ", parent=" + parent
                + '}';
    }
    //Arrays.toString(keys);

}
