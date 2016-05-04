package com.vazzup.vazzupoj.mainprog;

public class MainProg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			ProcessBuilder processBuilder = new ProcessBuilder("./res/scripts/cscript", "testc");
			processBuilder.inheritIO();
			Process process = processBuilder.start();
			process.waitFor();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
