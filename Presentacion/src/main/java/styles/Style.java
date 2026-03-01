package styles;

import java.awt.*;

public class Style {

    /* NOTAS DE ESTTILO:
    Nombramiento de variables (porque luego se me olvida el formato)
        -label "ejemplo" = lblNombre
        -textfield "ejemplo" = txfdEjemplo
        -button "ejemplo" = btnEjemplo
        -contenedor "ejemplo" = contEjemplo
    */

    //Número de colores de cartas
    public static final int cantidadColores = 4;

    //Constantes de estilo
        //Qué tan redonditos están los bordes
    public static final int cornerRadius = 25;
    public static final int letraSize = 24;

    //Dimensiones
        //Lienzo
    public static final int frameX = 1080;
    public static final int frameY = 720;
    public static final Dimension dimensionFrame = new Dimension(frameX, frameY);
        //Botones
    public static final int botonX = 200;
    public static final int botonY = 100;
    public static final Dimension dimensionBoton = new Dimension(botonX, botonY);
        //Textfield
    public static final int textFieldX = 200;
    public static final int textFieldY = 100;
    public static final Dimension dimensionTextfield = new Dimension(textFieldX, textFieldY);
        //Mano
    public static final int manoX = (frameX/4)*3;
    public static final int manoY = frameY/4;
    public static final Dimension dimensionMano = new Dimension(manoX, manoY);
        //Cartas
            //Carta base
    /*
    public static final int cartaX = frameY/4;
    public static final int cartaY = (int)(cartaX*1.6);
     */
    public static final int cartaY = manoY-20;
    public static final int cartaX = (int)(cartaY/1.6);
    public static final Dimension dimensionCarta = new Dimension(cartaX, cartaY);
            //Subcarta (para pintar bordes
    public static final int cornerRadiusCarta = (int)(cartaX/3.5);
    public static final int bordeCarta = (int)(cartaX/10);
    public static final int subCartaX = cartaX-bordeCarta;
    public static final int subCartaY = cartaY - bordeCarta;
    public static final Dimension dimensionSubCarta= new Dimension(subCartaX, subCartaY);


    //Colores
        //Principal
    public static final Color colorBase = new Color(122, 0, 0);
    public static final Color colorPrincipal = new Color(207, 0, 0);
    public static final Color colorPrincipalHover = new Color(255, 0, 0);
    public static final Color colorSecundario = new Color(255, 196, 0);
    public static final Color colorSecundarioHover = new Color(255, 204, 0);
    public static final Color colorAcento = new Color(255, 115, 0);
    public static final Color colorTexto = new Color(0, 0, 0);
        //Adicional
    public static final Color colorTextoTextfield = new Color(0, 0, 0);




    public Style() {
    }
}
