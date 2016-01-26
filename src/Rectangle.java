import java.awt.*;


public class Rectangle extends Polygon {
//	Point centrePoint;
	
	public Rectangle (Point centre){
		super(centre);
	}
	
	@Override
	public void paint(Graphics g) {
            Point centre = this.centrePoint;
            g.drawRect(centre.x -20, centre.y -10, 40, 20);
    }

}
