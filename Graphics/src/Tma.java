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
        JApplet applete = new Tma();
        applete.init();
        frame.getContentPane().add(applete);
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
    double r = Math.random() * 100;
    private int x1, y1, x2, y2;

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
        Shape glyph = gv.getOutline(100, 200);
        g2.clip(glyph);


        for (Line line : lines) {
            g2.drawLine((int) line.x1, (int) line.y1, (int) line.x2, (int) line.y2);
        }

        // Generate random coordinates for the new line
        double x1 = Math.random() * getWidth();
        double y1 = Math.random() * getHeight();
        double x2 = Math.random() * getWidth();
        double y2 = Math.random() * getHeight();

        // Store the new line
        lines.add(new Line(x1, y1, x2, y2));
    }
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
