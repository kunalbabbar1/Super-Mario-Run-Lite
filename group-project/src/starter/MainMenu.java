package starter;

import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GObject;

public class MainMenu extends GraphicsPane {
	private MainApplication program; // you will use program to get access to
										// all of the GraphicsProgram calls
	private GImage background;
	private GImage marioLogo;
	private GImage ground;
	private GImage cloud1;
	private GImage cloud2;
	
	private GButton playButton;
	private GButton exitButton;


	
	public MainMenu(MainApplication app) {
		super();
		program = app;
		
		
		background = new GImage("Background/SolidBlueBackground.png", 0, 0);
		marioLogo = new GImage("Background/MarioLogo.png", 150, 50);
		ground = new GImage("Background/Ground.png", 0,550);
		ground.setSize(800.0,75.0);
		cloud1 = new GImage("Background/Cloud.png",35,100);
		cloud1.setSize(125.0,75.0);
		cloud2 = new GImage("Background/Cloud.png",625,20);
		cloud2.setSize(125.0,75.0);

		
		playButton = new GButton("Play", 250, 325, 300, 75);
		playButton.setFillColor(Color.RED);
		
		exitButton = new GButton("Exit", 250, 425, 300, 75);
		exitButton.setFillColor(Color.RED);
		
	}

	@Override
	public void showContents() {
		program.add(background);
		program.add(marioLogo);
		program.add(ground);
		program.add(cloud1);
		program.add(cloud2);
		
		program.add(playButton);
		program.add(exitButton);

	}

	@Override
	public void hideContents() {
		program.remove(background);
		program.remove(marioLogo);
		program.remove(ground);
		program.remove(cloud1);
		program.remove(cloud2);

		program.remove(playButton);
		program.remove(exitButton);

	}

	@Override
	public void mousePressed(MouseEvent e) {
		GObject obj = program.getElementAt(e.getX(), e.getY());
		if (obj == playButton) {
			program.switchToInstructions();
		}
		
		if(obj== exitButton) {  //exiting from the application...
			System.exit(0);
			}
		}
}