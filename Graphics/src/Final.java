import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.*;
public class Final extends JApplet {
    public static void main(String[] arg) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new Final();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);}
    public void init() {
        JPanel panel = new DropletPanel();
        getContentPane().add(panel);}}

class DropletPanel extends JPanel implements Runnable {
    Point2D.Double[] droplets = new Point2D.Double[1200];
    public DropletPanel() {
        setPreferredSize(new Dimension(500, 500));
        setBackground(Color.GRAY);
        for (int i = 0; i < droplets.length - 1; i++){
            droplets[i] = new Point2D.Double(Math.random(), Math.random());
        }
        Thread thread = new Thread(this);
        thread.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i < droplets.length - 1; i++) {
            g2.drawLine((int)(640*droplets[i].x), (int)(480*droplets[i].y), (int)(640*droplets[i].x),
                    (int)(25*Math.random() + 480*droplets[i].y));
        }
    }

    public void run() {
        while (true) {
            for (int i = 0; i < droplets.length - 1; i++) {
                double x = droplets[i].getX();
                double y = droplets[i].getY();
                y += 0.1 * Math.random();
                if (y > 1){
                    y = 0.3 * Math.random();
                    x = Math.random();
                }
                droplets[i].setLocation(x, y);
            }
            repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex){
                System.out.println(ex);
            }
        }
    }
}

class LifePanel extends JPanel implements ActionListener{
    int n = 30;
    boolean[][] cells1 = new boolean[n][n];
    boolean[][] cells2 = new boolean[n][n];

    public LifePanel() {
        setPreferredSize(new Dimension(500, 500));
        setBackground(Color.WHITE);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean temp = Math.random() < 0.1;
                cells1[i][j] = temp;
                cells2[i][j] = false;
            }}
        Timer timer = new Timer(500, this);
        timer.start();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.lightGray);
        int p = 0;
        int c = 16;
        int len = c*n;
        for (int i = 0; i < n; i++) {
            g2.drawLine(0, p, len, p);
            g2.drawLine(p, 0, p, len);
            p += c;    }
        g2.setColor(Color.black);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (cells1[i][j]) {
                    int x = i*c;
                    int y = j*c;
                    g2.fillOval(x, y, c, c);
                }      }    }  }
    public void actionPerformed(ActionEvent e) {
        boolean[][] cells = cells1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cells2[i][j] = cells[i][j];
                int nb = neighbors(cells, i, j);
                if (nb == 3)
                    cells2[i][j] = true;
                if (nb < 2 || nb > 3)
                    cells2[i][j] = false;
            }
        }

        cells1 = cells2;
        cells2 = cells;
        repaint();
    }
    private int neighbors(boolean[][] cells, int x, int y) {
        int x1 = (x>0)?x-1:x;
        int x2 = (x<n-1)?x+1:x;
        int y1 = (y>0)?y-1:y;
        int y2 = (y<n-1)?y+1:y;
        int count = 0;
        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                count += (cells[i][j])?1:0;
            }
        }
        if (cells[x][y]) count--;
        return count;
    }
}