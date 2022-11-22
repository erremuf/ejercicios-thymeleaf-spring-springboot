package com.rmf.models;

public class Coche {
	
	private boolean apto;
	private int caballos;
	private String color;
	
	public Coche() {
		super();
	}

	public Coche(boolean apto, int caballos, String color) {
		super();
		this.apto = apto;
		this.caballos = caballos;
		this.color = color;
	}

	public boolean isApto() {
		return apto;
	}

	public void setApto(boolean apto) {
		this.apto = apto;
	}

	public int getCaballos() {
		return caballos;
	}

	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	

}
