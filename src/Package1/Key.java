
package Package1;

public class Key {
    
    int rrn;
    int contenido;

    public Key() {
    }

    public Key(int rrn, int contenido) {
        this.rrn = rrn;
        this.contenido = contenido;
    }

    public int getRrn() {
        return rrn;
    }

    public int getContenido() {
        return contenido;
    }

    public void setRrn(int rrn) {
        this.rrn = rrn;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Key{" + "rrn=" + rrn + ", contenido=" + contenido + '}';
    }
    
    
    
}
