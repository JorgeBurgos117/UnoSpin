/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio.Cartas;

/**
 *
 * @author Jesus Gammael Soto Escalante 248336
 */
public class CartaNumerica {
    
    int numero;
    boolean esSpin;

    public CartaNumerica() {
    }

    public CartaNumerica(int numero, boolean esSpin) {
        this.numero = numero;
        this.esSpin = esSpin;
    }
    
    
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isEsSpin() {
        return esSpin;
    }

    public void setEsSpin(boolean esSpin) {
        this.esSpin = esSpin;
    }

    
    
    
    
}
