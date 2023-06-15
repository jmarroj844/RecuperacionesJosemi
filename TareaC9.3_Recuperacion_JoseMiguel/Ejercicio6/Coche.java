/*
 * 
 * @autor José Miguel Martín Rojas
 * 
 */

package Ejercicio6;

public class Coche extends VTerrestres {
    
    private boolean aireAcond;

    public Coche(String matricula, String modelo, int numRuedas, boolean aireAcond) {
        super(matricula, modelo, numRuedas);
        this.aireAcond = aireAcond;
    }

    public void imprimir() {
        System.out.println("Coche " + modelo + " con matrícula " + matricula + ", un número de ruedas de " + numRuedas + " y aire acondicionado " + aireAcond);
    }
}
