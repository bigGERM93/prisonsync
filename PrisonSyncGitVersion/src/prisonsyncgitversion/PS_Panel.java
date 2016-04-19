/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisonsyncgitversion;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ConcurrentModificationException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PS_Panel extends JPanel {
	//declare local variables
	private Image image;
	
	/**
	 * Create a jpanel with a background image
	 */
	public PS_Panel() {
		try {
			image = ImageIO.read(new File("PrisonBars.jpg"));
		} catch (IOException e) {
			System.out.println("Error trying to access image.");
		}		
	}
	/*
	 * allows panels of this type to have background images
	 * by drawing the image using paint component
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		//draw the background image
		image = image.getScaledInstance(this.getWidth(), this.getHeight(), 0);
		g2.drawImage(image, 0,0, null);
	}
}
