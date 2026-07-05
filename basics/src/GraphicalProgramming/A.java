package GraphicalProgramming;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class A extends JPanel {

    private ShapeObject[] shapes;
    private ShapeObject selectedShape = null;
    private int offsetX, offsetY;
    private final int SNAP_DISTANCE = 20;


    public A() {
        // Create shapes
        shapes = new ShapeObject[]{
                new ShapeObject(50, 50, 80, "circle"),
                new ShapeObject(200, 200, 80, "square")
        };

        // Mouse handler for dragging and snapping
        MouseAdapter mouseHandler = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                for (ShapeObject s : shapes) {
                    if (s.contains(e.getPoint())) {
                        selectedShape = s;
                        offsetX = e.getX() - s.x;
                        offsetY = e.getY() - s.y;
                        break;
                    }
                }
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                if (selectedShape != null) {
                    selectedShape.x = e.getX() - offsetX;
                    selectedShape.y = e.getY() - offsetY;

                    snapToEdges(selectedShape);
                    repaint();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                selectedShape = null;
            }
        };

        addMouseListener(mouseHandler);
        addMouseMotionListener(mouseHandler);

        setPreferredSize(new Dimension(500, 400));
        setBackground(Color.WHITE);
    }

    private void snapToEdges(ShapeObject s) {
        int panelWidth = getWidth();
        int panelHeight = getHeight();

        // Snap left/right
        if (s.x <= SNAP_DISTANCE)
            s.x = 0;
        if (s.x + s.size >= panelWidth - SNAP_DISTANCE)
            s.x = panelWidth - s.size;

        // Snap top/bottom
        if (s.y <= SNAP_DISTANCE)
            s.y = 0;
        if (s.y + s.size >= panelHeight - SNAP_DISTANCE)
            s.y = panelHeight - s.size;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (ShapeObject s : shapes) {
            s.draw(g);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Drag and Drop Shapes with Snapping");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            A panel = new A();

            frame.setContentPane(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}

class ShapeObject {
    int x, y, size;
    String type;

    public ShapeObject(int x, int y, int size, String type) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.type = type;
    }

    public void draw(Graphics g) {
        g.setColor(type.equals("circle") ? Color.BLUE : Color.RED);
        if (type.equals("circle")) {
            g.fillOval(x, y, size, size);
        } else {
            g.fillRect(x, y, size, size);
        }
    }

    public boolean contains(Point p) {
        if (type.equals("circle")) {
            int centerX = x + size / 2;
            int centerY = y + size / 2;
            double distance = Math.sqrt(Math.pow(p.x - centerX, 2) + Math.pow(p.y - centerY, 2));
            return distance <= size / 2.0;
        } else {
            return new Rectangle(x, y, size, size).contains(p);
        }
    }
}
