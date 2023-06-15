/*
 * 
 * @autor José Miguel Martín Rojas
 * 
 */

import java.util.ArrayList;
import java.util.Iterator;

public class PruebaProducto {
 public static void main(String[] args) {

    ArrayList<Producto> productos = new ArrayList<>();
    
    productos.add(new Producto("tablet", 2));
    productos.add(new Producto("movil", 3));
    productos.add(new Producto("cargador", 5));
    productos.add(new Producto("protector", 5));
    productos.add(new Producto("funda", 4));

    System.out.println("Contenido del ArrayList:");
    Iterator<Producto> iterator = productos.iterator();
    while (iterator.hasNext()) {
        Producto producto = iterator.next();
        System.out.println("Nombre: " + producto.getNombre() + " Cantidad: " + producto.getCantidad());
    }

    productos.remove(1);
    productos.remove(3);

    productos.add(2, new Producto("ordenador", 1));

    System.out.println("Nueva Arraylist:");
    iterator = productos.iterator();
    while (iterator.hasNext()) {
        Producto producto = iterator.next();
        System.out.println("Nombre: " + producto.getNombre() + " Cantidad: " + producto.getCantidad());
    }

    productos.clear();

    System.out.println(productos); //Se imprime el ArrayList para ver que no tiene nada

 }
}
