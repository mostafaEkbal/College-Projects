import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.font.LineMetrics;
import java.awt.geom.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Skel extends JApplet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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

    public GeneralPath drawRabbitEars() {
        GeneralPath gp = new GeneralPath();
        gp.moveTo(235, 235);
        gp.quadTo(275, -50, 340, 230);
        gp.lineTo(360, 230);
        gp.quadTo(400, -50, 465, 235);

        return gp;
    }

    public Arc2D drawRabbitHead() {
        return new Arc2D.Float(200, 200, 300, 200, 140, 260, Arc2D.OPEN);
    }

    public void drawRabbitEye(Graphics2D g2) {
        Ellipse2D eye1 = new Ellipse2D.Double(250, 300, 15, 20);
        g2.fill(eye1);
        Ellipse2D eye2 = new Ellipse2D.Double(440, 300, 15, 20);
        g2.fill(eye2);
    }

    public void drawRabbitMouth(Graphics2D g2) {
        g2.drawLine(340 , 360, 360, 370);
        g2.drawLine(340 , 370, 360, 360);
    }

    public GeneralPath drawRabbitBody() {
        GeneralPath gp = new GeneralPath();
        gp.moveTo(250, 375);
        gp.quadTo(220, 400, 210, 450);
        gp.lineTo(250, 470);
        gp.lineTo(250, 450);
        gp.lineTo(250, 525);
        gp.quadTo(350, 560, 450, 525);
        gp.lineTo(450, 450);
        gp.moveTo(450, 470);
        gp.lineTo(490, 450);
        gp.quadTo(480, 410, 450,  375);
        gp.quadTo(350, 425, 250, 375);

        return gp;
    }

    public Ellipse2D drawRabbitButton() {
        return new Ellipse2D.Double(342.5, 405, 15, 15);
    }

    public void drawRabbitChemise(Graphics2D g2) {
        QuadCurve2D qd1 = new QuadCurve2D.Double(250, 375, 300, 435, 345, 400);
        g2.draw(qd1);
        QuadCurve2D qd2 = new QuadCurve2D.Double(450, 375, 400, 435, 355, 400);
        g2.draw(qd2);
    }

    public GeneralPath drawRabbitLegs() {
        GeneralPath gp = new GeneralPath();
        gp.moveTo(270, 530);
        gp.quadTo(250, 560, 270, 580);
        gp.lineTo(350, 580);
        gp.lineTo(350, 545);
        gp.moveTo(350, 580);
        gp.lineTo(430, 580);
        gp.quadTo(450, 560, 430, 530);

        return gp;
    }

    public void drawRabbitHands(Graphics2D g2) {
        QuadCurve2D qd1 = new QuadCurve2D.Double(210, 450, 200, 500, 250, 500);
        g2.draw(qd1);
        QuadCurve2D qd2 = new QuadCurve2D.Double(490, 450, 500, 500, 450, 500);
        g2.draw(qd2);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // lesson 13
//        double Zr=0,Zi=0;//Z
//        double Cr=0.2,Ci=0.3;//C
//        double magSq;
//        int [] rgb = new int[3];
//        int i;
//        for (i=0;i<512;i++)
//        {
//            double temp = Zr * Zr - Zi * Zi + Cr;//real part of Zn+1
//            Zi = 2 * Zr * Zi + Ci;//imaginary part of Zn+1
//            Zr = temp;
//            magSq = Zr * Zr + Zi * Zi;
//            if (magSq>=4)
//                break;
//        }



        // draw spider house
//        g2.translate(400, 300);
//        double t = 0;
//        double x2, y2;
//        int n = 10;
//        for (int j = 20; j >= 3; j--) {
//            double x1 = j * 10 * Math.cos(t);
//            double y1 = j * 10 * Math.sin(t);
//            for (int i = 0; i <= n; i++) {
//                t = 2*Math.PI/n*i;
//                x2 = j * 10 * Math.cos(t);
//                y2 = j * 10 * Math.sin(t);
//                g2.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
//                x1 = x2;
//                y1 = y2;
////                g2.drawLine(0, 0, (int) x1, (int) y1);
//                Ellipse2D e = new Ellipse2D.Double(x1, y1, 10, 10);
//                if(j == 3) g2.drawLine(0, 0,(int) x1, (int) y1);
//                g2.fill(e);
//            }
//        }


        // draw Rabbit
//        g2.setStroke(new BasicStroke(7));
//        g2.draw(drawRabbitHead());
//        g2.draw(drawRabbitEars());
//        drawRabbitEye(g2);
//        g2.setStroke(new BasicStroke(9));
//        drawRabbitMouth(g2);
//        g2.setStroke(new BasicStroke(7));
//        g2.setPaint(new Color(255, 100, 0));
//        g2.fill(drawRabbitBody());
//        g2.setPaint(Color.black);
//        g2.draw(drawRabbitBody());
//        g2.draw(drawRabbitButton());
//        g2.setPaint(Color.WHITE);
//        g2.fill(drawRabbitButton());
//        g2.setPaint(Color.black);
//        drawRabbitChemise(g2);
//        g2.draw(drawRabbitLegs());
//        drawRabbitHands(g2);



        // Lesson 11
//         BufferedImage im = null;
//         try {
//         im = ImageIO.read(new File("N:\\about-image.png"));
//         } catch (IOException e) {
//         System.out.println('e');
//         }
//
//         assert im != null;
//         g2.drawImage(im, 0, 0, this);
//
//         RescaleOp li = new RescaleOp(1.2f, 0, null);
//         g2.drawImage(li.filter(im, null), 0, im.getHeight(), this);
//
//         RescaleOp da = new RescaleOp(.75f, 0, null);
//         g2.drawImage(da.filter(im, null), im.getWidth(), 0, this);
//
//         RescaleOp in = new RescaleOp(-1f, 255, null);
//         g2.drawImage(in.filter(im, null), im.getWidth() * 2, 0, this);
//
//         float[] sharpeningData = { 0f, -1f, 0f, -1f, 5f, -1f, 0f, -1f, 0f };
//         Kernel ker1 = new Kernel(3, 3, sharpeningData);
//         ConvolveOp op1 = new ConvolveOp(ker1);
//         g2.drawImage(op1.filter(im, null), im.getWidth(), im.getHeight(), this);
//         float[] noiseReductionData = { 1 / 9f, 1 / 9f, 1 / 9f, 1 / 9f, 1 / 9f, 1 /
//         9f, 1 / 9f, 1 / 9f, 1 / 9f };
//         Kernel ker2 = new Kernel(3, 3, noiseReductionData);
//         ConvolveOp op2 = new ConvolveOp(ker2);
//         g2.drawImage(op2.filter(im, null), 0, 0, this);
//
//         AffineTransform xForm = new AffineTransform();
//         xForm.setToRotation(Math.PI / 4, im.getWidth(), im.getHeight());
//         AffineTransformOp op3 = new AffineTransformOp(xForm,
//         AffineTransformOp.TYPE_BILINEAR);
//         g2.drawImage(op3.filter(im, null), im.getWidth() * 2, im.getHeight(), this);

        // dashed line
//         g2.setStroke(new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL,
//         0, new float[]{10.0f, 10.0f}, 0));

        // fill gradient

        // Center of the rectangle
        int centerX = 300;
        int centerY = 500;
        int width = 300;
        int height = 300;

        // Top left corner of the rectangle
        int x = centerX - width / 2;
        int y = centerY - height / 2;

        // Create the gradient paint from top left to bottom right
        Color topLeftColor = new Color(0.9f, 0, 0);
        Color bottomRightColor = new Color(0.3f, 0, 0.8f);
        GradientPaint gradient = new GradientPaint(x, y, topLeftColor, x + width, y + height, bottomRightColor);

        // Set the paint to the gradient
        g2.setPaint(gradient);

        // Draw the rectangle
        g2.fillRect(x, y, width, height);;

        // Composite and transparency
//         Ellipse2D e = new Ellipse2D.Double(100, 100, 300, 100);
//         g2.draw(e);
//         g2.fill(e);
//
//         AlphaComposite a = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f);
//         g2.setComposite(a);
//
//         AffineTransform af = new AffineTransform();
//         af.rotate(Math.PI / 2, 100+ 150, 100 + 50);
//         g2.setColor(Color.CYAN);
//         g2.fill(af.createTransformedShape(e));

        // lesson 5
//        Font font = new Font("Serif", Font.BOLD, 100);
//        AffineTransform tx = new AffineTransform();
//        tx.shear(0.5, 0);
//        g2.setFont(font.deriveFont(tx));
//        g2.drawString("Derived font", 100, 100);
//        g2.setFont(font);
//        FontRenderContext frc = g2.getFontRenderContext();
//        String str = "String bounds";
//        Rectangle2D bounds = font.getStringBounds(str, frc);
//        g2.translate(100, 200);
//        g2.draw(bounds);
//        g2.drawString(str, 0, 0);
//        str = "Baseline, ascent, descent, leading";
//        g2.translate(0,100);
//        int w = (int)font.getStringBounds(str, frc).getWidth();
//        LineMetrics lm = font.getLineMetrics(str, frc);
//        g2.setColor(Color.CYAN);
//        g2.drawLine(0, 0, w, 0);
//        int y = -(int)lm.getAscent();
//        g2.setColor(Color.PINK);
//        g2.drawLine(0, y, w, y);
//        y = (int)lm.getDescent();
//        g2.setColor(Color.RED);
//        g2.drawLine(0, y, w, y);
//        y = (int)(lm.getDescent()+lm.getLeading());
//        g2.setColor(Color.GREEN);
//        g2.drawLine(0, y, w, y);
//        g2.setColor(Color.BLACK);
//        g2.drawString(str,0,0);
//         AffineTransform af = new AffineTransform();
//
//         FontRenderContext frc = g2.getFontRenderContext();
//         GlyphVector gv = font.createGlyphVector(frc, "Java");
////         Shape glyph = gv.getOutline(100, 200);
//         g2.clip(gv.getOutline(100, 200));
//         Ellipse2D e = new Ellipse2D.Double(0, 0, 25, 25);
//         for (int i = 0; i < 100; i++){
//         af.setToTranslation(0, i*10);
//             for (int j = 0; j < 100; j++){
//                 af.translate(10, 0);
//                 g2.draw(af.createTransformedShape(e));
//             }
//         }

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
//         Arc2D arc = new Arc2D.Double(100, 100, 100, 100, 90, 120, Arc2D.PIE);
//         Arc2D arc2 = new Arc2D.Double(100, 300, 100, 100, 0, 90, Arc2D.OPEN);
//         Arc2D arc3 = new Arc2D.Double(100, 500, 100, 100, 0, 90, Arc2D.CHORD);
//         Area a1 = new Area(arc);
//         g2.draw(arc);
//         g2.draw(arc2);
//         g2.draw(arc3);
//         int[] xPoly = {150,175,200,325,350,275,100};
//         int[] yPoly = {150,125,150,175,200,250,225};
//         Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);
//         Area a2 = new Area(poly);
//         g2.setColor(Color.red);
//         g2.draw(poly);
//         a1.add(a2);
//         g2.translate(0, 200);
//         g2.draw(a1);
//         g2.fill(a1);
//         a1.subtract(a2);
//         g2.translate(180, 0);
//         g2.draw(a1);
//         g2.fill(a1);
//         g2.translate(180, 0);
//         a1.intersect(a2);
//         g2.setColor(Color.CYAN);
//         g2.draw(a1);
//         g2.fill(a1);
//         g2.translate(0, 100);
//         a1.exclusiveOr(a2);
//         g2.setColor(Color.black);
//         g2.draw(a1);
//         g2.fill(a1);

        // Second Lesson
//         g2.setStroke(new BasicStroke(7));
//         g2.translate(200, 200);
//         double r1=60.0f, r2=50.0f, p=70.0f;
//         double a=100, b=200, kx=3, ky=2;
//         double t=0;
//         double minRange=0, maxRange=2*Math.PI;
//         int nPoints=1000;
//         double a1 = Math.exp(Math.cos(t)) - 2 * Math.cos(4 * t) - Math.pow(Math.sin(t / 12), 5);
//         double x1 = (r1 + r2) * Math.cos(t) - p* Math.cos((r1+r2) * t/r2);
//         double y1 = (r1 + r2) * Math.sin(t) - p* Math.sin((r1+r2) * t/r2);
//         double x2;
//         double y2;
//         for (int i=1; i<=nPoints; i+=5){
//         t= 12.0f*Math.PI/nPoints* (float)i;
//         a1 = Math.exp(Math.cos(t)) - 2 * Math.cos(4 * t) - Math.pow(Math.sin(t / 12), 5);
//         x2 = (r1 + r2) * Math.cos(t) - p* Math.cos((r1+r2) * t/r2);
//         y2 = (r1 + r2) * Math.sin(t) - p* Math.sin((r1+r2) * t/r2);
//         g2.drawLine((int) x1, (int)y1, (int)x2, (int)y2);
//         x1=x2;
//         y1=y2;}

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