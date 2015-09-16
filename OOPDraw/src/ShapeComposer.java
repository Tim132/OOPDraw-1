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
	
	protected Point startPosition;
	protected Point endPosition;
	protected Color colour;
	
	
	public abstract ShapeComposer create(Point coordinates);
	
	public abstract void expand(Point coordinates);
	
	public abstract void complete(Point coordinates);
	
	public abstract void Draw(Graphics2D g);
}
