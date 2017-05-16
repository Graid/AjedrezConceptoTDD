package com.techedge.ajedrez.utils;

public class AjedrezUtils {
	
	public static String pintarTablero(String[][] posTablero){
		
		StringBuffer res = new StringBuffer();
		
		for (String[] fila : posTablero) {
			res.append("+---+---+---+---+---+---+---+---+ \n");
			for (String posicion : fila) {
				res.append("|"); 
				switch (posicion) {
				case "TBL":
					res.append(" T ");
					break;
				case "HBL":
					res.append(" H ");
					break;
				case "ABL":
					res.append(" A ");
					break;
				case "QB":
					res.append(" Q ");
					break;
				case "KB":
					res.append(" K ");
					break;
				case "ABR":
					res.append(" A ");
					break;
				case "HBR":
					res.append(" H ");
					break;
				case "TBR":
					res.append(" T ");
					break;
				case "TWL":
					res.append(" T ");
					break;
				case "HWL":
					res.append(" H ");
					break;
				case "AWL":
					res.append(" A ");
					break;
				case "QW":
					res.append(" Q ");
					break;
				case "KW":
					res.append(" K ");
					break;
				case "AWR":
					res.append(" A ");
					break;
				case "HWR":
					res.append(" H ");
					break;
				case "TWR":
					res.append(" T ");
					break;
				case "PB":
					res.append(" P ");
					break;
				case "PW":
					res.append(" P ");
					break;
				default:
					res.append("   ");
					break;
				} //End Switch
			}//End for
			res.append("| \n");
		}//End for
		res.append("+---+---+---+---+---+---+---+---+ \n");
		
		System.out.println(res.toString());
		
		return res.toString();
		
	}
	
}
