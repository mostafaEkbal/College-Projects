import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class Tma extends JApplet{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Tma");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new Tma();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
    }

    public void init() {
        JPanel panel = new Q2();
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
        Timer timer = new Timer(200, this);
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

class Q2 extends JPanel implements ActionListener {
    public double rotationRate = 0;
    public int translationRange = 0;
    public int redChangingRate = 255;
    public int alphaChangingRate = 255;
    public boolean falling = true;

    public Q2() {
        setPreferredSize(new Dimension(1200, 800));
        setBackground(Color.white);
        Timer timer = new Timer(50, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        AffineTransform afr1 = new AffineTransform();
        AffineTransform afr2 = new AffineTransform();
        Rectangle2D r1 = new Rectangle2D.Double(200, 200, 100, 100);
        Rectangle2D r2 = new Rectangle2D.Double(200, 200, 100, 100);
        g2.setColor(new Color(redChangingRate, 0 , 0, alphaChangingRate));
        afr2.translate(0, translationRange);
        afr2.rotate(150.0f, r2.getX() + r2.getWidth() / 2, r2.getY() + r2.getHeight() /2);
        afr2.rotate(rotationRate, r2.getX() + r2.getWidth() / 2, r2.getY() + r2.getHeight() /2);
        g2.fill(afr2.createTransformedShape(r2));
        AlphaComposite a = AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, 1f);
        g2.setComposite(a);
        afr1.translate(0, translationRange);
        afr1.rotate(rotationRate, r1.getX() + r1.getWidth() / 2, r1.getY() + r1.getHeight() /2);
        g2.fill(afr1.createTransformedShape(r1));
    }

    public void actionPerformed(ActionEvent e) {
        rotationRate += 45.0f;
        if(rotationRate == 360) rotationRate= 45.0f;
        if(translationRange == getHeight() - 300 ) {
            falling = false;
            alphaChangingRate = 255;
            redChangingRate = 0;
        }
        if(translationRange == getHeight() - 1000) {
            falling = true;
            alphaChangingRate = 255;
            redChangingRate = 255;
        }
        if(falling) {
            translationRange += 10;
            redChangingRate -= 3;
            alphaChangingRate -= 3;
            repaint();
            return;
        }
        translationRange -= 10;
        redChangingRate += 3;
        alphaChangingRate -= 3;
        repaint();
    }
}
