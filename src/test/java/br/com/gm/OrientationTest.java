package br.com.gm;


import br.com.gm.enumerated.Orientation;
import br.com.gm.exception.OrientationNotFounException;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class OrientationTest extends TestCase{
	
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public OrientationTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( OrientationTest.class );
    }
    
    
    
    public void testConversionCharToEnum() throws OrientationNotFounException{
    
    	assertEquals(Orientation.EAST, Orientation.getOrientation('E'));
    }
    
    

}
