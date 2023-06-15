/*
 * 
 * @autor José Miguel Martín Rojas
 * 
 */

package Ejercicio6;

public abstract class Vehiculo {
    
    protected String matricula;
    protected String modelo;

    public Vehiculo(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public abstract void imprimir();
}
