package br.com.gm.exception;

public class OrientationNotFounException extends Exception {
	
	
	private static final long serialVersionUID = -7250433822032634281L;
	private final static String MESSAGE = "Can not convert orientation into enum";
	
	public OrientationNotFounException() {
		
	}
	@Override
	public String getMessage() {
		//return super.getMessage();
		return MESSAGE;
	}

}
