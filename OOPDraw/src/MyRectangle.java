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
public class MyRectangle extends AbstractShape {
	
	private Rectangle2D rect;
	
	public MyRectangle() {
		colour = Color.BLUE;
		rect = new Rectangle2D.Double();
	}

	/* (non-Javadoc)
	 * @see AbstractShape#setStart(java.awt.Point)
	 */
	@Override
	public void setStart(Point coordinates) {
		rect.setFrame(coordinates.x, coordinates.y, (rect.getX() - coordinates.x), (rect.getY() - coordinates.y));
	}

	/* (non-Javadoc)
	 * @see AbstractShape#setEnd(java.awt.Point)
	 */
	@Override
	public void setEnd(Point coordinates) {
		rect.setFrame(rect.getX(), rect.getY(), (coordinates.x - rect.getX()), (coordinates.y - rect.getY()));
	}

	/* (non-Javadoc)
	 * @see AbstractShape#Draw(java.awt.Graphics2D)
	 */
	@Override
	public void Draw(Graphics2D g) {
		g.setColor(colour);
		g.draw(rect);
	}

}
