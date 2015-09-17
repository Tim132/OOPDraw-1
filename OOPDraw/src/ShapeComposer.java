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
public abstract class ShapeComposer {
	
	// Start position of the shape
	protected Point startPosition;
	// Ending position of the shape
	protected Point endPosition;
	// Colour of the shape
	protected Color colour;
	
	/**
	 * Create a shape
	 * @param coordinates Where the mouse went down
	 * @return The shape itself
	 */
	public abstract ShapeComposer create(Point coordinates);
	
	/**
	 * Expand a shape
	 * @param coordinates Where the mouse was dragged
	 */
	public abstract void expand(Point coordinates);
	
	/**
	 * Complete a shape
	 * @param coordinates Where the mouse was released
	 */
	public abstract void complete(Point coordinates);
	
	/**
	 * Draw the shape on screen
	 * @param g
	 */
	public abstract void Draw(Graphics2D g);
}
