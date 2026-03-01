package partida;

import styles.CustomLabel;
import styles.RoundPanel;
import styles.Style;

import javax.swing.*;
import java.awt.*;

public class PnlJugador extends JPanel {

    Style style = new Style();

    String nombreJugador;
    String avatar;
    int numCartas;

    CustomLabel lblNombreJugador;
    JLabel imgAvatar;
    CustomLabel lblNumCartas;

    RoundPanel pnlInfo = new RoundPanel(new Color(new java.util.Random().nextInt(256), new java.util.Random().nextInt(256), new java.util.Random().nextInt(256)), style.cornerRadius);

    //LÓGICA: pedir un jugadorDTO
    public PnlJugador(String nombreJugador, String avatar, int numCartas) {

        this.nombreJugador = nombreJugador;
        this.avatar = avatar;
        this.numCartas = numCartas;

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setOpaque(false);

        //temporal en lo quee sacamos una imagen
        avatar = "placeholder";

        lblNombreJugador = new CustomLabel(nombreJugador);
        imgAvatar = new JLabel(avatar);
        lblNumCartas = new CustomLabel("Cartas: " + numCartas);

        pnlInfo.setLayout(new BoxLayout(pnlInfo, BoxLayout.Y_AXIS));
        pnlInfo.add(lblNombreJugador);
        pnlInfo.add(lblNumCartas);

        add(imgAvatar);
        add(pnlInfo);

        revalidate();
    }

    public void actualizarNumCartas(int numCartas) {
        this.numCartas = numCartas;
        lblNumCartas.setText("Cartas: " + numCartas);
        revalidate();
    }
}
