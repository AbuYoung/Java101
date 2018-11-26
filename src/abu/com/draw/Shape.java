package abu.com.draw;

import javax.swing.JPanel;
import java.awt.*;

class Shape extends JPanel {

    void DrawShape(){

    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(0,0,600,600);
        g.drawOval(300,300,100,100);
    }
}
