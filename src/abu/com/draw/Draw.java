package abu.com.draw;

import javax.swing.*;

public class Draw extends JFrame{

    private static JFrame newDraw = new JFrame();

    private static void PrepareGUI(){
        newDraw.setVisible(true);
        newDraw.setSize(600,600);
        newDraw.setLocationRelativeTo(null);
        newDraw.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        newDraw.setResizable(false);
    }

    private static void Shape(){
        Shape newShape = new Shape();
        newDraw.add(newShape);
        newShape.setBounds(0,0,600,600);
        newShape.DrawShape();
        newShape.repaint();
    }

    public static void main(String[] args) {
        PrepareGUI();
        Shape();
    }
}
