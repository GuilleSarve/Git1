
package ejemplogit.entidades;


public class Perro {
    private String nombre;
    private String apodo;

    public Perro() {
    }

    public Perro(String nombre, String apodo) {
        this.nombre = nombre;
        this.apodo = apodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", apodo=" + apodo + '}';
    }
    

}
