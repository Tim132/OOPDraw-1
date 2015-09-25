import java.awt.Point;

/**
 * 
 */

/**
 * @author loekv
 *
 */
public class LineComposer implements ShapeComposer {
	
	private MyLine line;

	/**
	 * Initialize shape with color
	 */
	public LineComposer() {
		line = new MyLine();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ShapeComposer#create()
	 */
	@Override
	public AbstractShape create(Point coordinates) {
		line.setStart(coordinates);
		return line;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ShapeComposer#expand()
	 */
	@Override
	public void expand(Point coordinates) {
		line.setEnd(coordinates);
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
