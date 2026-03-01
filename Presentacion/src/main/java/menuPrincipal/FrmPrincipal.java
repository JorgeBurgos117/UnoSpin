package menuPrincipal;

import partida.PnlPartida;
import styles.Style;

import javax.swing.*;

public class FrmPrincipal extends JFrame {

    Style style = new Style();
    JPanel contenido;

    public FrmPrincipal( ) {

        //Establecimiento del frame
        setSize(style.dimensionFrame);
        getContentPane().setBackground(style.colorBase);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //pantallaPrincipal();
        verPartida();

        repaint();
        setVisible(true);
    }

    public void limpiarContenido() {
        if(contenido != null) {
            remove(contenido);
        }
        repaint();
        revalidate();
    }

    public void pantallaPrincipal() {
        limpiarContenido();
        contenido = new PnlPantallaPrincipal(this);
        add(contenido);
        repaint();
        revalidate();
    }

    public void configurarPartida() {
        limpiarContenido();
        contenido = new PnlConfigurarPartida(this);
        add(contenido);
        repaint();
        revalidate();
    }

    public void unirsePartida(){
        configurarJugador();
    }

    public void configurarJugador() {
        limpiarContenido();
        contenido = new PnlConfigurarJugador(this);
        add(contenido);
        //repaint();
        revalidate();
    }

    public void verLobby() {
        limpiarContenido();
    }

    public void verPartida() {
        limpiarContenido();
        contenido = new PnlPartida(this);
        add(contenido);
        revalidate();
    }

}
