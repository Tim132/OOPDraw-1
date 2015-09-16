import java.awt.Color;
import java.awt.Graphics2D;

/**
 * 
 */

/**
 * @author loekv
 *
 */
public class OvalComposer extends AdvancedShapeComposer {
	
	public OvalComposer() {
		colour = Color.BLUE;
	}

	/* (non-Javadoc)
	 * @see AdvancedShapeComposer#Draw(java.awt.Graphics2D)
	 */
	@Override
	public void Draw(Graphics2D g) {
		g.setColor(colour);
		g.drawOval(startPosition.x, startPosition.y, width, height);
	}

}
