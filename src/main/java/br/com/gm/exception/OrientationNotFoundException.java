package br.com.gm.exception;

public class OrientationNotFoundException extends Exception {
	
	
	private static final long serialVersionUID = -7250433822032634281L;
	private final static String MESSAGE = "Can not convert orientation into enum";
	
	public OrientationNotFoundException() {
		super(MESSAGE);
	}

}
