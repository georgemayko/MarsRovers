package br.com.gm.model;

import br.com.gm.enumerated.Orientation;

public class Rover {
	
	private Orientation orientation;
	private int coordenateX;
	private int coordenateY;
	private MarsRover marsRover;
	
	public Rover() {
		
	}
	
	public Rover(int coordenateX, int coordenateY, Orientation orientation, MarsRover marsRover) {
		super();
		this.orientation = orientation;
		this.coordenateX = coordenateX;
		this.coordenateY = coordenateY;
		this.marsRover = marsRover;
	}
	
	public Orientation getOrientation() {
		return orientation;
	}
	
	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}
	
	public int getCoordenateX() {
		return coordenateX;
	}
	
	public void setCoordenateX(int coordenateX) {
		this.coordenateX = coordenateX;
	}
	
	public int getCoordenateY() {
		return coordenateY;
	}
	
	public void setCoordenateY(int coordenateY) {
		this.coordenateY = coordenateY;
	}
	
	public void processCommand(String command){
		//TODO implement the move aspect
	}
	
	public String getPosition(){
		StringBuilder sb = new StringBuilder();
		sb.append(coordenateX);
		sb.append(" ");
		sb.append(coordenateY);
		sb.append(" ");
		sb.append(this.orientation);
		return sb.toString();
	}
	
}
