package com.techedge.ajedrez.main;

import com.techedge.ajedrez.piezas.Alfil;
import com.techedge.ajedrez.piezas.Caballo;
import com.techedge.ajedrez.piezas.Peon;
import com.techedge.ajedrez.piezas.Pieza;
import com.techedge.ajedrez.piezas.Reina;
import com.techedge.ajedrez.piezas.Rey;
import com.techedge.ajedrez.piezas.Torre;


public class Tablero {
	
	private Pieza[][] posiciones;
	
	public Tablero(){
		posiciones = new Pieza[8][8];
	}
	
	public boolean reseteoTablero(){
		posiciones[0][0] = new Torre	('N', "A8");
		posiciones[1][0] = new Caballo	('N', "B8");
		posiciones[2][0] = new Alfil	('N', "C8");
		posiciones[3][0] = new Reina	('N', "D8");
		posiciones[4][0] = new Rey		('N', "E8");
		posiciones[5][0] = new Alfil	('N', "F8");
		posiciones[6][0] = new Caballo	('N', "G8");
		posiciones[7][0] = new Torre	('N', "H8");
		
		posiciones[0][1] = new Peon		('N', "A7");
		posiciones[1][1] = new Peon		('N', "B7");
		posiciones[2][1] = new Peon		('N', "C7");
		posiciones[3][1] = new Peon		('N', "D7");
		posiciones[4][1] = new Peon		('N', "R7");
		posiciones[5][1] = new Peon		('N', "F7");
		posiciones[6][1] = new Peon		('N', "G7");
		posiciones[7][1] = new Peon		('N', "H7");
		
		posiciones[0][7] = new Torre	('B', "A1");
		posiciones[1][7] = new Caballo	('B', "B1");
		posiciones[2][7] = new Alfil	('B', "C1");
		posiciones[3][7] = new Reina	('B', "D1");
		posiciones[4][7] = new Rey		('B', "E1");
		posiciones[5][7] = new Alfil	('B', "F1");
		posiciones[6][7] = new Caballo	('B', "G1");
		posiciones[7][7] = new Torre	('B', "H1");
		
		posiciones[0][1] = new Peon		('B', "A2");
		posiciones[1][1] = new Peon		('B', "B2");
		posiciones[2][1] = new Peon		('B', "C2");
		posiciones[3][1] = new Peon		('B', "D2");
		posiciones[4][1] = new Peon		('B', "E2");
		posiciones[5][1] = new Peon		('B', "F2");
		posiciones[6][1] = new Peon		('B', "G2");
		posiciones[7][1] = new Peon		('B', "H2");
		
		for (int i = 0; i < 8; i ++){
			for (int j = 2; j < 6; j++ ){
				posiciones[i][j] = null;
			}
		}
		
		return true;
	}
	
	
	
}
