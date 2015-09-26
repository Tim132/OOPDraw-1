import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Ellipse2D;

/**
 * 
 */

/**
 * @author loekv
 *
 */
public class MyOval implements AbstractShape {
	
	private Ellipse2D oval;
	
	public MyOval() {
		oval = new Ellipse2D.Double();
	}

	/* (non-Javadoc)
	 * @see AbstractShape#setStart(java.awt.Point)
	 */
	@Override
	public void setStart(Point coordinates) {
		oval.setFrame(coordinates.x, coordinates.y, (oval.getX() - coordinates.x), (oval.getY() - coordinates.y));
	}

	/* (non-Javadoc)
	 * @see AbstractShape#setEnd(java.awt.Point)
	 */
	@Override
	public void setEnd(Point coordinates) {
		oval.setFrame(oval.getX(), oval.getY(), (coordinates.x - oval.getX()), (coordinates.y - oval.getY()));
	}

	/* (non-Javadoc)
	 * @see AbstractShape#Draw(java.awt.Graphics2D)
	 */
	@Override
	public void Draw(Graphics2D g) {
		g.setColor(Color.GREEN);
		g.draw(oval);
	}

}
