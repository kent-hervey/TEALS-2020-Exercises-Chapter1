package com.hervey.app;

public class TwoRockets {
	
	public static void main(String[] args) {
		TwoRockets.drawTwoRockets();
		
	}

	
	private static void drawTwoRockets() {
		System.out.println("Drawing Two rockets");
		TwoRockets.drawTheCones();
		TwoRockets.drawTheBoxes();
		TwoRockets.drawTheLabels();
		TwoRockets.drawTheBoxes();
		TwoRockets.drawTheCones();
		
	}


	private static void drawTheLabels() {
		//Draw United twice, then CR
		System.out.print("|United|");
		System.out.print("|United|");
		System.out.print("\n");
		//Draw States twice, then CR
		System.out.print("|States|");
		System.out.print("|States|");
		System.out.print("\n");
		
	}


	private static void drawTheBoxes() {
		// TODO Auto-generated method stub
		//draw the top/bottom twice, then CR
		System.out.print("+------+");
		System.out.print("+------+");
		System.out.print("\n");
		
		//draw filler twice, then CR
		System.out.print("|      |");
		System.out.print("|      |");
		System.out.print("\n");
		
		//draw filler twice, then CR
		System.out.print("|      |");
		System.out.print("|      |");
		System.out.print("\n");
		
		
		//draw the top/bottom twice, then CR
		System.out.print("+------+");
		System.out.print("+------+");
		System.out.print("\n");
		
	}


	private static void drawTheCones() {
		//draw Cone level2 twice, then CR
		System.out.print("   /\\   ");
		System.out.print("   /\\   ");
		System.out.print("\n");
		
		//draw Cone level2 twice, then CR
		System.out.print("  /  \\  ");
		System.out.print("  /  \\  ");
		System.out.print("\n");
		
		//draw Cone level1 twice, then CR
		System.out.print(" /    \\ ");
		System.out.print(" /    \\ ");
		System.out.print("\n");
		
		
	}
	

}
