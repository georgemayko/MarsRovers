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
		
		moveForward = Rover.class.getDeclaredMethod("moveForward",Orientation.class);
		moveForward.setAccessible(true);
	} 
	
	@Test(expected = MovementInvalidException.class)
	public void movingForwardToNorthOutOfPlateuTest() throws Throwable {
		try {
			//rover on max Y coordenate
			this.rover = new Rover(1, 1, 'N', new MarsRover(1, 1));
			moveForward.invoke(rover, rover.getOrientation());
		} catch (IllegalArgumentException e) {
			e.getCause();
		} catch (IllegalAccessException e) {
			e.getCause();
		} catch (InvocationTargetException e) {
			throw e.getCause();
		}
	}
	
	@Test(expected = MovementInvalidException.class)
	public void movingForwardToEastOutOfPlateuTest() throws Throwable {
		try {
			//rover on max X coordenate
			this.rover = new Rover(1, 0, 'E', new MarsRover(1, 1));
			moveForward.invoke(rover, rover.getOrientation());
		} catch (IllegalArgumentException e) {
			e.getCause();
		} catch (IllegalAccessException e) {
			e.getCause();
		} catch (InvocationTargetException e) {
			throw e.getCause();
		}
	}
	
	@Test(expected = MovementInvalidException.class)
	public void movingForwardToSouthOutOfPlateuTest() throws Throwable {
		try {
			//rover on min Y coordenate
			this.rover = new Rover(1, 0, 'S', new MarsRover(1, 1));
			moveForward.invoke(rover, rover.getOrientation());
		} catch (IllegalArgumentException e) {
			e.getCause();
		} catch (IllegalAccessException e) {
			e.getCause();
		} catch (InvocationTargetException e) {
			throw e.getCause();
		}
	}
	
	@Test(expected = MovementInvalidException.class)
	public void movingForwardToWestOutOfPlateuTest() throws Throwable {
		try {
			//rover on min X coordenate
			this.rover = new Rover(0, 1, 'W', new MarsRover(1, 1));
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
