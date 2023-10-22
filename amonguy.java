import java.awt.*;
import javax.swing.*;

public class amonguy extends JPanel{
    double tx = 500, ty = 113.5898, lx = 100, ly = 836.41,rx = 900 , ry = 836.41;
    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        setForeground(new Color(200,0,0));
        setBackground(Color.black);
        int x = 150, y =50;
        for(int i = 0 ; i <= 600 ; i+=9){
            for(int j = 0; j <= 200; j+=9){
                drawAmongus(x+i, y+j, g);
            }
        }
        y = 257;
        for(int i = 0 ; i <= 400 ; i+=9){
            for(int j = 0; j <= 200; j+=9){
                drawAmongus(x+i, y+j, g);
            }
        }
        y = 464;
        for(int i = 0 ; i <= 600 ; i+=9){
            for(int j = 0; j <= 200; j+=9){
                drawAmongus( x+i, y+j, g);
            }
        }
        y = 671;
        for(int i = 0 ; i <= 200 ; i+=9){
            for(int j = 0; j <= 200; j+=9){
                drawAmongus(x+i, y+j, g);
            }
        }
        x = 546;
        for(int i = 0 ; i <= 200 ; i+=9){
            for(int j = 0; j <= 200; j+=9){
                drawAmongus(x+i, y+j, g);
            }
        }
    }

    public void drawAmongus(int tlx, int tly, Graphics g){
        g.drawRect(tlx,tly,5,1);
        g.drawRect(tlx,tly+2,2,1);
        g.drawRect(tlx,tly+4,5,1);
        g.drawRect(tlx,tly+6,1,1);
        g.drawRect(tlx+4,tly+6,1,1);
    }
    public static void main(String[] args)  {
        amonguy t = new amonguy();
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