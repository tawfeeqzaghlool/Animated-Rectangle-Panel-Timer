//Demonstrates the animated draws 
import java.awt.*;
import javax.swing.*;
public class UseAnimatedRectPanel {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.setTitle("A panel with rectangles");
		
		
		AnimatedRectPanelT panel = new AnimatedRectPanelT();
		panel.setBackground(Color.WHITE);
		frame.add(panel, BorderLayout.CENTER);
		frame.setVisible(true);
		

	}

}
