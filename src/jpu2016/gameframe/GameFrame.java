package jpu2016.gameframe;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Observable;

import jpu2016.dogfight.view.EventPerformer;



public class GameFrame extends KeyAdapter {

	private EventPerformer eventPerformer;
	
	
	public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicBuilder, Observable observable) {
		
	}
	
	public void keyPressed(KeyEvent keyEvent) {
		char ch = event.getKeyChar();
		if (ch == 'z') {System.out.println("Z");}
		if (ch == 's') {System.out.println("S");}
		if (ch == 'q') {System.out.println("Q");}
		if (ch == 'd') {System.out.println("D");}
	}
	
	public void keyReleased(KeyEvent keyEvent) {
		
	}
	
	public void keyTyped(KeyEvent keyEvent) {
		
	}	
}