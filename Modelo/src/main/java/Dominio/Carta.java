/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author Jesus Gammael Soto Escalante 248336
 */
public class Carta {
    
    long id;
    int color; //1 rojo, 2 azul, 3 verde, 4 amarillo
    int puntaje;

    public Carta() {
    }

        
    
    public Carta(long id, int color, int puntaje) {
        this.id = id;
        this.color = color;
        this.puntaje = puntaje;
    }

    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    

    
    
    
    
    
}
