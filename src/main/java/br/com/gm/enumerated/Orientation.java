package br.com.gm.enumerated;

import br.com.gm.exception.OrientationNotFoundException;

public enum Orientation {
	NORTH('N'),
	EAST('E'),
	WEST('W'),
	SOUTH('S');

	private char orientation; 
	
	Orientation( char orientation) {
		this.orientation = orientation;
	}

	
	public static Orientation getOrientation( char value) throws OrientationNotFoundException{
		for(Orientation orientation : values()){
			if(orientation.orientation == value){
				return orientation;
			}
		}
		throw new OrientationNotFoundException();
    }
	
}
