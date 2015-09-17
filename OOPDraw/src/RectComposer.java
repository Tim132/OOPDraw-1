import java.awt.Color;
import java.awt.Graphics2D;

/**
 * 
 */

/**
 * @author loekv
 *
 */
public class RectComposer extends AdvancedShapeComposer {
	
	/**
	 * Initialize shape with colour
	 */
	public RectComposer() {
		colour = Color.BLACK;
	}

	/* (non-Javadoc)
	 * @see AdvancedShapeComposer#Draw(java.awt.Graphics2D)
	 */
	@Override
	public void Draw(Graphics2D g) {
		g.setColor(colour);
		g.drawRect(startPosition.x, startPosition.y, width, height);
	}

}
