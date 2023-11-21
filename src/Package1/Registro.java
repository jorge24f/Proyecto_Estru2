
package Package1;

import java.util.ArrayList;

public class Registro {

    ArrayList <Campo> registro = new ArrayList();

    public Registro() {
    }

    public ArrayList<Campo> getRegistro() {
        return registro;
    }

    public void setRegistro(ArrayList<Campo> registro) {
        this.registro = registro;
    }

    @Override
    public String toString() {
        return "Registro{" + "registro=" + registro + '}';
    }
}
