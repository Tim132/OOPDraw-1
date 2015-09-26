import java.awt.Graphics2D;
import java.awt.Point;

/**
 * 
 * @author loekv
 *
 */
public interface AbstractShape {

	/**
	 * Set starting point for shape
	 * 
	 * @param coordinates
	 *            The point to set
	 */
	public void setStart(Point coordinates);

	/**
	 * Set ending point for shape
	 * 
	 * @param coordinates
	 *            The point to set
	 */
	public void setEnd(Point coordinates);

	/**
	 * Draw shape on screen
	 * 
	 * @param g
	 */
	public void Draw(Graphics2D g);

}
