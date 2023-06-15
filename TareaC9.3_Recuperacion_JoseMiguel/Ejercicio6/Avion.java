/*
 * 
 * @autor José Miguel Martín Rojas
 * 
 */

package Ejercicio6;

public class Avion extends VAereo{
    
    private int tiempoMaxVuelo;

    public Avion(String matricula, String modelo, int numAsientos, int tiempoMaxVuelo) {
        super(matricula, modelo, numAsientos);
        this.tiempoMaxVuelo = tiempoMaxVuelo;
    }

    public void imprimir() {
        System.out.println("Avión " + modelo + " con matrícula " + matricula + ", un múmero de asientos de " + numAsientos + " y tiempo máximo de vuelo " + tiempoMaxVuelo);
    }
}
