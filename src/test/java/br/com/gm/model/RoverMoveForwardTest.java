package br.com.gm.model;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import junit.framework.Assert;

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
			this.rover = new Rover(1, 3, 'N', new MarsRover(3, 3));
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
			this.rover = new Rover(2, 1, 'E', new MarsRover(2, 2));
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
			this.rover = new Rover(2, 0, 'S', new MarsRover(3, 1));
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
			this.rover = new Rover(0, 2, 'W', new MarsRover(1, 3));
			moveForward.invoke(rover, rover.getOrientation());
		} catch (IllegalArgumentException e) {
			e.getCause();
		} catch (IllegalAccessException e) {
			e.getCause();
		} catch (InvocationTargetException e) {
			throw e.getCause();
		}
	}
	
	
	@Test
	public void movingForwardToNorthTest() throws Throwable {
		try {
			this.rover = new Rover(1, 1, 'N', new MarsRover(3, 3));
			moveForward.invoke(rover, rover.getOrientation());
			
			Assert.assertEquals(1, rover.getCoordenateX());
			Assert.assertEquals(2, rover.getCoordenateY());
			Assert.assertEquals(Orientation.NORTH, rover.getOrientation());
		} catch (IllegalArgumentException e) {
			e.getCause();
		} catch (IllegalAccessException e) {
			e.getCause();
		} catch (InvocationTargetException e) {
			throw e.getCause();
		}
	}
	
	@Test
	public void movingForwardToEastTest() throws Throwable {
		try {
			this.rover = new Rover(0, 1, 'E', new MarsRover(2, 2));
			moveForward.invoke(rover, rover.getOrientation());
			
			Assert.assertEquals(1, rover.getCoordenateX());
			Assert.assertEquals(1, rover.getCoordenateY());
			Assert.assertEquals(Orientation.EAST, rover.getOrientation());
		} catch (IllegalArgumentException e) {
			e.getCause();
		} catch (IllegalAccessException e) {
			e.getCause();
		} catch (InvocationTargetException e) {
			throw e.getCause();
		}
	}
	
	@Test
	public void movingForwardToSouthTest() throws Throwable {
		try {
			
			this.rover = new Rover(2, 1, 'S', new MarsRover(3, 1));
			moveForward.invoke(rover, rover.getOrientation());
			
			Assert.assertEquals(2, rover.getCoordenateX());
			Assert.assertEquals(0, rover.getCoordenateY());
			Assert.assertEquals(Orientation.SOUTH, rover.getOrientation());
		} catch (IllegalArgumentException e) {
			e.getCause();
		} catch (IllegalAccessException e) {
			e.getCause();
		} catch (InvocationTargetException e) {
			throw e.getCause();
		}
	}
	
	@Test
	public void movingForwardToWestTest() throws Throwable {
		try {
			
			this.rover = new Rover(1, 2, 'W', new MarsRover(1, 3));
			moveForward.invoke(rover, rover.getOrientation());
			
			Assert.assertEquals(0, rover.getCoordenateX());
			Assert.assertEquals(2, rover.getCoordenateY());
			Assert.assertEquals(Orientation.WEST, rover.getOrientation());
		} catch (IllegalArgumentException e) {
			e.getCause();
		} catch (IllegalAccessException e) {
			e.getCause();
		} catch (InvocationTargetException e) {
			throw e.getCause();
		}
	}
	
	

}
