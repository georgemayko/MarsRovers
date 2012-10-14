package br.com.gm;

import br.com.gm.exception.InvalidMarsRoverPosition;
import br.com.gm.model.MarsRover;

public class App 
{
	public static void main( String[] args )
	{
		MarsRover marsRover = new MarsRover(5, 5);

		//adding rover#1
		try {
			marsRover.addRover(1,2,'N');
			marsRover.sendCommand("LMLMLMLMM");
		} catch (InvalidMarsRoverPosition e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



		try{        
			marsRover.addRover(3,3,'E');
			marsRover.sendCommand("MMRMMRMRRM");
		} catch (InvalidMarsRoverPosition e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		marsRover.getFinalPositions();

	}
}
