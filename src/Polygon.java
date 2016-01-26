import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;


public abstract class Polygon extends Component{
	Point centrePoint;
	
	public Polygon (Point centre){
		this.centrePoint = centre;
	}
	
	public Polygon (){
		this.centrePoint = new Point(0,0);
	}
	@Override
	public abstract void paint(Graphics g);
}
