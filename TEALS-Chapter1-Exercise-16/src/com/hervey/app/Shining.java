package com.hervey.app;

public class Shining {

	public static void main(String[] args) {
		drawPhrase1000Times();

	}

	private static void drawPhrase1000Times() {
		drawPhrase100Times();
		drawPhrase100Times();
		drawPhrase100Times();
		drawPhrase100Times();
		drawPhrase100Times();
		drawPhrase100Times();
		drawPhrase100Times();
		drawPhrase100Times();
		drawPhrase100Times();
		drawPhrase100Times();
		
	}

	private static void drawPhrase100Times() {
		drawPhrase10Times();
		drawPhrase10Times();
		drawPhrase10Times();
		drawPhrase10Times();
		drawPhrase10Times();
		drawPhrase10Times();
		drawPhrase10Times();
		drawPhrase10Times();
		drawPhrase10Times();
		drawPhrase10Times();
	}

	private static void drawPhrase10Times() {

		drawPhrase();
		drawPhrase();
		drawPhrase();
		drawPhrase();
		drawPhrase();
		drawPhrase();
		drawPhrase();
		drawPhrase();
		drawPhrase();
		drawPhrase();
	}

	private static void drawPhrase() {
		System.out.println("All work and no play makes Jack a dull boy.");
		
	}

}
