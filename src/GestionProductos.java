import java.io.*;
import java.security.PrivateKey;
import java.util.ArrayList;

public class GestionProductos {

    ArrayList<Producto> productos = new ArrayList<>();
    public void agregarProductos(Producto producto) throws IOException {
        productos.add(producto);
    }

    public void mostrarProductos() throws IOException{
        for (Producto producto : productos){
            System.out.println(producto);
        }
    }

    public void guardar(String archivo) throws IOException{

    }
    public void cargar(String archivo) throws IOException{

    }
}
