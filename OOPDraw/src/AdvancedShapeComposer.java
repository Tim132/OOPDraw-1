import java.awt.Graphics2D;
import java.awt.Point;

/**
 * 
 */

/**
 * @author loekv
 *
 */
public class AdvancedShapeComposer extends ShapeComposer {
	
	// Height of a shape
	protected int height;
	// Width of a shape
	protected int width;

	/*
	 * (non-Javadoc)
	 * @see ShapeComposer#create(java.awt.Point)
	 */
	@Override
	public ShapeComposer create(Point coordinates) {
		startPosition = coordinates;
		endPosition = coordinates;
		return this;
	}

	/*
	 * (non-Javadoc)
	 * @see ShapeComposer#expand(java.awt.Point)
	 */
	@Override
	public void expand(Point coordinates) {
		endPosition = new Point(Math.max(coordinates.x, startPosition.x), Math.max(coordinates.y, startPosition.y));
		startPosition = new Point(Math.min(coordinates.x, startPosition.x), Math.min(coordinates.y, startPosition.y));
		width = Math.abs((endPosition.x - startPosition.x));
		height = Math.abs((endPosition.y - startPosition.y));
	}

	/*
	 * (non-Javadoc)
	 * @see ShapeComposer#complete(java.awt.Point)
	 */
	@Override
	public void complete(Point coordinates) {
		expand(coordinates);
	}

	/* (non-Javadoc)
	 * @see ShapeComposer#Draw(java.awt.Graphics2D)
	 */
	@Override
	public void Draw(Graphics2D g) {
		
	}

}
