package partida;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class PnlRuleta extends JPanel {

    int sections = 8;
    double angle = 0;
    double speed = 0;
    Timer timer;
    Random random = new Random();

    public PnlRuleta() {
        setPreferredSize(new Dimension(400, 400));
        setOpaque(false);

        timer = new Timer(16, (ActionEvent e) -> {
            angle += speed;
            speed *= 0.985; // desaceleración

            if (speed < 0.002) {
                speed = 0;
                timer.stop();
            }

            repaint();
        });

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("click (ruleta)");
                spin();
            }
        });
    }

    public void spin() {
        if (!timer.isRunning()) {
            speed = 0.3 + random.nextDouble() * 0.3;
            timer.start();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int size = Math.min(getWidth(), getHeight()) - 20;
        int x = (getWidth() - size) / 2;
        int y = (getHeight() - size) / 2;

        double arcAngle = 360.0 / sections;

        for (int i = 0; i < sections; i++) {
            g2.setColor(Color.getHSBColor((float) i / sections, 0.8f, 0.9f));
            g2.fillArc(
                    x,
                    y,
                    size,
                    size,
                    (int) Math.toDegrees(angle) + (int) (i * arcAngle),
                    (int) arcAngle
            );
        }

        // Centro decorativo
        g2.setColor(Color.WHITE);
        g2.fillOval(getWidth()/2 - 30, getHeight()/2 - 30, 60, 60);

        g2.dispose();
    }
}