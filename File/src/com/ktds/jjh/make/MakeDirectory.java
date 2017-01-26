package com.ktds.jjh.make;

import java.io.File;


public class MakeDirectory {
	
	public void start() {
		
		String DirectoryPath = "d:\\Languages";
		
		// 폴더 만들기
		File game = new File(DirectoryPath);
		
		game.mkdirs();
		
	}
	
	public static void main(String[] args) {
		new MakeDirectory().start();
	}

}
