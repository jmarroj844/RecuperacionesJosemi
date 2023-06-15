/*
 * 
 * @autor José Miguel Martín Rojas
 * 
 */

package Ejercicio6;

public class Moto extends VTerrestres{
    
    private String color;

    public Moto(String matricula, String modelo, int numRuedas, String color) {
        super(matricula, modelo, numRuedas);
        this.color = color;
    }

    public void imprimir() {
        System.out.println("Moto " + modelo + " con matrícula " + matricula + ", un número de ruedas de " + numRuedas + " y de color " + color);
    }
}
