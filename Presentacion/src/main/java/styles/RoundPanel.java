package styles;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class RoundPanel extends JPanel {

    Style style = new Style();

    int cornerRadius;
    Color color;

    //Solo usar para generar la carta
    public RoundPanel(Color color) {
        this.cornerRadius = style.cornerRadiusCarta;
        this.color = color;
        setOpaque(false);
    }

    //Uso general
    public RoundPanel(Color color, int cornerRadius) {
        this.cornerRadius = cornerRadius;
        this.color = color;
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(color);
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius));
        g2.dispose();
    }
}
