package menuPrincipal;

import styles.RoundButton;
import styles.Style;
import styles.cartas.cartaNormal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PnlPantallaPrincipal extends JPanel {

    Style style = new Style();
    FrmPrincipal frame;

    //Botones
    RoundButton btnCrearPartida = new RoundButton("Crear partida", Color.yellow);
    RoundButton btnUnirsePartida = new RoundButton("Unirse a partida", Color.yellow);

    public PnlPantallaPrincipal(FrmPrincipal frame) {

        //Establecimiento del panel
        this.frame = frame;
        setSize(style.dimensionFrame);
        setBackground(style.colorBase);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setOpaque(false);

        //Contenido
        add(btnCrearPartida);
        add(btnUnirsePartida);

        btnCrearPartida.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                crearPartida();
            }
        });

        btnUnirsePartida.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                unirsePartida();
            }
        });

        //Testeo
        //testeo();
    }

    void crearPartida() {
        System.out.println("Crear partida");
        frame.configurarPartida();
    }

    void unirsePartida() {
        System.out.println("Unirse a partida");
        frame.unirsePartida();
    }


    //Espacio para hacer testeo visual
    public void testeo() {

        add(new cartaNormal(Color.BLUE, 8, false));
        add(new cartaNormal(Color.RED, 2, false));
        add(new cartaNormal(Color.GREEN, 4, false));

        repaint();
        revalidate();
        System.out.println("testeo");
    }


}
