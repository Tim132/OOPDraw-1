import java.awt.Point;

/**
 * 
 */

/**
 * @author loekv
 *
 */
public class LineComposer extends MyLine implements ShapeComposer {

	/**
	 * Initialize shape with color
	 */
	public LineComposer() {
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ShapeComposer#create()
	 */
	@Override
	public AbstractShape create(Point coordinates) {
		startPosition = coordinates;
		endPosition = coordinates;
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ShapeComposer#expand()
	 */
	@Override
	public void expand(Point coordinates) {
		endPosition = coordinates;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ShapeComposer#complete()
	 */
	@Override
	public void complete(Point coordinates) {
		expand(coordinates);
	}
}
