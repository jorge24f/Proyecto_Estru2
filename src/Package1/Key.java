
package Package1;

public class Key {
    
    int rrn;
    Object contenido;

    public Key() {
    }

    public Key(int rrn, Object contenido) {
        this.rrn = rrn;
        this.contenido = contenido;
    }

    public int getRrn() {
        return rrn;
    }

    public Object getContenido() {
        return contenido;
    }

    public void setRrn(int rrn) {
        this.rrn = rrn;
    }

    public void setContenido(Object contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Key{" + "rrn=" + rrn + ", contenido=" + contenido + '}';
    }
    
    
    
}
