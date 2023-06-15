/*
 * 
 * @autor José Miguel Martín Rojas
 * 
 */

package Ejercicio6;

public class Helicoptero extends VAereo{
    
    private int numHelices;

    public Helicoptero(String matricula, String modelo, int numAsientos, int numHelices) {
        super(matricula, modelo, numAsientos);
        this.numHelices = numHelices;
    }

    public void imprimir() {
        System.out.println("Helicóptero " + modelo + " con matrícula " + matricula + ", un número de asientos de " + numAsientos + " y de hélices " + numHelices);
    }
}
