package styles.cartas;

import styles.CustomLabel;
import styles.RoundPanel;
import styles.Style;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class cartaNormal extends JPanel {

    Style style = new Style();

    //valores default para testeo
    Color color = new Color(89, 89, 89);
    int numero = 7;
    boolean esSpin = false;

    //sandwichito de capas para dibujar la carta
    RoundPanel baseBlanca = new RoundPanel(color.WHITE);
    RoundPanel baseColor;
    JPanel circuloBlanco = new JPanel();
    CustomLabel lblNumero;
    CustomLabel lblNumerito1;
    CustomLabel lblNumerito2;
    JPanel acomodo = new JPanel();

    public cartaNormal(Color color, int numero, boolean esSpin) {

        this.color = color;
        this.numero = numero;
        this.esSpin = esSpin;

        //Establecimiento
        setSize(style.dimensionCarta);
        setMaximumSize(style.dimensionCarta);
        setMinimumSize(style.dimensionCarta);
        setPreferredSize(style.dimensionCarta);
        setOpaque(false);
        setLayout(new OverlayLayout(this));

        //Borde blanco
        baseBlanca.setSize(style.dimensionCarta);
        baseBlanca.setMaximumSize(style.dimensionCarta);
        baseBlanca.setMinimumSize(style.dimensionCarta);
        baseBlanca.setPreferredSize(style.dimensionCarta);
        baseBlanca.setOpaque(true);

        //Color base
        baseColor = new RoundPanel(color);
        baseColor.setSize(style.dimensionSubCarta);
        baseColor.setMaximumSize(style.dimensionSubCarta);
        baseColor.setMinimumSize(style.dimensionSubCarta);
        baseColor.setPreferredSize(style.dimensionSubCarta);

        //Círculo blanco
        circuloBlanco = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(Color.WHITE);
                int width = (int) (style.cartaX/1.5);
                int height = (int)(style.cartaY/1.05);
                int x = (int)(style.cartaX/7);
                int y = (int)(style.cartaY/16);
                double angle = Math.toRadians(35);
                // rotar alrededor del centro del óvalo
                g2.rotate(angle, x + width / 2.0, y + height / 2.0);
                g2.fillOval(x, y, width, height);
                g2.dispose();
                g2.dispose();
            }
        };
        circuloBlanco.setSize(style.dimensionCarta);
        circuloBlanco.setMaximumSize(style.dimensionCarta);
        circuloBlanco.setMinimumSize(style.dimensionCarta);
        circuloBlanco.setPreferredSize(style.dimensionCarta);
        circuloBlanco.setOpaque(false);


        //Número grande
        lblNumero = new CustomLabel(""+numero, (int) (style.cartaX/1.8));
        lblNumero.setForeground(color);
        lblNumero.setFont(lblNumero.getFont().deriveFont(Font.BOLD | Font.ITALIC));

        //Agregar simbolito de spin
        if(esSpin) {
            //agregar símbolo
        }

        //Numeritos de las esquinas
        lblNumerito1 = new CustomLabel("" +numero, style.cartaX/6);
        lblNumerito2 = new CustomLabel("" +numero, style.cartaX/6);
        lblNumerito1.setForeground(Color.WHITE);
        lblNumerito2.setForeground(Color.WHITE);
        lblNumerito1.setFont(lblNumerito1.getFont().deriveFont(Font.BOLD | Font.ITALIC));
        lblNumerito2.setFont(lblNumerito2.getFont().deriveFont(Font.BOLD | Font.ITALIC));

        //acomodo
        acomodo.setLayout(new GridLayout(3,3));
        acomodo.setSize(style.dimensionCarta);
        acomodo.setMaximumSize(style.dimensionCarta);
        acomodo.setMinimumSize(style.dimensionCarta);
        acomodo.setPreferredSize(style.dimensionCarta);
            //adds para acomodo
        acomodo.add(lblNumerito1);
        acomodo.add(new JLabel(""));
        acomodo.add(new JLabel(""));
        acomodo.add(new JLabel(""));
        acomodo.add(lblNumero);
        acomodo.add(new JLabel(""));
        acomodo.add(new JLabel(""));
        acomodo.add(new JLabel(""));
        acomodo.add(lblNumerito2);
        acomodo.setOpaque(false);

        //testeo
        testeo();

        //Agregar componentes
        add(acomodo);
        add(circuloBlanco);
        add(baseColor);
        add(baseBlanca);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("click (carta - " + color + ")");
            }
        });

        repaint();
        revalidate();
    }

    public void testeo() {
        acomodo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("click (acomodo)");
            }
        });
        circuloBlanco.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("click (circuloBlanco)");
            }
        });
        baseColor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("click (baseColor)");
            }
        });
        baseBlanca.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("click (baseBlanca)");
            }
        });
    }
}
