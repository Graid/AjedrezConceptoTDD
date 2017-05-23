package com.techedge.ajedrez.piezas;

public class Peon extends Pieza{
	
	private boolean primerMovimiento;
	
	public Peon(char color, String posicion) {
		super(color, 'P', posicion);
		// TODO Auto-generated constructor stub
		primerMovimiento = false;
	}

	@Override
	public char[][] comprobarMovimientos() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isPrimerMovimiento() {
		return primerMovimiento;
	}

	public void setPrimerMovimiento(boolean primerMovimiento) {
		this.primerMovimiento = primerMovimiento;
	}
	
	

}
