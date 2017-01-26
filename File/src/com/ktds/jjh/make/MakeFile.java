package com.ktds.jjh.make;

import java.io.File;
import java.io.IOException;

public class MakeFile {
	
	public void start() {
		
		String filePath = "d:\\Languages.txt";
		
		File textFile = new File(filePath);
		try {
			// 파일을 실제 저장소에 생성한다.
			if(!textFile.exists()) {
			textFile.createNewFile();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new MakeFile().start();
	}

}
