package com.vazzup.vazzupoj.cpprunnable;

import java.util.*;

public class CppRunnable implements Runnable{

	String solutionName;
	Vector <String> inputFiles = new Vector<String>();
	Vector <String> outputFiles = new Vector<String>();
	boolean ioPresent = false;
	
	CppRunnable(String solutionName, Vector <String> inputFiles, Vector <String> outputFiles, boolean ioPresent) {
		this.solutionName = solutionName;
		this.inputFiles = inputFiles;
		this.outputFiles = outputFiles;
		this.ioPresent = ioPresent;
	}
	
	@Override
	public void run() {
		if(!ioPresent) {
			try {
				ProcessBuilder processBuilder = new ProcessBuilder("./res/scripts/cppscript", solutionName);
				processBuilder.inheritIO();
				Process process = processBuilder.start();
				process.waitFor();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		else {
			for(int i=0;i<inputFiles.size(); i++) {
				try {
					ProcessBuilder processBuilder = new ProcessBuilder("./res/scripts/cppscript", solutionName, inputFiles.elementAt(i), outputFiles.elementAt(i));
					processBuilder.inheritIO();
					Process process = processBuilder.start();
					process.waitFor();
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
		}
	}	
}
