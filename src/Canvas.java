import  java.awt.*;
import javax.swing.JComponent;


public class Canvas extends JComponent {
	
	private int height;
	private int width;
	private Button b1;
	private Button b2;
	
	public Canvas(int w, int h) {
		width = w;
		height = h;
		b1 = new Button(295, 145, 410, Color.GRAY);
		b2 = new Button(300, 150, 400, Color.red);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		RenderingHints rh = new RenderingHints(
				RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setRenderingHints(rh);
		
		b1.drawButton(g2d);
		b2.drawButton(g2d);
			
		
		//Ellipse2D.Double e = new Ellipse2D.Double(450,300,300,300);
		//g2d.setColor(Color.red);
		//g2d.fill(e);
		//Rectangle2D.Double r = new Rectangle2D.Double(250,200,100,100);
		//g2d.fill(r); //This needs fixed)
		
		
	}

}
