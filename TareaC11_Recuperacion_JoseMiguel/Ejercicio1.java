import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 
 * 
 * En este ejercicio está incluido tambien el 2 de mostrar por pantalla los números ya que no me di cuenta 
 * y lo hice directamente en el 1 porque creía que habría que mostrarlos aunque no los pidiera, asi que lo hice y ya lo dejo en el mismo archivo.
 * 
 * 
 * @autor José Miguel Martín Rojas
 * 
 */


 public class Ejercicio1 {
 public static void main(String[] args) {
    
    String fichero = "primos.dat";

    int num;

    try (BufferedWriter primo = new BufferedWriter(new FileWriter(fichero))) {
        for (num = 2; num <= 500; num++) {
                boolean esPrimo = true;
                for (int i = 2; i < num; i++) {
                    if ((num % i) == 0) {
                    esPrimo = false;
                    }
                }
            if (esPrimo) {
                primo.write(String.valueOf(num));
                primo.newLine();
            }
        }
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }

    try (BufferedReader primo = new BufferedReader(new FileReader(fichero))) {
        String linea;
        while ((linea = primo.readLine()) != null) {
            System.out.println(linea);
        }
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
 }
}