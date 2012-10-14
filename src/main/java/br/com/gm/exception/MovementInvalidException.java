package br.com.gm.exception;

public class MovementInvalidException extends Exception {
	
	
	private static final long serialVersionUID = -7250433822032634281L;
	public final static String MAX_POSITION_ALREADY_REACHED = "Invalid Movement: maximum position already reached";
	public final static String MIN_POSITION_ALREADY_REACHED = "Invalid Movement: minimum position already reached";
	
	public MovementInvalidException( String message){
		super(message);
	}

}
