
package Package1;

public class Campo {
    
    private String nombre;
    private String tipo;
    private int longitud;
    private boolean esLlave;
    private Object contenido;

    public Campo() {
    }

    public Campo(String nombre, String tipo, int longitud, boolean esLlave) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.longitud = longitud;
        this.esLlave = esLlave;
    }
    
    public Campo(String nombre, String tipo, int longitud, boolean esLlave, Object contenido) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.longitud = longitud;
        this.esLlave = esLlave;
        this.contenido = contenido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getLongitud() {
        return longitud;
    }

    public boolean isEsLlave() {
        return esLlave;
    }

    public Object getContenido() {
        return contenido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void setEsLlave(boolean esLlave) {
        this.esLlave = esLlave;
    }

    public void setContenido(Object contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Campo[" + "nombre=" + nombre + ", tipo=" + tipo + ", longitud=" + longitud + ", esLlave=" + esLlave +']';
    }

}
