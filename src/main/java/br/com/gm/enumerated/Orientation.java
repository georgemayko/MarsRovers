package br.com.gm.enumerated;

import javax.swing.text.Position;

import br.com.gm.exception.OrientationNotFounException;

public enum Orientation {
	NORTH('N'),
	EAST('E'),
	WEST('W'),
	SOUTH('S');

	private char orientation; 
	
	Orientation( char orientation) {
		this.orientation = orientation;
	}

	
	public static Orientation getOrientation( char value) throws OrientationNotFounException{
		for(Orientation orientation : values()){
			if(orientation.orientation == value){
				return orientation;
			}
		}
		throw new OrientationNotFounException();
    }
	
}
