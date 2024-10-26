import javax.swing.*;

public class ButtonTester {
	int count = 0;
	JLabel label;
	JPanel panel;
	
	public static void main(String[] args) {
		int w = 1000;
		int h = 1000;
		JFrame f = new JFrame();
		Canvas c = new Canvas(w,h);
		f.setSize(w,h);
		f.setTitle("Big Red Button!");
		f.add(c);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
}
