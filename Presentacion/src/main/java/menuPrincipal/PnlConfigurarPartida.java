package menuPrincipal;

import styles.RoundButton;
import styles.Style;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import styles.CustomLabel;
import styles.RoundTextfield;

public class PnlConfigurarPartida extends JPanel {

    Style style = new Style();
    
    //Variables para lógica
    
    //Labels e inputs
        //Contenedor
    JPanel contenido = new JPanel();
        //Titulo
    CustomLabel lblTitulo = new CustomLabel("Configurar partida");
        //1-Rango de cartas
    CustomLabel lblRangoCartas = new CustomLabel("Rango de cartas");
    CustomLabel lblMin1 = new CustomLabel("Mínimo: ");
    RoundTextfield txfdMin1 = new RoundTextfield("min");
    CustomLabel lblMax1 = new CustomLabel("Máximo: ");
    RoundTextfield txfdMax1 = new RoundTextfield("max");
        //2-Comodines
    CustomLabel lblComodines = new CustomLabel("Número de comodiens");
    CustomLabel lblMin2 = new CustomLabel("Mínimo: ");
    RoundTextfield txfdMin2 = new RoundTextfield("min");
    CustomLabel lblMax2 = new CustomLabel("Máximo: ");
    RoundTextfield txfdMax2 = new RoundTextfield("max");
        //3-Cartas de acción
    CustomLabel lblCartasAccion = new CustomLabel("Número de cartas de acción: ");
    CustomLabel lblMin3 = new CustomLabel("Mínimo: ");
    RoundTextfield txfdMin3 = new RoundTextfield("min");
    CustomLabel lblMax3 = new CustomLabel("Máximo: ");
    RoundTextfield txfdMax3 = new RoundTextfield("max");
        //4-Tiempo de turno
    CustomLabel lblTiempoTurno = new CustomLabel("Tiempo de turno: ");
    RoundTextfield txfdTiempo = new RoundTextfield("tiempo");
    
    //Botones
    RoundButton btnContinuar = new RoundButton("Continuar", Color.green);
    RoundButton btnCancelar = new RoundButton("Cancelar", Color.red);

    public PnlConfigurarPartida() {

        //Establecimiento del panel
        setSize(style.dimensionFrame);
        setBackground(style.colorBase);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        //Contenido
        contenido.setLayout(new GridLayout(5, 5));
            //Titulo
        //contenido.add(lblConfigurarPartida);
            //1-Rango
        contenido.add(lblRangoCartas);
        contenido.add(lblMin1);
        contenido.add(txfdMin1);
        contenido.add(lblMax1);
        contenido.add(txfdMax1);
            //2-Comodines
        contenido.add(lblComodines);
        contenido.add(lblMin2);
        contenido.add(txfdMin2);
        contenido.add(lblMax2);
        contenido.add(txfdMax2);
            //3-Cartas de acción
        contenido.add(lblCartasAccion);
        contenido.add(lblMin3);
        contenido.add(txfdMin3);
        contenido.add(lblMax3);
        contenido.add(txfdMax3);
            //4-Tiempo
        contenido.add(lblTiempoTurno);
        contenido.add(txfdTiempo);
            //Botones
        contenido.add(btnContinuar);
        contenido.add(btnCancelar);
        //Add
        add(contenido);

        btnContinuar.addMouseListener(new MouseAdapter() {
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

    void continuar() {
        System.out.println("Continuando hacia la configuración del jugador");
    }

    void cancelar() {
        System.out.println("Cancelando; regresando al menú principal");
    }

}
