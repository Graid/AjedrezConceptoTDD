package com.techedge.ajedrez.utils;

import org.junit.Test;
import static org.junit.Assert.*;

public class AjedrezUtilsTest {
	
	@Test
	public void testPintarTableroNuevo(){
		
		String[][] posiciones = {{"TBL","HBL","ABL","QB","KB","ABR","HBR","TBR"},
								 {"PB", "PB", "PB", "PB", "PB", "PB", "PB", "PB" },
								 {" ",  " ",  " ",  " ",  " ",  " ",  " ", " ",},
								 {" ",  " ",  " ",  " ",  " ",  " ",  " ", " ",},
								 {" ",  " ",  " ",  " ",  " ",  " ",  " ", " ",},
								 {" ",  " ",  " ",  " ",  " ",  " ",  " ", " ",},
								 {"PW", "PW", "PW", "PW", "PW", "PW", "PW" ,"PW"},
								 {"TWL","HWL","AWL","KW","QW","AWR","HWR","TWR"}
								};
		
		
		
		String resultadoBuscado = "+---+---+---+---+---+---+---+---+ \n" +
								  "| T | H | A | Q | K | A | H | T | \n" +
								  "+---+---+---+---+---+---+---+---+ \n" +
								  "| P | P | P | P | P | P | P | P | \n" +
								  "+---+---+---+---+---+---+---+---+ \n" +
								  "|   |   |   |   |   |   |   |   | \n" +
								  "+---+---+---+---+---+---+---+---+ \n" +
								  "|   |   |   |   |   |   |   |   | \n" +
								  "+---+---+---+---+---+---+---+---+ \n" +
								  "|   |   |   |   |   |   |   |   | \n" +
								  "+---+---+---+---+---+---+---+---+ \n" +
								  "|   |   |   |   |   |   |   |   | \n" +
								  "+---+---+---+---+---+---+---+---+ \n" +
								  "| P | P | P | P | P | P | P | P | \n" +
								  "+---+---+---+---+---+---+---+---+ \n" +
								  "| T | H | A | K | Q | A | H | T | \n" +
								  "+---+---+---+---+---+---+---+---+ \n" ;
		
		String tablero = AjedrezUtils.pintarTablero(posiciones);
		assertEquals(resultadoBuscado, tablero);
	}
	
	@Test
	public void testPintarTableroEmpezado(){
		
		String[][] posiciones = {{"TBL","HBL","ABL","QB","KB","ABR","HBR","TBR"},
								 {"PB", "PB", "PB", "PB", "PB", "PB", "PB", "PB"},
								 {" ",  " ",  " ",  " ",  " ",  " ",  " ", " ",},
								 {" ",  " ",  " ",  " ",  " ",  " ",  " ", " ",},
								 {" ",  " ",  " ",  " ",  "PW",  " ",  " ", " ",},
								 {" ",  " ",  " ",  " ",  " ",  " ",  " ", " ",},
								 {"PW", "PW", "PW", "PW"," ", "PW", "PW", "PW" },
								 {"TWL","HWL","AWL","KW","QW","AWR","HWR","TWR"}
								};
		
		
		String resultadoBuscado = "+---+---+---+---+---+---+---+---+ \n" +
								  "| T | H | A | Q | K | A | H | T | \n" +
								  "+---+---+---+---+---+---+---+---+ \n" +
								  "| P | P | P | P | P | P | P | P | \n" +
								  "+---+---+---+---+---+---+---+---+ \n" +
								  "|   |   |   |   |   |   |   |   | \n" +
								  "+---+---+---+---+---+---+---+---+ \n" +
								  "|   |   |   |   |   |   |   |   | \n" +
								  "+---+---+---+---+---+---+---+---+ \n" +
								  "|   |   |   |   | P |   |   |   | \n" +
								  "+---+---+---+---+---+---+---+---+ \n" +
								  "|   |   |   |   |   |   |   |   | \n" +
								  "+---+---+---+---+---+---+---+---+ \n" +
								  "| P | P | P | P |   | P | P | P | \n" +
								  "+---+---+---+---+---+---+---+---+ \n" +
								  "| T | H | A | K | Q | A | H | T | \n" +
								  "+---+---+---+---+---+---+---+---+ \n" ;
		
		String tablero = AjedrezUtils.pintarTablero(posiciones);
		assertEquals(resultadoBuscado, tablero);
	}
	
}
