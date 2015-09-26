import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 * 
 * @author loekv
 *
 */
public abstract class AbstractShape {
	
	// Colour of the shape
	protected Color colour;

	/**
	 * Initialize shape
	 */
	public AbstractShape() {

	}

	/**
	 * Set starting point for shape
	 * 
	 * @param coordinates
	 *            The point to set
	 */
	public abstract void setStart(Point coordinates);

	/**
	 * Set ending point for shape
	 * 
	 * @param coordinates
	 *            The point to set
	 */
	public abstract void setEnd(Point coordinates);

	/**
	 * Draw shape on screen
	 * 
	 * @param g
	 */
	public abstract void Draw(Graphics2D g);

}
