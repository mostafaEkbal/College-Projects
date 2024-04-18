import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import java.util.EventListener;
import java.util.Random;

public class Skel extends JApplet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setTitle("Graphics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applete = new Skel();
        applete.init();
        frame.getContentPane().add(applete);
        frame.pack();
        frame.setVisible(true);
    }

    public void init() {
        JPanel panel = new JApp1Panel();
        getContentPane().add(panel);
    }

}

class JApp1Panel extends JPanel {
    public JApp1Panel() {
        setPreferredSize(new Dimension(800, 800));
    }

    public Arc2D createEarLeft(double x, double y) {
        return new Arc2D.Double(x, y, 75, 100, 90, 180, Arc2D.OPEN);
    }

    public Arc2D createEarRight(double x, double y) {
        return new Arc2D.Double(x, y, 75, 100, 270, 180, Arc2D.OPEN);
    }

    public Ellipse2D createEye(double x, double y) {
        return new Ellipse2D.Double(x, y, 25, 25);
    }

    public QuadCurve2D createEyebrow(double x, double y) {
        return new QuadCurve2D.Double(x, y, x + 25, y - 25, x + 50, y);
    }

    public CubicCurve2D createNose(double x, double y) {
        return new CubicCurve2D.Double(x, y, x - 50, y + 25, x + 50, y + 75, x - 25, y + 100);
    }

    public QuadCurve2D createSmile(double x, double y) {
        return new QuadCurve2D.Double(x, y, x + 50, y + 50, x + 100, y);
    }

    public GeneralPath createCar() {
        GeneralPath gp = new GeneralPath();
        gp.moveTo(100, 300);
        gp.lineTo(200, 300);
        gp.lineTo(300, 200);
        gp.quadTo(600, 175, 650, 400);
        gp.lineTo(550, 400);
        gp.quadTo(500, 475, 450, 400);
        gp.lineTo(250, 400);
        gp.quadTo(200, 475, 150, 400);
        gp.lineTo(100, 400);
        gp.closePath();

        return gp;
    }

    public GeneralPath drawRabbitHead() {
        GeneralPath gp = new GeneralPath();

        return gp;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Arc2D arc = new Arc2D.Float(400, 300, 300, 200, 140, 280, Arc2D.OPEN);
        g2.draw(arc);

        // Lesson 11
        // BufferedImage im = null;
        // try {
        // im = ImageIO.read(new File("N:\\about-image.png"));
        // } catch (IOException e) {
        // System.out.println('e');
        // }

        // assert im != null;
        // g2.drawImage(im, 0, 0, this);

        // RescaleOp li = new RescaleOp(1.2f, 0, null);
        // g2.drawImage(li.filter(im, null), 0, im.getHeight(), this);

        // RescaleOp da = new RescaleOp(.75f, 0, null);
        // g2.drawImage(da.filter(im, null), im.getWidth(), 0, this);

        // RescaleOp in = new RescaleOp(-1f, 255, null);
        // g2.drawImage(in.filter(im, null), im.getWidth() * 2, 0, this);

        // float[] sharpeningData = { 0f, -1f, 0f, -1f, 5f, -1f, 0f, -1f, 0f };
        // Kernel ker1 = new Kernel(3, 3, sharpeningData);
        // ConvolveOp op1 = new ConvolveOp(ker1);
        // g2.drawImage(op1.filter(im, null), im.getWidth(), im.getHeight(), this);
        // float[] noiseReductionData = { 1 / 9f, 1 / 9f, 1 / 9f, 1 / 9f, 1 / 9f, 1 /
        // 9f, 1 / 9f, 1 / 9f, 1 / 9f };
        // Kernel ker2 = new Kernel(3, 3, noiseReductionData);
        // ConvolveOp op2 = new ConvolveOp(ker2);
        // g2.drawImage(op2.filter(im, null), 0, 0, this);

        // AffineTransform xForm = new AffineTransform();
        // xForm.setToRotation(Math.PI / 4, im.getWidth(), im.getHeight() * 3);
        // AffineTransformOp op3 = new AffineTransformOp(xForm,
        // AffineTransformOp.TYPE_BILINEAR);
        // g2.drawImage(op3.filter(im, null), 0, 0, this);

        // dashed line
        // g2.setStroke(new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL,
        // 0, new float[]{10.0f, 10.0f}, 0));

        // fill gradient
        // GradientPaint paint = new GradientPaint(100, 200, Color.red, 105, 200,
        // Color.green, true);
        // g2.setPaint(paint);
        // g2.fillRect(0, 0, 1000, 1000);

        // Composite and transparency
        // Ellipse2D e = new Ellipse2D.Double(100, 100, 300, 100);
        //
        // g2.fill(e);
        //
        // AlphaComposite a = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f);
        // g2.setComposite(a);
        //
        // AffineTransform af = new AffineTransform();
        // af.rotate(Math.PI / 2, 100+ 150, 100 + 50);
        // g2.setColor(Color.CYAN);
        // g2.fill(af.createTransformedShape(e));

        // lesson 5
        // Font font = new Font("Serif", Font.BOLD, 150);
        // AffineTransform af = new AffineTransform();
        //
        // FontRenderContext frc = g2.getFontRenderContext();
        // GlyphVector gv = font.createGlyphVector(frc, "Java");
        // Shape glyph = gv.getOutline(100, 200);
        // g2.clip(glyph);
        // Ellipse2D e = new Ellipse2D.Double(0, 0, 25, 25);
        // g2.draw(e);
        // for (int i = 0; i < 100; i++){
        // af.setToTranslation(0, i*10);
        // for (int j = 0; j < 100; j++){
        // af.translate(10, 0);
        // g2.draw(af.createTransformedShape(e));
        // }
        //
        // }

        // lesson 4
        // AffineTransform af = new AffineTransform();
        // g2.translate(300, 200);
        // Rectangle2D rect = new Rectangle2D.Double(20, 20, 100, 100);
        // af.setToTranslation(120, 120);
        // g2.draw(rect);
        // g2.draw(af.createTransformedShape(rect));
        // af.setToRotation(Math.PI / 6, 20+ .5 * 100, 20 + .5*100);
        // g2.draw(af.createTransformedShape(rect));
        // af.setToScale(2.5, 2.5);
        // g2.draw(af.createTransformedShape(rect));
        // af.setToShear(1.0, 0);
        // g2.draw(af.createTransformedShape(rect));

        // Face Activity
        // Ellipse2D head = new Ellipse2D.Double(100, 0, 300, 350);
        // g2.draw(head);
        // g2.draw(createEarLeft(67, 125));
        // g2.draw(createEarRight(357, 125));
        // g2.draw(createEye(175, 75));
        // g2.draw(createEye(300, 75));
        // g2.draw(createEyebrow(160, 70));
        // g2.draw(createEyebrow(285, 70));
        // g2.draw(createNose(255, 125));
        // g2.draw(createSmile(200, 260));

        // Third Lesson Part 1
        // Arc2D arc = new Arc2D.Double(100, 100, 100, 100, 0, 90, Arc2D.PIE);
        // Area a1 = new Area(arc);
        // g2.draw(arc);
        // int[] xPoly = {150,175,200,325,350,275,100};
        // int[] yPoly = {150,125,150,175,200,250,225};
        // Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);
        // Area a2 = new Area(poly);
        // g2.setColor(Color.red);
        // g2.draw(poly);
        // a1.add(a2);
        // g2.translate(0, 200);
        // g2.draw(a1);
        // g2.fill(a1);
        // a1.subtract(a2);
        // g2.translate(180, 0);
        // g2.draw(a1);
        // g2.fill(a1);
        // g2.translate(180, 0);
        // a1.intersect(a2);
        // g2.setColor(Color.CYAN);
        // g2.draw(a1);
        // g2.fill(a1);
        // g2.translate(0, 100);
        // a1.exclusiveOr(a2);
        // g2.setColor(Color.black);
        // g2.draw(a1);
        // g2.fill(a1);

        // Second Lesson
        // g2.translate(200, 200);
        // double r1=60.0f, r2=50.0f, p=70.0f;
        // double a=100, b=200, kx=3, ky=2;
        // double t=0;
        // double minRange=0, maxRange=2*Math.PI;
        // int nPoints=1000;
        // double x1 = a * Math.cos(kx * t);
        // double y1 = b * Math.sin(ky * t);
        // double x2;
        // double y2;
        // for (int i=1; i<nPoints; i+=5){
        // t= 12*Math.PI/nPoints* i;
        // x2 = a * Math.cos(kx * t);
        // y2 = b * Math.sin(ky * t);
        // g2.drawLine((int) x1, (int)y1, (int)x2, (int)y2);
        // x1=x2;
        // y1=y2;}

        // First Lesson
        // for(int i = 0; i <= 100; i++) {
        // g.drawLine(0,i * 10, 1000 - i * 10, 1000);
        // g.drawLine(1000, i * 10, i * 10, 1000);
        //
        // g.drawLine(i * 10,0, 1000, 1000 - i * 10);
        // g.drawLine(1000 - i * 10, 0, 0, 1000 - i * 10);
        // }
    }

}// end of JApp1Panel class