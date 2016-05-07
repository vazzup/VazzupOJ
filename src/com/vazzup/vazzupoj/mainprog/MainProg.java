package com.vazzup.vazzupoj.mainprog;

import com.vazzup.vazzupoj.job.*;
import java.util.*;

public class MainProg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PriorityQueue <Job> JobQueue = new PriorityQueue<Job>();
		
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
