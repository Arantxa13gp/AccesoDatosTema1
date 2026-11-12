import java.io.Serializable;
import java.time.LocalDate;

public class Producto implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String nombre;
    private double precio;
    private boolean disponible;
    private LocalDate fechaAlta;
    private String categoria;

    public Producto(int id, String nombre, double precio, boolean disponible, LocalDate fechaAlta, String categoria) {
        setId(id);
        setNombre(nombre);
        setPrecio(precio);
        setDisponible(disponible);
        setFechaAlta(fechaAlta);
        setCategoria(categoria);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "El producto es un: " + nombre + " su id es: " + id + " cuesta: " + precio +
        " ¿Esta disponible? " + disponible +
        " Se dio de alta: " + fechaAlta +
        " Esta en la categoria: " + categoria;
    }

}
