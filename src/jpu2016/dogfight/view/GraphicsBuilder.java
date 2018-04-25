package jpu2016.dogfight.view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import jpu2016.dogfight.model.IDogfightModel;

public class GraphicsBuilder {
	
	private IDogfightModel dogfightModel;
	private BufferedImage emptySky;
	
	public GraphicsBuilder(IDogfightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
		this.buildEmptySky();
	}
	
	private void buildEmptySky() {

		emptySky = new BufferedImage(width, height, )
	}
	public void applyModelToGraphic(Graphics graphics, ImageObserver observer) {
		
	}
	
	public int getGlobalWidth() {
		return 1;
	}
	
	public int getGlobalHeight() {
		return 1;
	}	
