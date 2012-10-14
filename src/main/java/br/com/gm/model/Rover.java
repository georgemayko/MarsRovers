package br.com.gm.model;

import br.com.gm.enumerated.Movement;
import br.com.gm.enumerated.Orientation;
import br.com.gm.exception.MovementNotFoundException;

public class Rover {

	private Orientation orientation;
	private int coordenateX;
	private int coordenateY;
	private MarsRover marsRover;

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

	public void processCommand(String command) throws MovementNotFoundException{
		//TODO treat the exception for MOVE error
		char[] commandArray = command.toCharArray();
		for (char aCommand : commandArray){
			Movement movement =  Movement.getMovement(aCommand); 
			switch (movement) {
				case LEFT:
					rotateLeft(getOrientation());
					break;
				case RIGHT:
					rotateRight(getOrientation());
					break;
				case MIDDLE:
					moveForward(getOrientation());
					break;
				default:
					break;
			}
		}
	}

	public String getPosition(){
		StringBuilder sb = new StringBuilder();
		sb.append(coordenateX);
		sb.append(" ");
		sb.append(coordenateY);
		sb.append(" ");
		sb.append(this.orientation.toString().charAt(0));
		return sb.toString();
	}

	private void rotateLeft(Orientation orientation){
		switch (orientation) {
			case NORTH:
				setOrientation(Orientation.WEST);
				break;
			case WEST:
				setOrientation(Orientation.SOUTH);
				break;
			case EAST:
				setOrientation(Orientation.NORTH);
				break;
			case SOUTH:
				setOrientation(Orientation.EAST);
				break;
			default:
				break;
		}
	}

	private void rotateRight(Orientation orientation){
		switch (orientation) {
			case NORTH:
				setOrientation(Orientation.EAST);
				break;
			case WEST:
				setOrientation(Orientation.NORTH);
				break;
			case EAST:
				setOrientation(Orientation.SOUTH);
				break;
			case SOUTH:
				setOrientation(Orientation.WEST);
				break;
			default:
				break;
		}
	}
	
	private void moveForward(Orientation orientation){
		//TODO check MarsRover space and throw exception
		switch (orientation) {
			case NORTH:
				if(marsRover.getMaxCoordenateY() != getCoordenateY())
					setCoordenateY(getCoordenateY() + 1);
				break;
			case WEST:
				if(marsRover.getMinCoordenateX() != getCoordenateX())
					setCoordenateX(getCoordenateX() - 1);
				break;
			case EAST:
				if(marsRover.getMaxCoordenateX() != getCoordenateX())
					setCoordenateX(getCoordenateX() + 1);
				break;
			case SOUTH:
				if(marsRover.getMinCoordenateY() != getCoordenateY())
					setCoordenateY(getCoordenateY() - 1); 
				break;
			default:
				break;
		}
	}

}
