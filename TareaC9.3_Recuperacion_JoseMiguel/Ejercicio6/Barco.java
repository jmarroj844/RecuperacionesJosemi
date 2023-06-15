/*
 * 
 * @autor José Miguel Martín Rojas
 * 
 */

package Ejercicio6;

public class Barco extends VAcuatico{
    
    private boolean motor;

    public Barco(String matricula, String modelo, int eslora, boolean motor) {
        super(matricula, modelo, eslora);
        this.motor = motor;
    }

    public void imprimir() {
        System.out.println("Barco " + modelo + " con matrícula " + matricula +", una eslora de " + eslora +" y motor " + motor);
    }
}
