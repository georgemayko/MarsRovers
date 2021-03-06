package br.com.gm.enumerated;

import br.com.gm.exception.MovementNotFoundException;

public enum Movement {
	LEFT('L'),
	RIGHT('R'),
	MIDDLE('M');

	private char move; 
	
	Movement( char orientation) {
		this.move = orientation;
	}

	
	public static Movement getMovement( char value) throws MovementNotFoundException{
		for(Movement movement : values()){
			if(movement.move == value){
				return movement;
			}
		}
		throw new MovementNotFoundException(value);
    }
	
}
