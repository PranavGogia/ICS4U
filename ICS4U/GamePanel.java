package pranav;
//Pranav Gogia
//January 31, 2017
//This is a dodgeball game, running into the balls even once will kill you

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * This is the beginning of a simple game. You should expand it into a dodgeball
 * game, where the user controls an object with the mouse or keyboard, and tries
 * to avoid the balls flying around the screen. If they get hit, it's game over.
 * If they survive for 20 seconds (or some other fixed time), they go on to the
 * next level. <br>
 * <br>
 * Should be run at around 500x300 pixels.<br>
 * <br>
 * @version Nov. 2015    
 * 
 * @author Christina Kemp adapted from Sam Scott */
@SuppressWarnings("serial")
public class GamePanel extends JPanel implements Runnable, MouseMotionListener
{
	int mouseX = 0;
	int mouseY = 0;
	int width = 1000;
	int height = 500;
	int numBalls = 10;
	final int pauseDuration = 0;
	Font myFont = new Font("Serif", Font.BOLD, 35);
	FlashingBall[] ball = new FlashingBall[numBalls];
	public GamePanel(){
		// Start the ball bouncing (in its own thread)
		this.setPreferredSize(new Dimension(width, height));
		this.setBackground(Color.BLACK);


		for (int i = 0; i < numBalls; i++) {
			ball[i] = new FlashingBall(200, 200, 0, width, 0, height);
			ball[i].setXSpeed(Math.random() * 16-8);
			ball[i].setYSpeed(Math.random() * 16-8);
			ball[i].setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
		}





		addMouseMotionListener(this);
		Thread gameThread = new Thread(this);
		gameThread.start();

	}


	public static void main(String[] args) {
		// Set up main window (using Swing's Jframe)
		JFrame frame = new JFrame("Dodgeball");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500, 300));
		frame.setAutoRequestFocus(false);
		frame.setVisible(true);
		Container c = frame.getContentPane();
		c.add(new GamePanel());
		frame.pack();
		frame.setBackground(Color.WHITE);

	}

	/**
	 * Repaints the frame periodically.
	 */
	public void mouseMoved(MouseEvent arg0) 
	{
		mouseX = arg0.getX();
		mouseY = arg0.getY();
		
		repaint();
	}
	/**
	 * Checks if the courser collided with any of the balls
	 * @param ball
	 * @return
	 */
	public boolean collision(FlashingBall ball) 
	{
		int radius = ball.getRadius();
		double xValue = mouseX - ball.getX();
		double yValue = mouseY - ball.getY();
		double hypotenuse = Math.sqrt(Math.pow(xValue, 2) + Math.pow(yValue, 2)) + 15;

		return hypotenuse <= radius;
	}
	/**
	 * Runs the whole program
	 */
	public void run() 
	{
		// win stuff was cancelled because of time restraints
		boolean win = false;
		int mouseTotalX = mouseX + mouseX;
		int mouseTotalY = mouseX + mouseX;
		// while the program is running
		while (true) 
		{
			// checks every single ball
			for (int i = 0; i < ball.length; i++) 
			{
				// if collision occured or not
				if (collision(ball[i])) 
				{
					// exits program
					System.exit(0);
				}
			}

			repaint();
			
		
			
		}
	}


/**
 * Mouse Dragged
 */
	@Override
	public void mouseDragged(MouseEvent arg0) 
	{
		repaint();
	}

	@Override


	/**
	 * Clears the screen and paints the balls.
	 */
	public void paintComponent(Graphics g) 
	{

		
		super.paintComponent(g);
		for (int i = 0; i < numBalls; i++)
		{
			ball[i].draw(g);
		}
		g.setFont(myFont);
		g.setColor(Color.WHITE);
		g.drawString("Dodgeball",50,50);
		g.drawOval(mouseX, mouseY, 15, 15);
		g.fillOval(mouseX, mouseY, 15, 15);
		

	}






}
