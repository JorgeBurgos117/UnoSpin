package styles;

import java.awt.*;

public class Style {

    //Constantes de estilo
    public static final int cornerRadius = 25;
    public static final int letraSize = 24;

    //Dimensiones
        //Canvas
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


    //Colores
        //Principal
    public static final Color colorBase = new Color(255, 255, 255);
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
