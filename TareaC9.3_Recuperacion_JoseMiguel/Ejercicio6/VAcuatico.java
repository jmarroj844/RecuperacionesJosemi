/*
 * 
 * @autor José Miguel Martín Rojas
 * 
 */

package Ejercicio6;

public abstract class VAcuatico extends Vehiculo {
    
    protected int eslora;

    public VAcuatico(String matricula, String modelo, int eslora) {
        super(matricula, modelo);
        this.eslora = eslora;
    }
}