package com.ktds.jjh.explore;

import java.io.File;

public class FileSysteExplore3 {

	public void printFileSystem(String path) {

		// 1. File 객체 생성 (path정보를 가지는 파일을 만듬)
		File directory = new File(path);

		// 1-1. directory 안의 내용을 탐색한다.
		String[] contents = directory.list();
		File file = null;
		for (String content : contents) {
			// contest 와 directory의 경로를 결합해 새로운 file 객체를 생성한다.
			file = new File(directory.getAbsolutePath() + File.separator + content);
			if (file.isDirectory()) {
				// 2-1 폴더일 경우 폴더 내부를 탐색한다.
				printFileSystem(file.getAbsolutePath());

			} else {
				// 2-2 파일일 경우 파일의 경로를 출력한다.
				System.out.println(file.getAbsolutePath());
			}
		}

	}

}
