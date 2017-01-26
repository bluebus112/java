package com.ktds.jjh.test;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		String folderPath = "d:\\Languages";

		// folderPath 경로를 읽어 온다.
		File languagesFolder = new File(folderPath);

		// languagesFolder의 경로가 폴더 (디렉토리)인지 파일인지 구분한다.
		if (languagesFolder.isDirectory()) {
			// System.out.println(folderPath + "는 폴더(디렉토리)입니다.");
			System.out.println(languagesFolder.getAbsolutePath() + "는 폴더(디렉토리)입니다.");
		} else {
			System.out.println(folderPath + "");
		}

		File javaFolder = new File(languagesFolder.getAbsolutePath() + File.separator + "Java");

		if (javaFolder.isDirectory()) {
			System.out.println(javaFolder.getAbsolutePath() + "는 폴더(디렉토리)입니다");

		} else {
			System.out.println(javaFolder.getAbsolutePath() + "는 파일입니다.");

		}

		// javaFolder 안에 있는 내용물들을 가져온다.
		String[] contents = javaFolder.list();
		for (String content : contents) {
			System.out.println(content);
		}

	}

}
