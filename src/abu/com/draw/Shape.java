package abu.com.draw;


import javax.swing.JPanel;
import java.awt.*;

import static java.lang.Thread.sleep;

class Shape extends JPanel {
    int i;
    Shape() {
        i=300;
    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(0,0,600,600);

        g.drawOval(i, i, i, i);
        i--;
        try {
            sleep(75);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
