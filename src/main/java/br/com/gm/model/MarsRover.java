package br.com.gm.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.gm.exception.CreatingRoverException;
import br.com.gm.exception.InvalidMarsRoverPosition;
import br.com.gm.exception.MovementNotFoundException;
import br.com.gm.exception.NoRoverCreatedException;

public class MarsRover {
	
	private int maxCoordenateX;
	private int maxCoordenateY;
	private int minCoordenateX;
	private int minCoordenateY;
	private List<Rover> rovers;
	
	Logger logger = LogManager.getLogger(MarsRover.class);
	
	
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
	
	public int getMinCoordenateX() {
		return minCoordenateX;
	}

	public void setMinCoordenateX(int minCoordenateX) {
		this.minCoordenateX = minCoordenateX;
	}

	public int getMinCoordenateY() {
		return minCoordenateY;
	}

	public void setMinCoordenateY(int minCoordenateY) {
		this.minCoordenateY = minCoordenateY;
	}

	public void addRover(int positionX, int positionY, char orientation) throws InvalidMarsRoverPosition{
		//TODO eliminate printStackTrace
		if((positionX <= getMaxCoordenateX() && positionX >= getMinCoordenateX()) 
				&& (positionY <= getMaxCoordenateY() && positionY >= getMinCoordenateY())){
			try{
				Rover aRover = new Rover(positionX, positionY, orientation,this);
				rovers.add(aRover);
			}catch (CreatingRoverException e) {
				logger.error(e.getMessage());
				e.printStackTrace();
			}
		}
		else 
			throw new InvalidMarsRoverPosition();
	}

	public void sendCommand(String command) {
		//TODO eliminate printStackTrace
		try {
			rovers.get(getLastRoverAddedIndex()).processCommand(command);
		} catch (MovementNotFoundException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}catch( NoRoverCreatedException e ){
			logger.error(e.getMessage());
			e.printStackTrace();
		}
	}
	public List<String> getFinalPositions(){
		List<String> positions = new ArrayList<String>();
		for( Rover aRover : rovers){
			System.out.println(aRover.getPosition());
			positions.add(aRover.getPosition());
		}
		return positions;
	}
	
	private int getLastRoverAddedIndex() throws NoRoverCreatedException{
		if(rovers.size()>0)
			return rovers.size() - 1;
		else 
			throw new NoRoverCreatedException();
	}

	
}
