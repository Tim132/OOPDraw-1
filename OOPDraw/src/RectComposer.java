import java.awt.Point;

/**
 * 
 */

/**
 * @author loekv
 *
 */
public class RectComposer implements ShapeComposer {
	
	// MyRectangle to work with
	private MyRectangle rect;
	
	/**
	 * Constructor
	 */
	public RectComposer() {
		rect = new MyRectangle();
	}
	
	/*
	 * (non-Javadoc)
	 * @see ShapeComposer#create(java.awt.Point)
	 */
	@Override
	public AbstractShape create(Point coordinates) {
		rect.setStart(coordinates);;
		return rect;
	}

	/*
	 * (non-Javadoc)
	 * @see ShapeComposer#expand(java.awt.Point)
	 */
	@Override
	public void expand(Point coordinates) {
		rect.setEnd(coordinates);
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

