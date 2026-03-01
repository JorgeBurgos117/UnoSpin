package menuPrincipal;

import styles.CustomLabel;
import styles.RoundButton;
import styles.RoundTextfield;
import styles.Style;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PnlConfigurarJugador extends JPanel {

    Style style = new Style();
    FrmPrincipal frame;

    RoundButton btnColor[] = new RoundButton[style.cantidadColores];
    Color colores[] = new Color[style.cantidadColores];


    CustomLabel lblTitulo = new CustomLabel("Jugador");
    CustomLabel lblUsuario = new CustomLabel("Nombre de usuario: ");
    RoundTextfield txfdUsuario = new RoundTextfield("Usuario");
    CustomLabel lblColorCartas = new CustomLabel("Color de las cartas");
    CustomLabel lblAvatar = new CustomLabel("Avatar");
    //Botones
        //color de las cartas
    JPanel colorCartas = new JPanel();

/*
    RoundButton btnColor1 = new RoundButton("1");
    RoundButton btnColor2 = new RoundButton("2");
    RoundButton btnColor3 = new RoundButton("3");
    RoundButton btnColor4 = new RoundButton("4");
 */
        //avatar
    JPanel avatar = new JPanel();
    RoundButton btnAvatar1 = new RoundButton(":)");
    RoundButton btnAvatar2 = new RoundButton(":3");
    RoundButton btnAvatar3 = new RoundButton("XD");
    RoundButton btnAvatar4 = new RoundButton(":v");
        //controles
    RoundButton btnAceptar = new RoundButton("Continuar", Color.GREEN);
    RoundButton btnCancelar = new RoundButton("Regresar", Color.RED);

    public PnlConfigurarJugador(FrmPrincipal frame) {

        this.frame = frame;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        //Fábrica de botones para seleccionar color
        for (int i = 0; i < style.cantidadColores; i++) {

            Color colorDefault;
            switch (i) {
                case 0:
                    colorDefault = Color.RED;
                    break;
                case 1:
                    colorDefault = Color.BLUE;
                    break;
                case 2:
                    colorDefault = Color.YELLOW;
                    break;
                case 3:
                    colorDefault = Color.GREEN;
                    break;
                default:
                    colorDefault = new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256));
            }
            colores[i] = colorDefault;
            btnColor[i] = new RoundButton("Color " + (i+1), colorDefault);
            int j = i;
            btnColor[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    Color colorSeleccionado = JColorChooser.showDialog(frame, "Selecciona un color", colorDefault);
                    if (colorSeleccionado != null) {
                        btnColor[j].setColor(colorSeleccionado);
                        colores[j] = colorSeleccionado;
                        System.out.println(colores[j]);
                    }
                }
            });
            colorCartas.add(btnColor[i]);
            //repaint();
            revalidate();
        }

        /*
        colorCartas.add(btnColor1);
        colorCartas.add(btnColor2);
        colorCartas.add(btnColor3);
        colorCartas.add(btnColor4);
         */
        avatar.add(btnAvatar1);
        avatar.add(btnAvatar2);
        avatar.add(btnAvatar3);
        avatar.add(btnAvatar4);

        add(lblTitulo);
        add(lblUsuario);
        add(txfdUsuario);
        add(lblColorCartas);
        add(colorCartas);
        add(lblAvatar);
        add(avatar);
        add(btnAceptar);
        add(btnCancelar);

        btnAceptar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                continuar();
            }
        });

        btnCancelar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cancelar();
            }
        });

    }

    public void continuar() {
        System.out.println("Continuar hacia el lobby");
    }

    public void cancelar() {
        frame.pantallaPrincipal();
    }
}
