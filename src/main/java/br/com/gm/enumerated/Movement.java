package br.com.gm.enumerated;

import br.com.gm.exception.OrientationNotFoundException;

public enum Movement {
	LEFT('N'),
	RIGHT('R'),
	MIDDLE('M');

	private char move; 
	
	Movement( char orientation) {
		this.move = orientation;
	}

	
	public static Movement getMovement( char value) throws OrientationNotFoundException{
		for(Movement movement : values()){
			if(movement.move == value){
				return movement;
			}
		}
		throw new OrientationNotFoundException();
    }
	
}
