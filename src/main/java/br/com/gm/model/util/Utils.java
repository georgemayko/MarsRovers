package br.com.gm.model.util;

import br.com.gm.enumerated.Orientation;
import br.com.gm.exception.OrientationNotFoundException;

public class Utils {
	
	public static Orientation charToOrientation(char orientation) throws OrientationNotFoundException{
		
		return Orientation.getOrientation(orientation);
	}

}
