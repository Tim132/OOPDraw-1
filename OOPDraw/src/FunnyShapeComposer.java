import java.awt.Point;

/**
 * @author loekv
 *
 */
public class FunnyShapeComposer implements ShapeComposer {

	// Composed shape to work with
	private ComposedShape funnyShape;
	
	/**
	 * Constructor
	 */
	public FunnyShapeComposer() {
		funnyShape = new ComposedShape();
	}
	
	/* (non-Javadoc)
	 * @see ShapeComposer#create(java.awt.Point)
	 */
	@Override
	public AbstractShape create(Point coordinates) {
		funnyShape.setStart(coordinates);
		return funnyShape;
	}

	/* (non-Javadoc)
	 * @see ShapeComposer#expand(java.awt.Point)
	 */
	@Override
	public void expand(Point coordinates) {
		funnyShape.setEnd(coordinates);
	}

	/* (non-Javadoc)
	 * @see ShapeComposer#complete(java.awt.Point)
	 */
	@Override
	public void complete(Point coordinates) {
		expand(coordinates);
	}

}
