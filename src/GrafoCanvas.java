import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.*;

class GrafoCanvas extends JPanel {
    private Map<String, Point> posiciones;
    private Grafo grafo;

    public GrafoCanvas(Grafo grafo) {
        this.grafo = grafo;
        posiciones = new HashMap<>();
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                asignarPosiciones();
                repaint(); 
            }
        });
    }

    private void asignarPosiciones() {
        int canvasWidth = getWidth();
        int canvasHeight = getHeight();

        int xCenter = canvasWidth / 2;
        int yCenter = canvasHeight / 2;
        posiciones.put("UMB", new Point(xCenter, yCenter));

        int numVertices = grafo.obtenerVertices().size() - 1;
        if (numVertices > 0) {
            double angleStep = 2 * Math.PI / numVertices;
            double angle = 0;
            int radius = Math.min(canvasWidth, canvasHeight) / 3;

            for (String vertice : grafo.obtenerVertices()) {
                if (!vertice.equals("UMB")) {
                    int x = (int) (xCenter + radius * Math.cos(angle));
                    int y = (int) (yCenter + radius * Math.sin(angle));

                    x = Math.max(20, Math.min(canvasWidth - 40, x));
                    y = Math.max(20, Math.min(canvasHeight - 40, y));

                    posiciones.put(vertice, new Point(x, y));
                    angle += angleStep;
                }
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK); 
        for (String vertice : grafo.obtenerVertices()) {
            Point p1 = posiciones.get(vertice);
            Map<String, Double> vecinos = grafo.obtenerVecinos(vertice);
            for (Map.Entry<String, Double> vecino : vecinos.entrySet()) {
                if (!vertice.equals("UMB")) {
                    Point p2 = posiciones.get(vecino.getKey());
                    g.drawLine(p1.x + 10, p1.y + 10, p2.x + 10, p2.y + 10);
                    g.drawString(String.valueOf(vecino.getValue()), (p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
                }
            }
        }

        
        for (String vertice : grafo.obtenerVertices()) {
            Point p1 = posiciones.get(vertice);

           
            g.setColor(Color.RED); 
            g.fillOval(p1.x, p1.y, 20, 20);
            g.drawString(vertice, p1.x - 10, p1.y - 10);
        }
    }

}