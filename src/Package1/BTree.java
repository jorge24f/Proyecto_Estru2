
package Package1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BTree implements Serializable{
    
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

    public void GuardarBTree(String nombrearch) throws FileNotFoundException, IOException{
        try(ObjectOutputStream oops = new ObjectOutputStream(new FileOutputStream(nombrearch))){
        oops.writeObject(this);
        }
        catch(FileNotFoundException exc){
            try{
                ObjectOutputStream crear = new ObjectOutputStream(new FileOutputStream(nombrearch));
                crear.writeObject(this);
                crear.close();
            }
            catch(IOException excep){
            }
        }
    }
    
    public BTree CargarBTree(String nombrearch) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream oips = new ObjectInputStream(new FileInputStream(nombrearch));
         return (BTree)oips.readObject();
    }
    
}
