import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Rectangle2D;

/**
 * 
 */

/**
 * @author loekv
 *
 */
public class MyRectangle implements AbstractShape {
	
	// Rectangle to work with
	private Rectangle2D rect;
	
	/**
	 * Contructor
	 */
	public MyRectangle() {
		rect = new Rectangle2D.Double();
	}

	/* (non-Javadoc)
	 * @see AbstractShape#setStart(java.awt.Point)
	 */
	@Override
	public void setStart(Point coordinates) {
		rect.setRect(coordinates.x, coordinates.y, (rect.getX() - coordinates.x), (rect.getY() - coordinates.y));
	}

	/* (non-Javadoc)
	 * @see AbstractShape#setEnd(java.awt.Point)
	 */
	@Override
	public void setEnd(Point coordinates) {
		rect.setRect(rect.getX(), rect.getY(), (coordinates.x - rect.getX()), (coordinates.y - rect.getY()));
	}

	/* (non-Javadoc)
	 * @see AbstractShape#Draw(java.awt.Graphics2D)
	 */
	@Override
	public void Draw(Graphics2D g) {
		g.setColor(Color.BLUE);
		g.draw(rect);
	}

}
