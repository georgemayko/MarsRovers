package br.com.gm.model;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;

import br.com.gm.enumerated.Orientation;
import br.com.gm.exception.CreatingRoverException;
import br.com.gm.exception.MovementInvalidException;

public class RoverMoveForwardTest {

	private Rover rover;
	private Method moveForward;
	
	@Before
	public void constructRover() throws CreatingRoverException, SecurityException, NoSuchMethodException{
		this.rover = new Rover(0, 0, 'N', new MarsRover(0, 0));
		moveForward = Rover.class.getDeclaredMethod("moveForward",Orientation.class);
		moveForward.setAccessible(true);
	} 
	
	@Test(expected = MovementInvalidException.class)
	public void movingForwardToNorthOutOfPlateuTest() throws Throwable {
		try {
			moveForward.invoke(rover, rover.getOrientation());
		} catch (IllegalArgumentException e) {
			e.getCause();
		} catch (IllegalAccessException e) {
			e.getCause();
		} catch (InvocationTargetException e) {
			throw e.getCause();
		}
	}
	

}
