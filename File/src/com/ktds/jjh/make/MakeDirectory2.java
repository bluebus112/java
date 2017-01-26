package com.ktds.jjh.make;

import java.io.File;


public class MakeDirectory2 {
	
	public void start() {
		
		String DirectoryPath = "d:\\game\\poketmon";
		
		// 폴더 만들기
		File game = new File(DirectoryPath);
		// 폴더를 생성한다.
		if( !game.exists() ) {
			game.mkdirs();	
		}
		
		
	}
	
	public static void main(String[] args) {
		new MakeDirectory2().start();
	}

}
