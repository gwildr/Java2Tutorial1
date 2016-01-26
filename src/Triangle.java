import java.awt.Graphics;
import java.awt.Point;


public class Triangle extends Polygon {
	Point centrePoint;
	
	public Triangle (Point centre){
		this.centrePoint = centre;
	}
	
	@Override
	public void paint(Graphics g) {
            Point centre = this.centrePoint;
                g.drawLine(centre.x, centre.y-10, centre.x-10, centre.y+10);
                g.drawLine(centre.x-10, centre.y+10,
                        centre.x+10, centre.y+10);
                g.drawLine(centre.x+10, centre.y+10, centre.x, centre.y-10);
            
    }

}
