package br.com.gm.model;

public class MarsRover {
	
	private int maxCoordenateX;
	private int maxCoordenateY;
	
	
	public MarsRover(int maxCoordenateX, int maxCoordenateY) {
		super();
		this.maxCoordenateX = maxCoordenateX;
		this.maxCoordenateY = maxCoordenateY;
	}

	public int getMaxCoordenateX() {
		return maxCoordenateX;
	}

	public void setMaxCoordenateX(int maxCoordenateX) {
		this.maxCoordenateX = maxCoordenateX;
	}

	public int getMaxCoordenateY() {
		return maxCoordenateY;
	}

	public void setMaxCoordenateY(int maxCoordenateY) {
		this.maxCoordenateY = maxCoordenateY;
	}
	
}
