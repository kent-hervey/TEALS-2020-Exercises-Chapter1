package com.hervey.app;

public class Lanterns {

	public static void main(String[] args) {
		Lanterns.drawLanterns();
		

	}

	private static void drawLanterns() {
		Lanterns.drawFiveNineThirteen();
		System.out.println();
		Lanterns.drawFiveNineThirteen();
		Lanterns.drawBars();
		Lanterns.drawThirteen();
		Lanterns.drawFiveNineThirteen();
		System.out.println();
		Lanterns.drawFiveNineThirteen();
		Lanterns.drawFive();
		Lanterns.drawBars();
		Lanterns.drawBars();
		Lanterns.drawFive();
		Lanterns.drawFive();
		
	}

	private static void drawFive() {
		System.out.println("    *****    ");
		
	}

	private static void drawThirteen() {
		System.out.println("*************");
		
	}

	private static void drawBars() {
		System.out.println("* | | | | | *");
		
	}

	private static void drawFiveNineThirteen() {
		Lanterns.drawFive();
		System.out.println("  *********  ");
		Lanterns.drawThirteen();
		
	}

}
