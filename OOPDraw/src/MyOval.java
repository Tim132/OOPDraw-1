import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 * 
 */

/**
 * @author loekv
 *
 */
public class MyOval extends AbstractShape {
	
	public MyOval() {
		colour = Color.GREEN;
	}

	/* (non-Javadoc)
	 * @see AbstractShape#setStart(java.awt.Point)
	 */
	@Override
	public void setStart(Point coordinates) {
		startPosition = coordinates;
	}

	/* (non-Javadoc)
	 * @see AbstractShape#setEnd(java.awt.Point)
	 */
	@Override
	public void setEnd(Point coordinates) {
		endPosition = coordinates;
	}

	/* (non-Javadoc)
	 * @see AbstractShape#Draw(java.awt.Graphics2D)
	 */
	@Override
	public void Draw(Graphics2D g) {
		g.setColor(colour);
		g.drawOval(startPosition.x, startPosition.y, width, height);
	}

}
