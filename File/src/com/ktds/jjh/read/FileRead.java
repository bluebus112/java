package com.ktds.jjh.read;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	
	private static final String LOG_FOLDER_PATH = "D:\\logs";
	private static final String LOG_FILE_PATH = LOG_FOLDER_PATH + "\\calculator.log";
	
	public void start() {
		
		try {
			FileReader fr = new FileReader(LOG_FILE_PATH);
			BufferedReader br = new BufferedReader(fr);
			
			try {
//				String line =br.readLine();
//				System.out.println(line);
				
				String line = null;
				while (true) {
					line = br.readLine();
					
					if (line == null) {
						break;
						
					}
					System.out.println(line);
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new FileRead().start();
	}

}
