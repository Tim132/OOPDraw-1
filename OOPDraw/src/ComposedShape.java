import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;

/**
 * @author loekv
 *
 */
public class ComposedShape implements AbstractShape {
	
	// List of components
	private ArrayList<AbstractShape> childShapes;
	
	/**
	 * Constructor
	 */
	public ComposedShape() {
		childShapes = new ArrayList<AbstractShape>();
		// Add children to the list
		add(new MyLine());
		add(new MyRectangle());
		add(new MyOval());
	}
	
	/**
	 * Add shape to internal list of (child) shapes
	 * @param shape Shape to be added
	 */
	public void add(AbstractShape shape) {
		childShapes.add(shape);
	}

	/* (non-Javadoc)
	 * @see AbstractShape#setStart(java.awt.Point)
	 */
	@Override
	public void setStart(Point coordinates) {
		for(AbstractShape shape : childShapes) {
			shape.setStart(coordinates);
		}
	}

	/* (non-Javadoc)
	 * @see AbstractShape#setEnd(java.awt.Point)
	 */
	@Override
	public void setEnd(Point coordinates) {
		for(AbstractShape shape : childShapes) {
			shape.setEnd(coordinates);
		}
	}

	/* (non-Javadoc)
	 * @see AbstractShape#Draw(java.awt.Graphics2D)
	 */
	@Override
	public void Draw(Graphics2D g) {
		for(AbstractShape shape : childShapes) {
			shape.Draw(g);
		}
	}

}
