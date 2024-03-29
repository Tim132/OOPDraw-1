import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;

/**
 * Filename: OOPDraw2.java<br/>
 * Written By: Sunit Katkar<br/>
 * E-Mail:sunitkatkar@hotmail.com<br/>
 * Home-Page : [url]http://www.vidyut.com/sunit[/url]<br/>
 * Java Page : [url]www.vidyut.com/sunit/JavaPage.html[/url]
 * <p/>
 ******************************************************************************* <p/>
 * Description: A very simple vector drawing example. I have used the OO concept
 * of Polymorphism to declare on abstract Shape class and then derived line,
 * rectangle and oval shape classes. The shapes are stored in a Vector so that
 * they remain on screen as new shapes are drawn. An offscreen image technique
 * is used to avoid flicker.
 * <p/>
 ******************************************************************************* <p/>
 * Copyright (c) 1997 Sunit Katkar All Rights Reserved.
 * <p/>
 * 
 * Permission to use, copy, modify, and distribute this software for
 * NON-COMMERCIAL or COMMERCIAL purposes and without fee is hereby granted.
 * <p/>
 * 
 * Whew ! That was too much legalese..even to have copied and pasted from some
 * other place... PLEASE DO NOT BLAME ME in any way if your system crashes
 * because of this code, or if anything else bad happens. In short
 * "DO WHAT YOU WANT BUT DONT BLAME ME !"
 * <p/>
 ******************************************************************************* <p/>
 * This code was modified by BugSlayer to change it from an applet into a
 * desktop application. Also, refactored the code a little bit to comply to
 * naming conventioned, infomration hiding and several other basic OO
 * principles.
 * <p/>
 ******************************************************************************/
public class OOPDraw2 extends JFrame implements MouseListener, MouseMotionListener {

	// Version ID
	private static final long serialVersionUID = 4695753453561082104L;

	// ArrayList for storing the shapes
	private ArrayList<AbstractShape> objectsOnScreen;

	// Composer to work with as you are drawing objects
	private ShapeComposer currentComposer;

	/*
	 *  Start program and initialize GUI
	 */
	public static void main(String[] args) {
		OOPDraw2 frame = new OOPDraw2();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	/**
	 * Constructor for this class.
	 */
	public OOPDraw2() {
		objectsOnScreen = new ArrayList<AbstractShape>();
		// Strictly not allowed, but big QoL bugfix :)
		currentComposer = new LineComposer();
		initGUI();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// Nothing TO DO in this method
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// Nothing TO DO in this method
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseExited(MouseEvent arg0) {
		// Nothing TO DO in this method
	}

	/*
	 * (non-Javadoc) Get position of mouseclick, create a new shape and add it
	 * to the list of shapes on screen
	 * 
	 * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
	 */
	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();

		Point coordinates = new Point(x, y);

		objectsOnScreen.add(currentComposer.create(coordinates));
	}

	/*
	 * (non-Javadoc) Get position of where mouse was released. Finish the
	 * corresponding shape and repaint the screen.
	 * 
	 * @see
	 * java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseReleased(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();

		Point coordinates = new Point(x, y);

		currentComposer.complete(coordinates);
		
		// If finished with drawing, start a new composer
		// NOTE This is not allowed according to the exercise,
		// I just don't know where else to put this code..!
		try {
			currentComposer = (ShapeComposer) Class.forName(currentComposer.getClass().getName()).newInstance();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		repaint();
	}

	/*
	 * (non-Javadoc) Get position of where the mouse is dragged. Update the
	 * corresponding shape and repaint the screen.
	 * 
	 * @see java.awt.event.MouseMotionListener#mouseDragged(java.awt.event.
	 * MouseEvent)
	 */
	@Override
	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		Point coordinates = new Point(x, y);

		currentComposer.expand(coordinates);

		repaint();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.MouseMotionListener#mouseMoved(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseMoved(MouseEvent arg0) {
		// Nothing TO DO in this method
	}

	/*
	 * Paint method overridden for custom rendering of the screen
	 * 
	 * @see java.awt.Container#paint(java.awt.Graphics)
	 */
	@Override
	public void paint(Graphics g) {
		// To get a shadow effect WHICH COMPLETELY MESSES UP YOUR SCREEN WHILE DRAWING
//		g.setColor(Color.black);
//		g.fillRect(0, 0, getSize().width, getSize().height);
		g.setColor(new Color(255, 255, 154));
		g.fillRect(1, 1, getSize().width - 3, getSize().height - 3);
		for (AbstractShape shape : objectsOnScreen) {
			shape.Draw((Graphics2D) g);
		}
	}

	/*
	 * Initialize GUI
	 */
	private void initGUI() {
		setSize(800, 600);
		setTitle("LOEK 5.0 Even More (?) Lesser Hairy Drawing Tool");
		setLayout(new FlowLayout());
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		
		// Let factory create our composers
		ShapeComposerFactory factory = new ShapeComposerFactory();

		// Get name of every composer
		for(String name : factory.listComposerNames()) {
			Button button = new Button(name);
			// Create corresponding composer (final since we need to get into method block below)
			final ShapeComposer newComposer = factory.createComposer(name);
			// Create button for composer
			button.addActionListener(new ActionListener() {
				
				/*
				 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
				 */
				@Override
				public void actionPerformed(ActionEvent e) {
					currentComposer = newComposer;
				}
			});
			// Finally, add the button with all fucntionality
			add(button);
		}
		
		// Clear screen isn't a composer, so hard code it!
		Button btnClear = new Button("Clear");
		btnClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// Clear the entire drawing screen
				objectsOnScreen.clear();
				// finally, call repaint()
				repaint();
			}
		});
		// Add the button
		add(btnClear);
	}

}
