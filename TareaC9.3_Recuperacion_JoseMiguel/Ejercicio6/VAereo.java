/*
 * 
 * @autor José Miguel Martín Rojas
 * 
 */

package Ejercicio6;

public abstract class VAereo extends Vehiculo {
    
    protected int numAsientos;

    public VAereo(String matricula, String modelo, int numAsientos) {
        super(matricula, modelo);
        this.numAsientos = numAsientos;
    }
}