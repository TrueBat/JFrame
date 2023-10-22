import java.awt.*;
import javax.swing.*;

public class test extends JPanel{
    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        setForeground(Color.green);
        setBackground(Color.black);
        int points = 100000;
        double x = 0 , y = 0;
        
        while (points-->0) {
            int xPixel = (int)(1000/2 + x*100) , yPixel = (int) (1000-y*100);
            g.drawLine(xPixel, yPixel, xPixel, yPixel);
            //g.drawString(".", xPixel, yPixel);
            double nextCoords[] = func(x, y);
            x = nextCoords[0];y = nextCoords[1];
        }
    }

    public double[] func(double x, double y){
        
        double newX, newY;
        double r = Math.random()*3;
        if (r <= 0.01) {
            newX = 0;
            newY = 0.16 * y;
        } else if (r <= 0.08) {
            newX = 0.2 * x - 0.26 * y;
            newY = 0.23 * x + 0.22 * y+1.6;
        } else if (r <= 0.15) {
            newX = -0.15 * x + 0.28 * y;
            newY = 0.26 * x + 0.24 * y + 0.44;
        } else {
            newX = 0.85 * x + 0.04 * y;
            newY = -0.04 * x + 0.85 * y + 1.6;
        }
        double[] coords = {newX, newY};
        return coords;
    }

    public static void main(String[] args)  {
        test t = new test();
        JFrame jf = new JFrame("asddf");
        jf.add(t);
        jf.setTitle("test!!");
        jf.setSize(1000, 1000);
        jf.setMinimumSize(new Dimension(200,200));
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setVisible(true);
        
    }

    
}