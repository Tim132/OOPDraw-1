import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 * 
 * @author loekv
 *
 */
public abstract class AbstractShape {

	// Start position of the shape
	protected Point startPosition;
	// Ending position of the shape
	protected Point endPosition;
	// Colour of the shape
	protected Color colour;

	// Width of the shape
	protected int width;

	// Height of the shape
	protected int height;

	/**
	 * Initialize shape
	 */
	public AbstractShape() {
		colour = Color.red;
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
	 * 
	 * @return Starting position of shape
	 */
	public Point getStart() {
		return startPosition;
	}

	/**
	 * 
	 * @return Ending position of shape
	 */
	public Point getEnd() {
		return endPosition;
	}

	/**
	 * Draw shape on screen
	 * 
	 * @param g
	 */
	public abstract void Draw(Graphics2D g);

}
