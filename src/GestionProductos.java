import java.io.*;
import java.security.PrivateKey;
import java.util.ArrayList;

public class GestionProductos {

    ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProductos(Producto producto) throws IOException {
        productos.add(producto);
    }

    public void mostrarProductos() throws IOException {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public void guardar(String archivo) throws IOException {
        ObjectOutputStream entrada = new ObjectOutputStream(new FileOutputStream(archivo));
        entrada.writeObject(this.productos);
        System.out.println("Productos guardados en: " + "/home/tarde/Documentos/Programación/AccesoDatosTema1/productos.dat");
        entrada.close();
    }

    public void cargar(String archivo) throws IOException, ClassNotFoundException {
        ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(archivo));
        this.productos = (ArrayList<Producto>) entrada.readObject();
        entrada.close();
    }
}