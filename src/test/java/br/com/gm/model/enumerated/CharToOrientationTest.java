package br.com.gm.model.enumerated;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.gm.enumerated.Orientation;
import br.com.gm.exception.OrientationNotFoundException;

public class CharToOrientationTest {

	@Test
	public void charNToOrientationNorth() throws OrientationNotFoundException{
		assertEquals(Orientation.NORTH, Orientation.getOrientation('N'));
	}
	
	@Test
	public void charSToOrientationSouth() throws OrientationNotFoundException{
		assertEquals(Orientation.SOUTH, Orientation.getOrientation('S'));
	}
	
	@Test
	public void charEToOrientationSouth() throws OrientationNotFoundException{
		assertEquals(Orientation.EAST, Orientation.getOrientation('E'));
	}
	
	@Test
	public void charWToOrientationWest() throws OrientationNotFoundException{
		assertEquals(Orientation.WEST, Orientation.getOrientation('W'));
	}

}
