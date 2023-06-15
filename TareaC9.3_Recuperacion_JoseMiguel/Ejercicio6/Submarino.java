/*
 * 
 * @autor José Miguel Martín Rojas
 * 
 */

package Ejercicio6;

public class Submarino extends VAcuatico{
    
    private int profMaxima;

    public Submarino(String matricula, String modelo, int eslora, int profMaxima) {
        super(matricula, modelo, eslora);
        this.profMaxima = profMaxima;
    }

    public void imprimir() {
        System.out.println("Submarino " + modelo + " con matrícula " + matricula +", una eslora de " + eslora + " y profundidad máxima " + profMaxima);
    }
}
