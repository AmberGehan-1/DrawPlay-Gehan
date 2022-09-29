import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;
//Brendan Burmeister Test 2
// Megan Hibler, testing to see if push and pull works
public class Cat {
	// drawing constants are private - noone needs to know what we're doing
	// pick a head dimension
	private static final int HEAD_DIMENSION = 100;
	// eyes will be about 1/4 from top of head and 1/4 from left
	private static final int EYE_Y = HEAD_DIMENSION/4;
	private static final int EYE_X = HEAD_DIMENSION/4;
	private static final int EYE_SEPARATION = HEAD_DIMENSION/3;
	// pick eye dimensions
	private static final int EYE_HEIGHT = 15;
	private static final int EYE_WIDTH = 15;
	// pick mouth height, width is based on head dimension
	private static final int MOUTH_HEIGHT = 20;
	private static final int MOUTH_WIDTH = HEAD_DIMENSION/2;
	// mouth starts about 40% from left edge of head
	private static final int MOUTH_X = HEAD_DIMENSION/4 * 1;
	// changed mouth_x to better show cat with new dimensions set for eye.
	private static final int MOUTH_Y = HEAD_DIMENSION/5 * 3;
	
	
	private static final int EAR_Y = HEAD_DIMENSION - 10;
	private static final int EAR_X = HEAD_DIMENSION - 10;
	private static final int EAR_HEIGHT = 50;
	private static final int EAR_WIDTH = 10;
	
	private static final int LASAGNA_WIDTH = 70;
	private static final int LASAGNA_HEIGHT = 60;
	private static final int LASAGNA_X = 200;
	private static final int LASAGNA_Y = 20;
	//ADDED ear y and x
	// draw will render the Cat on the Graphics object
	public void draw(Graphics g, int catX, int catY)
	{
		Graphics2D g2 = (Graphics2D) g;
		int x=catX;
		int y=catY;
		// Draw the head
		g2.setColor(Color.orange);
		//changed head color to gray
		g2.fillOval(x, y, HEAD_DIMENSION, HEAD_DIMENSION);
		// Draw the eyes
		g2.setColor(Color.black);
		//changed eye color to yellow
		x = catX + EYE_X; 
		y = catY + EYE_Y;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		x += EYE_SEPARATION;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		// Draw the mouth
		g2.setColor(Color.red);
		x = catX + MOUTH_X;
		y = catY + MOUTH_Y;
		g2.fillOval(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		g2.setColor(Color.black);
		// Meow text appears below cat head, +10 places below 
		// so it doesn't overlap the drawing
		g2.drawString("Jon I require lasagna", catX+MOUTH_WIDTH, catY+HEAD_DIMENSION+10);
		//added ears
		g2.setColor(Color.orange);
		x = catX - 10 ;
		y = catY - 15 ;
		g2.fillRect(x + 10, y, EAR_WIDTH,EAR_HEIGHT);
		x = catX +HEAD_DIMENSION - 20;
		g2.fillRect(x+7, y, EAR_WIDTH,EAR_HEIGHT) ;
		//Lasagna
		g2.setColor(Color.red);
		g2.fillRect(LASAGNA_X,LASAGNA_Y + 10,LASAGNA_WIDTH,60) ;
		g2.setColor(Color.orange);
		g2.fillRect(LASAGNA_X,30,LASAGNA_WIDTH,10) ;
		g2.fillRect(LASAGNA_X,50,LASAGNA_WIDTH,10) ;
		g2.fillRect(LASAGNA_X,70,LASAGNA_WIDTH,10) ;
		//Put a white circle over the lasagna because garfield took a bite
		g2.setColor(Color.white);
		g2.fillOval(LASAGNA_X-25,LASAGNA_Y, 50, 50);
		
	}
}
