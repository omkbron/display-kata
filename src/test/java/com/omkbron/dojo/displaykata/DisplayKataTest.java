package com.omkbron.dojo.displaykata;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class DisplayKataTest {
	
	private static final String CERO = " _ \n" +
										  "| |\n" +
										  "|_|";
	
	private static final String UNO = "   \n" +
										"  |\n" +
										"  |";
	
	private static final String DOS = " _ \n" +
			  							" _|\n" +
			  							"|_ ";
	
	private static final String TRES = " _ \n" +
			  							  " _|\n" +
			  							  " _|";
	
	private static final String CUATRO = "   \n" +
			  								"|_|\n" +
			  								"  |";
	
	private static final String CINCO = " _ \n" +
			  							   "|_ \n" +
			  							   " _|";
	
	private static final String SEIS = " _ \n" +
			  							  "|_ \n" +
			  							  "|_|";
	
	private static final String SIETE = " _ \n" +
			  							   "  |\n" +
			  							   "  |";
	
	private static final String OCHO = " _ \n" +
			  							 "|_|\n" +
			  							 "|_|";
	
	private static final String NUEVE = " _ \n" +
			  							   "|_|\n" +
			  							   " _|";
	
	@Test
	public void convertirADisplay() {
		int [] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		String [] numsDisplay = { CERO, UNO, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, OCHO, NUEVE };
		
		for (int i = 0; i < nums.length; i ++) {
			assertEquals(numsDisplay[i], DisplayKata.convertirNumero(nums[i]));
		}
	}
	
	@Test
	public void convertirCualquiera() {
		System.out.println(DisplayKata.convertirNumero(147098735));
	}
	
}
