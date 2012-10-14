package br.com.gm.model;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.gm.enumerated.Orientation;
import br.com.gm.exception.CreatingRoverException;

public class RoverOrientationManipulationTest {
	
	private Rover rover;
	private Method rotateLeft;
	private Method rotateRight;
	
	@Before
	public void constructRoverAndModifyAcessPrivateMethods() throws CreatingRoverException, SecurityException, NoSuchMethodException{
		rover = new Rover(1,2,'N', new MarsRover(5, 5));
		
		rotateLeft = Rover.class.getDeclaredMethod("rotateLeft",Orientation.class);
		rotateRight = Rover.class.getDeclaredMethod("rotateRight",Orientation.class);
		
		rotateLeft.setAccessible(true);
		rotateRight.setAccessible(true);
	}

	@Test
	public void testRotateLeftFromNorth() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		rotateLeft.invoke(rover, Orientation.NORTH);
		Assert.assertEquals(Orientation.WEST, rover.getOrientation());
	}
	
	@Test
	public void testRotateLeftFromWest() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		rotateLeft.invoke(rover, Orientation.WEST);
		Assert.assertEquals(Orientation.SOUTH, rover.getOrientation());
	}
	
	@Test
	public void testRotateLeftFromSouth() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		rotateLeft.invoke(rover, Orientation.SOUTH);
		Assert.assertEquals(Orientation.EAST, rover.getOrientation());
	}
	
	@Test
	public void testRotateLeftFromEast() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		rotateLeft.invoke(rover, Orientation.EAST);
		Assert.assertEquals(Orientation.NORTH, rover.getOrientation());
	}
	
	@Test
	public void testRotateRightFromNorth() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		rotateRight.invoke(rover, Orientation.NORTH);
		Assert.assertEquals(Orientation.EAST, rover.getOrientation());
	}
	
	@Test
	public void testRotateRightFromEast() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		rotateRight.invoke(rover, Orientation.EAST);
		Assert.assertEquals(Orientation.SOUTH, rover.getOrientation());
	}
	
	
	@Test
	public void testRotateRightFromSouth() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		rotateRight.invoke(rover, Orientation.SOUTH);
		Assert.assertEquals(Orientation.WEST, rover.getOrientation());
	}
	
	@Test
	public void testRotateRightFromWest() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		rotateRight.invoke(rover, Orientation.WEST);
		Assert.assertEquals(Orientation.NORTH, rover.getOrientation());
	}
	
	
	

}
