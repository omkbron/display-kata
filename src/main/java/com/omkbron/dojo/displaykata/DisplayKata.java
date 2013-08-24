package com.omkbron.dojo.displaykata;

public class DisplayKata {

	private static final String EOL = "\n";
	
	private static final String [] RENG = { " _ ",  "   ", "| |", "  |", " _|", "|_|", "|_ " };
	
	/**
	 * Metodo que recibe un numero entero y lo imprime en consola en forma de display.
	 * 
	 * @param num
	 * @return 
	 */
	public static String convertirNumero(int num) {
		
		String numString = String.valueOf(num);
				
		String numero = "";
		
		StringBuilder r1 = new StringBuilder();
		StringBuilder r2 = new StringBuilder();
		StringBuilder r3 = new StringBuilder();
		
		for (int i = 0; i < numString.length() ; i++) {
			
			switch (numString.charAt(i)) {
			case '0':
				r1.append(RENG[0]);
				r2.append(RENG[2]);
				r3.append(RENG[5]);
				break;
			case '1':
				r1.append(RENG[1]);
				r2.append(RENG[3]);
				r3.append(RENG[3]);
				break;
			case '2':
				r1.append(RENG[0]);
				r2.append(RENG[4]);
				r3.append(RENG[6]);
				break;
			case '3':
				r1.append(RENG[0]);
				r2.append(RENG[4]);
				r3.append(RENG[4]);
				break;
			case '4':
				r1.append(RENG[1]);
				r2.append(RENG[5]);
				r3.append(RENG[3]);
				break;
			case '5':
				r1.append(RENG[0]);
				r2.append(RENG[6]);
				r3.append(RENG[4]);
				break;
			case '6':
				r1.append(RENG[0]);
				r2.append(RENG[6]);
				r3.append(RENG[5]);
				break;
			case '7':
				r1.append(RENG[0]);
				r2.append(RENG[3]);
				r3.append(RENG[3]);
				break;
			case '8':
				r1.append(RENG[0]);
				r2.append(RENG[5]);
				r3.append(RENG[5]);
				break;
			case '9':
				r1.append(RENG[0]);
				r2.append(RENG[5]);
				r3.append(RENG[4]);
				break;
	
			default:
				break;
			}
		}
		numero = (r1.append(EOL).append(r2).append(EOL).append(r3)).toString();
		System.out.println(numero);
		
		return numero;
	}
}
