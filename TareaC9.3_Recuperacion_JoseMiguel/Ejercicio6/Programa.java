/*
 * 
 * @autor José Miguel Martín Rojas
 * 
 */

package Ejercicio6;

import java.util.ArrayList;
import java.util.Iterator;

public class Programa {
 public static void main(String[] args) {
    
    ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    vehiculos.add(new Coche("1234ABC", "Cupra", 4, false));
    vehiculos.add(new Moto("1234QWE", "Kawasaki", 2, "Rojo"));
    vehiculos.add(new Barco("1234ZXC", "Pesquero", 155, true));
    vehiculos.add(new Submarino("1234SDF", "Nautilus", 380, 1600));
    vehiculos.add(new Avion("1234WER", "Boeing 747", 100, 6));
    vehiculos.add(new Helicoptero("1234XCV", "Apache", 4, 4));

    Iterator<Vehiculo> iterador = vehiculos.iterator();
    while (iterador.hasNext()) {
        Vehiculo vehiculo = iterador.next();
        vehiculo.imprimir();
    }
 }
}
