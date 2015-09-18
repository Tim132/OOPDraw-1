import java.awt.Point;

/**
 * 
 */

/**
 * @author loekv
 *
 */
public class OvalComposer extends MyOval implements ShapeComposer {
	
	public OvalComposer() {
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see ShapeComposer#create(java.awt.Point)
	 */
	@Override
	public AbstractShape create(Point coordinates) {
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
		Point newStart = new Point(Math.min(coordinates.x, startPosition.x), Math.min(coordinates.y, startPosition.y));
		width = Math.abs((endPosition.x - startPosition.x));
		height = Math.abs((endPosition.y - startPosition.y));
		setStart(newStart);
	}

	/*
	 * (non-Javadoc)
	 * @see ShapeComposer#complete(java.awt.Point)
	 */
	@Override
	public void complete(Point coordinates) {
		expand(coordinates);
	}

}
