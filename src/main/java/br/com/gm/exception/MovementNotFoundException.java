package br.com.gm.exception;

public class MovementNotFoundException extends Exception {
	
	
	private static final long serialVersionUID = -7250433822032634281L;
	private final static String MESSAGE = "Can not convert movement into enum";
	
	public MovementNotFoundException( char value){
		super(MESSAGE + ": "+ value);
	}

}
