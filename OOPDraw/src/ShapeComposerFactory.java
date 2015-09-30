/**
 * @author loekv
 *
 */
public class ShapeComposerFactory {
	
	// Class is singleton
	private static ShapeComposerFactory instance = null;
	
	/**
	 * Constructor
	 */
	public ShapeComposerFactory() {
		
	}
	
	/**
	 * 
	 * @return Only instance of this class
	 */
	public static ShapeComposerFactory getInstance() {
	      if(instance == null) {
	         instance = new ShapeComposerFactory();
	      }
	      return instance;
	   }
	
	/**
	 * 
	 * @return An array of the names of the composers
	 */
	public String[] listComposerNames() {
		String[] nameList = {"Line", "Oval", "Rectangle", "Funny Shape"};
		return nameList;
	}
	
	/**
	 * Create a new composer and return it after being created
	 * @param name Name of the new composer
	 * @return The created composer
	 */
	public ShapeComposer createComposer(String name) {
		switch (name) {
		case "Line":
			return new LineComposer();
		case "Oval":
			return new OvalComposer();
		case "Rectangle":
			return new RectComposer();
		case "Funny Shape":
			return new FunnyShapeComposer();
		default:
			return null;
		}
	}
}
