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
public class LineComposer extends ShapeComposer {
	
	/**
	 * Initialize shape with color
	 */
	public LineComposer() {
		colour = Color.RED;
	}

	/* (non-Javadoc)
	 * @see ShapeComposer#create()
	 */
	@Override
	public ShapeComposer create(Point coordinates) {
		startPosition = coordinates;
		endPosition = coordinates;
		return this;
	}

	/* (non-Javadoc)
	 * @see ShapeComposer#expand()
	 */
	@Override
	public void expand(Point coordinates) {
		endPosition = coordinates;
	}

	/* (non-Javadoc)
	 * @see ShapeComposer#complete()
	 */
	@Override
	public void complete(Point coordinates) {
		expand(coordinates);
	}

	/*
	 * (non-Javadoc)
	 * @see ShapeComposer#Draw(java.awt.Graphics2D)
	 */
	@Override
	public void Draw(Graphics2D g) {
		g.setColor(colour);
		g.drawLine(startPosition.x, startPosition.y, endPosition.x, endPosition.y);
	}

}
