package br.com.gm.model;

import java.util.ArrayList;
import java.util.List;

public class MarsRover {
	
	private int maxCoordenateX;
	private int maxCoordenateY;
	private List<Rover> rovers;
	
	
	public MarsRover(int maxCoordenateX, int maxCoordenateY) {
		super();
		this.maxCoordenateX = maxCoordenateX;
		this.maxCoordenateY = maxCoordenateY;
		this.rovers = new ArrayList<Rover>();
	}

	public int getMaxCoordenateX() {
		return maxCoordenateX;
	}

	public void setMaxCoordenateX(int maxCoordenateX) {
		this.maxCoordenateX = maxCoordenateX;
	}

	public int getMaxCoordenateY() {
		return maxCoordenateY;
	}

	public void setMaxCoordenateY(int maxCoordenateY) {
		this.maxCoordenateY = maxCoordenateY;
	}
	
	public void addRover(int positionX, int positionY, char orientation){
		Rover aRover = new Rover(positionX, positionY, orientation);
		rovers.add(aRover);
	}

	public void sendCommand(String string) {
		//TODO make implementation for command 
	}
	public List<String> getFinalPositions(){
		//TODO make implemantion for getFinalPositions
		return null;
	}
	
}
