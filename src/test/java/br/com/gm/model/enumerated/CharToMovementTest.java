package br.com.gm.model.enumerated;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.gm.enumerated.Movement;
import br.com.gm.exception.MovementNotFoundException;

public class CharToMovementTest {

	@Test
	public void charLtoLeftMovementTest() throws MovementNotFoundException {
		assertEquals(Movement.LEFT, Movement.getMovement('L'));
	}
	
	@Test
	public void charRtoRightMovementTest() throws MovementNotFoundException {
		assertEquals(Movement.RIGHT, Movement.getMovement('R'));
	}
	
	@Test
	public void charMtoMiddleMovementTest() throws MovementNotFoundException {
		assertEquals(Movement.MIDDLE, Movement.getMovement('M'));
	}

}
