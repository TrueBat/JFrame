import java.awt.*;
import javax.swing.*;

public class graphxsqr extends JPanel{
    double tx = 500, ty = 113.5898, lx = 100, ly = 836.41,rx = 900 , ry = 836.41;
    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        setForeground(new Color(200,0,0));
        setBackground(Color.black);
        int points = 601;
        double x = -300 , y = 900;
        //g.drawLine((int)tx,(int) ty,(int) lx,(int) ly);
        //g.drawLine((int)tx,(int) ty,(int) rx,(int) ry);
        //g.drawLine((int)rx,(int) ry,(int) lx,(int) ly);
        while (points-->0) {
            y = (x/10)*(x/10);
            int xPixel = (int)x+500, yPixel =  950-(int)y;
            g.drawLine(xPixel, yPixel, xPixel, yPixel);
            x++;
        }
    }
    public static void main(String[] args)  {
        graphxsqr t = new graphxsqr();
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