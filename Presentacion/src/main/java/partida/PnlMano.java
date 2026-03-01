package partida;

import styles.RoundButton;
import styles.Style;
import styles.cartas.cartaNormal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class PnlMano extends JPanel {

    Style style = new Style();
    ArrayList<cartaDTO> manoLogica = new ArrayList<>();
    ArrayList<cartaNormal> manoVisual = new ArrayList<>();

    public PnlMano() {
        setSize(style.dimensionMano);
        setMaximumSize(style.dimensionMano);
        setMinimumSize(style.dimensionMano);
        setPreferredSize(style.dimensionMano);

        setBackground(Color.CYAN);
        setOpaque(true);

        setLayout(null);


        testeo();

        actualizarMano();
    }

    public void actualizarMano() {
        removeAll();
        manoVisual.clear();

        //copiar el manoLogica lógico al visual
        for (int i = 0; i < manoLogica.size(); i++) {
            manoVisual.add(new cartaNormal(manoLogica.get(i).getColor(), manoLogica.get(i).getNumero(), manoLogica.get(i).esSpin));
        }

        int alineacion = 0;
        int incrementoAlineacion = (style.manoX-style.cartaX)/manoVisual.size();
        System.out.println(incrementoAlineacion);
        //agregar representación gráfica del manoLogica al panel
        for (int i = 0; i < manoLogica.size(); i++) {

            //test
            /*
            if(i == 0) {
                RoundButton btnPlus = new RoundButton("carta", Color.white);
                btnPlus.addActionListener(e -> {
                    System.out.println("Botón presionado");
                    manoLogica.add(new cartaDTO(5, new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)), false));
                    actualizarMano();
                });
                add(btnPlus);
            }*/

            add(manoVisual.get(i));
            manoVisual.get(i).setBounds(alineacion, (this.getHeight()-manoVisual.get(i).getHeight())/2, manoVisual.get(i).getWidth(), manoVisual.get(i).getHeight());
            alineacion = alineacion + incrementoAlineacion;
        }
    }





    public void testeo() {
        System.out.println("Testeo: PnlMano");
        manoLogica.add(new cartaDTO(7, Color.PINK, false));
        manoLogica.add(new cartaDTO(8, Color.RED, false));
        manoLogica.add(new cartaDTO(9, Color.GREEN, false));

        manoLogica.add(new cartaDTO(4, Color.BLUE, false));
        manoLogica.add(new cartaDTO(5, Color.YELLOW, false));
        manoLogica.add(new cartaDTO(7, Color.PINK, false));
        manoLogica.add(new cartaDTO(8, Color.RED, false));
        manoLogica.add(new cartaDTO(9, Color.GREEN, false));
        manoLogica.add(new cartaDTO(4, Color.BLUE, false));
        manoLogica.add(new cartaDTO(5, Color.YELLOW, false));
        manoLogica.add(new cartaDTO(7, Color.PINK, false));
        manoLogica.add(new cartaDTO(8, Color.RED, false));
        manoLogica.add(new cartaDTO(9, Color.GREEN, false));
        manoLogica.add(new cartaDTO(4, Color.BLUE, false));
        manoLogica.add(new cartaDTO(8, Color.RED, false));
        manoLogica.add(new cartaDTO(9, Color.GREEN, false));
        manoLogica.add(new cartaDTO(4, Color.BLUE, false));

        manoLogica.add(new cartaDTO(5, Color.ORANGE, false));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("click (mano)");
            }
        });

        RoundButton btnPlus = new RoundButton("carta", Color.white);
        btnPlus.addActionListener(e -> {
            System.out.println("Botón presionado");
            manoLogica.add(new cartaDTO(5, new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)), false));
            actualizarMano();
        });
        add(btnPlus);
    }

    //inner class para que no me suelte error y hacer testeo
    public class cartaDTO {
        int numero;
        Color color;
        boolean esSpin;

        public cartaDTO(int numero, Color color, boolean esSpin) {
            this.numero = numero;
            this.color = color;
            this.esSpin = esSpin;
        }

        public boolean isEsSpin() {
            return esSpin;
        }
        public void setEsSpin(boolean esSpin) {
            this.esSpin = esSpin;
        }
        public Color getColor() {
            return color;
        }
        public void setColor(Color color) {
            this.color = color;
        }
        public int getNumero() {
            return numero;
        }
        public void setNumero(int numero) {
            this.numero = numero;
        }
    }
}
