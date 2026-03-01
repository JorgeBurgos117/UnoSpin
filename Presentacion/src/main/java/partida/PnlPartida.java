package partida;

import menuPrincipal.FrmPrincipal;
import styles.CustomLabel;
import styles.RoundButton;
import styles.RoundPanel;
import styles.Style;
import styles.cartas.CartaNormal;

import javax.swing.*;
import java.awt.*;

public class PnlPartida extends JPanel {

    Style style = new Style();

    FrmPrincipal frame;

    JPanel north = new JPanel();
    RoundButton btnSalir = new RoundButton("Salir", Color.RED);

    JPanel center = new JPanel();
    PnlRuleta ruleta = new PnlRuleta();

    JPanel south = new JPanel();
    RoundPanel previewCarta = new RoundPanel(Color.WHITE, style.cornerRadius);
    CustomLabel lblPreview = new CustomLabel("Tu carta: ");
    PnlMano pnlMano = new PnlMano();
    RoundButton btnUno = new RoundButton("¡UNO!", Color.yellow);

    PnlJugador jugador1;
    PnlJugador jugador2;
    PnlJugador jugador3;

    public PnlPartida(FrmPrincipal frame) {

        this.frame = frame;

        //Establecimiento del panel
        setSize(style.dimensionFrame);
        setMaximumSize(style.dimensionFrame);
        setMinimumSize(style.dimensionFrame);
        setPreferredSize(style.dimensionFrame);
        setBackground(style.colorPartida);
        setLayout(new BorderLayout());

        //jugadores falsos
        testeo();

        //north
        north.setOpaque(false);
        north.add(btnSalir, BorderLayout.WEST);
        north.add(jugador2, BorderLayout.CENTER);
        north.add(new JLabel("")); //espaciador

        //center
        center.setOpaque(false);
        center.add(jugador1);
        center.add(new CartaNormal(Color.RED, 1, false)); //placeholder
        center.add(ruleta);
        center.add(new CartaNormal(Color.GRAY, 0, false)); //ph
        center.add(jugador3);

        //south
        south.setOpaque(false);
        south.setLayout(new BorderLayout());
            //preview
        previewCarta.setLayout(new BoxLayout(previewCarta, BoxLayout.Y_AXIS));
        previewCarta.add(lblPreview);
        south.add(previewCarta, BorderLayout.WEST);
        south.add(pnlMano, BorderLayout.CENTER);
        south.add(btnUno, BorderLayout.EAST);

        //adds finales
        add(north, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);
        add(south, BorderLayout.SOUTH);

    }

    public void testeo() {
        //jugadores para test
        jugador1 = new PnlJugador("Gustave", "placeholder", 33);
        jugador2 = new PnlJugador("Verso", "placeholder", 3);
        jugador3 = new PnlJugador("Alicia", "placeholder", 16);

    }

}
