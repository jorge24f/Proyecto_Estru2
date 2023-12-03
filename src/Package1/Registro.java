
package Package1;

import java.util.ArrayList;

public class Registro {

    ArrayList <Campo> campos = new ArrayList();

    public Registro() {
    }

    public ArrayList<Campo> getCampos() {
        return campos;
    }

    public void setCampos(ArrayList<Campo> campos) {
        this.campos = campos;
    }

    @Override
    public String toString() {
        //return "Registro{" + "campos=" + campos + '}';
        String salida = "";
        for (int i = 0; i < campos.size(); i++) {
            if(i == campos.size()-1){
                salida += campos.get(i).getContenido();
            } else {
                salida += campos.get(i).getContenido() + ", ";
            }
        }
        return salida;
    }
    
}
