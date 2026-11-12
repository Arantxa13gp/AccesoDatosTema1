import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

 void main() throws IOException {
     GestionProductos g = new GestionProductos();
     Producto producto = new Producto(
             1,
             "Disco duro",
             86.99,
             true,
             LocalDate.now(),
             "Almacenamiento"
     );
     g.agregarProductos(producto);
     g.mostrarProductos();
 }