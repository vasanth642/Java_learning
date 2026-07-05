package GraphicalProgramming;

import java.awt.*;
import javax.swing.*;

public class TwoDshape {
    public static void main(String[] args) {
        //creating a frame
        JFrame frame = new JFrame("2D shapes example");
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Graphics2D g2d = (Graphics2D) g;

                g2d.setColor(Color.RED);
                g2d.fillRect(50,50,100,100);

                g2d.setColor(Color.BLUE);
                g2d.drawOval(200,50,100,100);

                g2d.setColor(Color.CYAN);
                g2d.fillOval(120,200,150,100);
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
