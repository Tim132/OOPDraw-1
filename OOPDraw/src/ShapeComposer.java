import java.awt.Point;

/**
 * 
 */

/**
 * @author loekv
 *
 */
public interface ShapeComposer {
	
	/**
	 * Create a shape
	 * @param coordinates Where the mouse went down
	 * @return The shape itself
	 */
	public AbstractShape create(Point coordinates);
	
	/**
	 * Expand a shape
	 * @param coordinates Where the mouse was dragged
	 */
	public void expand(Point coordinates);
	
	/**
	 * Complete a shape
	 * @param coordinates Where the mouse was released
	 */
	public void complete(Point coordinates);
}
