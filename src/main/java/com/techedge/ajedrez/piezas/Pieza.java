package com.techedge.ajedrez.piezas;

public abstract class Pieza {
	private char color;
	private char tipo;
	private String posicion;
	
	public Pieza(char color, char tipo, String posicion) {
		super();
		this.color = color;
		this.tipo = tipo;
		this.posicion = posicion;
	}
	
	public char getColor() {
		return color;
	}
	public void setColor(char color) {
		this.color = color;
	}
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	public abstract char[][] comprobarMovimientos();
}
