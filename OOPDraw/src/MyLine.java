import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Line2D;

/**
 * @author loekv
 *
 */
public class MyLine extends AbstractShape {
	
	private Line2D line;
	
	public MyLine() {
		colour = Color.RED;
		line = new Line2D.Double();
	}

	/* (non-Javadoc)
	 * @see AbstractShape#setStart(java.awt.Point)
	 */
	@Override
	public void setStart(Point coordinates) {
		line.setLine(coordinates.x, coordinates.y, coordinates.x, coordinates.y);
	}

	/* (non-Javadoc)
	 * @see AbstractShape#setEnd(java.awt.Point)
	 */
	@Override
	public void setEnd(Point coordinates) {
		line.setLine(line.getX1(), line.getY1(), coordinates.x, coordinates.y);
	}

	/* (non-Javadoc)
	 * @see AbstractShape#Draw(java.awt.Graphics2D)
	 */
	@Override
	public void Draw(Graphics2D g) {
		g.setColor(colour);
		g.draw(line);
	}
}
