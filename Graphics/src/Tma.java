import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.util.ArrayList;

public class Tma extends JApplet{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("TmaQ1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new Tma();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
    }

    public void init() {
        JPanel panel = new Q1();
        getContentPane().add(panel);
    }
}

class Line {
    double x1, y1, x2, y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
}

class Q1 extends JPanel implements ActionListener {

    ArrayList<Line> lines = new ArrayList<>();

    public Q1() {
        setPreferredSize(new Dimension(1600, 800));
        setBackground(Color.white);
        Timer timer = new Timer(500, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Font font = new Font("Serif", Font.BOLD, 150);
        FontRenderContext frc = g2.getFontRenderContext();
        GlyphVector gv = font.createGlyphVector(frc, "TMA240 TMA");
        Shape glyph = gv.getOutline(200, 400);
        g2.clip(glyph);


        for (Line line : lines) {
            // draw the early generated lines
            g2.drawLine((int) line.x1, (int) line.y1, (int) line.x2, (int) line.y2);
        }

        for (int i = 0; i < 100; i++) {
            // Generate random coordinates for the new line
            Line l = new Line((int) (Math.random() * getWidth()), (int) (Math.random() * getHeight()), (int) (Math.random() * getWidth()), (int) (Math.random() * getHeight()));
            g2.drawLine((int) l.x1, (int) l.y1, (int) l.x2, (int) l.y2);
            // Store the new line
            lines.add(l);
        }

    }
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
