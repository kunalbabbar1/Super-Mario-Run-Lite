package starter;

import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GObject;

public class GameScreen extends GraphicsPane {
	//private TmxMapLoader maploader;
    //private TiledMap map;
    //private OrthogonalTiledMapRenderer renderer;
	private MainApplication program; 
	
	
	public GameScreen (MainApplication app) {
		program = app; 
	}
	//maploader = new TmxMapLoader();
    //map = maploader.load("level1.tmx");
    //renderer = new OrthogonalTiledMapRenderer(map, 1  / MarioBros.PPM);

    //initially set our gamcam to be centered correctly at the start of of map
    //gamecam.position.set(gamePort.getWorldWidth() / 2, gamePort.getWorldHeight() / 2, 0);



	@Override
	public void showContents() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void hideContents() {
		// TODO Auto-generated method stub
	}
}
