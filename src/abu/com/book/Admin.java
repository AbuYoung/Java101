package abu.com.book;

import javax.swing.*;

public class Admin extends JPanel {

	private static JFrame adminFrame = new JFrame("图书管理系统");

	private static void PrepareGUI(){
		adminFrame.setSize(1200,800);
		adminFrame.setVisible(true);
		adminFrame.setLocationRelativeTo(null);
		adminFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		adminFrame.setResizable(false);
		//SwingUtilities.updateComponentTreeUI(adminFrame);

	}


	public static void main(String[] args) {
		PrepareGUI();
		System.out.println("Hello World");
	}
}
