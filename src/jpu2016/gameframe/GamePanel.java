package jpu2016.gameframe;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import jpu2016.dogfight.view.GraphicsBuilder;

public class GamePanel implements Observer {

	private GraphicsBuilder graphicsBuilder;
	
	
	public GamePanel(IGraphicsBuilder graphicsBuilder) {
		
	}
	
	public void paintComponent(Graphics graphics) {
		
	}

	@Override
	public void update(Observable o, Object arg) {
				
	}
	
}
