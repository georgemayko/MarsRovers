package br.com.gm.exception;

public class NoRoverCreatedException extends Exception {
	
	
	private static final long serialVersionUID = -7250433822032634281L;
	private static final String MESSAGE = "No rover added to plateu";

	
	public NoRoverCreatedException() {
		super(MESSAGE);
	}

}
