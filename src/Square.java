import java.awt.Graphics;
import java.awt.Point;


public class Square extends Polygon {
//	Point centrePoint;
	
	public Square (Point centre){
		super(centre);
	}
	
	@Override
	public void paint(Graphics g) {
            Point centre = this.centrePoint;
            g.drawRect(centre.x -10, centre.y -10, 20, 20);
    }

}
