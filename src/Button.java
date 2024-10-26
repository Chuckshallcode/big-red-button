import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Button {
	
	private double x;
	private double y;
	private double size;
	private Color color;
	
	public Button (double x, double y, double size, Color color) {
		this.x = x;
		this.y = y;
		this.size = size;
		this.color = color;
	}
	
	public void drawButton(Graphics2D g2d) {
		Ellipse2D.Double e = new Ellipse2D.Double(x, y, size, size);
		g2d.setColor(color);
		g2d.fill(e);
	}
	
	

}
