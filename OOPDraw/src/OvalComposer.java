import java.awt.Point;

/**
 * 
 */

/**
 * @author loekv
 *
 */
public class OvalComposer implements ShapeComposer {
	
	// MyOval to work with
	private MyOval oval;
	
	/**
	 * Constructor
	 */
	public OvalComposer() {
		oval = new MyOval();
	}
	
	/*
	 * (non-Javadoc)
	 * @see ShapeComposer#create(java.awt.Point)
	 */
	@Override
	public AbstractShape create(Point coordinates) {
		oval.setStart(coordinates);;
		return oval;
	}

	/*
	 * (non-Javadoc)
	 * @see ShapeComposer#expand(java.awt.Point)
	 */
	@Override
	public void expand(Point coordinates) {
		oval.setEnd(coordinates);
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
