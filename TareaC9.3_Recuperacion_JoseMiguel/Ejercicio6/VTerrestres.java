/*
 * 
 * @autor José Miguel Martín Rojas
 * 
 */

package Ejercicio6;

public abstract class VTerrestres extends Vehiculo {
    
    protected int numRuedas;

    public VTerrestres(String matricula, String modelo, int numRuedas) {
        super(matricula, modelo);
        this.numRuedas = numRuedas;
    }
}
