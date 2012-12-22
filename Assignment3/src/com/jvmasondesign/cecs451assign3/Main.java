package com.jvmasondesign.cecs451assign3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;


public class Main {
	public static final String INPUT_PATH = "data.txt";
	public static final String OUTPUT_PATH = "results.txt";
	
	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws IOException 
	{
		// Set the system output stream to be the output file
		System.setOut(new PrintStream(new FileOutputStream(OUTPUT_PATH)));
		
		// Read the file as a string
		String dataString = readFileAsString(INPUT_PATH);
		
		// Create the rocket tree
		RocketTree rocketTree = new RocketTree();
		
		// Split the input string into lines with each line being a different rocket attack
		String[] lines = dataString.split(System.getProperty("line.separator"));
		
		// Categorize the first 15,000 rockets
		for (int i = 0; i < 15000; i++) {
			String line = lines[i];
			String[] values = line.split(",");
			rocketTree.add(new Rocket(Double.parseDouble(values[0]), Double.parseDouble(values[1]), 
					Integer.parseInt(values[2]), Integer.parseInt(values[3]), Integer.parseInt(values[4]), Integer.parseInt(values[5])));
			System.out.println(line);
		}

		// Calculate the most probable hostile group for the final 1,000 rockets
		for (int i = 15000; i < 16000; i++) {
			String line = lines[i];
			String[] values = line.split(",");
			Rocket rocket = new Rocket(Double.parseDouble(values[0]), Double.parseDouble(values[1]), 
					Integer.parseInt(values[2]), Integer.parseInt(values[3]), Integer.parseInt(values[4]));
			int probableHostileGroup = rocketTree.getProbableHostileGroup(rocket);
			System.out.println(line.subSequence(0, line.length() - 1) + "," + probableHostileGroup);
		}
	}

	/**
	 * @param filePath
	 * @throws IOException 
	 */
	// Took this method Oct. 2012 from: http://stackoverflow.com/questions/4866746/read-file-as-string
	private static String readFileAsString(String filePath) throws IOException 
	{
		StringBuffer fileData = new StringBuffer(1000);
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		char[] buf = new char[1024];
		int numRead=0;
		while((numRead=reader.read(buf)) != -1){
			String readData = String.valueOf(buf, 0, numRead);
			fileData.append(readData);
			buf = new char[1024];
		}
		reader.close();
		return fileData.toString();
	}
}
