package com.hervey.app;

public class FightSong {
	
	public static void main(String[] args) {
		FightSong.printFightSong();
		
	}

	private static void printFightSong() {
		printGoTeamLines();
		printStanzaSpacing();
		
		printGoTeamLines();
		printBestLines();
		printGoTeamLines();
		printStanzaSpacing();
		
		printGoTeamLines();
		printBestLines();
		printGoTeamLines();
		printStanzaSpacing();
		
		printGoTeamLines();
		
	}

	private static void printStanzaSpacing() {
		System.out.print("\n\n");
		
	}

	private static void printBestLines() {
		System.out.print("You're the best,\nIn the West.\n");
		
	}

	private static void printGoTeamLines() {
		System.out.print("Go, team, go!\nYou can do it.\n");
	}

	

	

}
