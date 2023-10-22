import java.awt.*;
import javax.swing.*;

public class triangle extends JPanel{
    double tx = 500, ty = 113.5898, lx = 100, ly = 836.41,rx = 900 , ry = 836.41;
    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        setForeground(new Color(200,0,0));
        setBackground(Color.black);
        int points = 10000000;
        double x = tx , y = ty;
        //g.drawLine((int)tx,(int) ty,(int) lx,(int) ly);
        //g.drawLine((int)tx,(int) ty,(int) rx,(int) ry);
        //g.drawLine((int)rx,(int) ry,(int) lx,(int) ly);
        while (points-->0) {
            int xPixel = (int)x, yPixel = (int) y;
            g.drawLine(xPixel, yPixel, xPixel, yPixel);
            double nextCoords[] = func(x, y);
            x = nextCoords[0];y = nextCoords[1];
        }
    }

    public double[] func(double x, double y){
        
        double newX = 0, newY = 0,triX=0, triY=0;
        int r =(int) (Math.random()*3);
        if (r == 0) {
            triX = tx;
            triY = ty;
        } else if (r == 1) {
            triX = rx;
            triY = ry;
        } else {
            triX = lx;
            triY = ly;
        }
        newX = (x+triX)/2;
        newY = (y+triY)/2;
        double[] coords = {newX, newY};
        return coords;
    }

    public static void main(String[] args)  {
        triangle t = new triangle();
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