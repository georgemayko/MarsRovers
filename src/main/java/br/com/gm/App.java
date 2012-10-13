package br.com.gm;

import br.com.gm.model.MarsRover;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MarsRover marsRover = new MarsRover(5, 5);
        
        marsRover.addRover(1,2,'N');
        
    }
}
