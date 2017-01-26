package com.ktds.jjh.write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.Buffer;

public class FileWrite2 {

	public void start() {

		String filePath = "d://makeFile.txt";

		try {
			// 파일에 데이터를 작성할 수 있도록 지원해주는 클래스
			// FileWriter fileWriter = new FileWriter(filePath, true);

			// 메모리에 있는 내용을 손실시키지 않고 파일에 쓰도록 지원해주는 클래스
			// 메모리의 데이터를 FileWriter에게 전달해주는 역할
			// BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			// 작성하셔는 데이터를 메모리에 적절히 적재 시킬 수 있도록 지원해주는 클래스
			// 데이터를 BufferedWriter에게 전달해주는 역할
			PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(filePath, true)));

			printWriter.println("파일에 .. 작성합니다.");

			// 항상 close를 해야하고. 만든 순서에 역순으로 close를 한다.
			// 이유는 메모리 rick 을 예방하기위해여 - 메모리 손실되는 현상을 예방.
			printWriter.close();
			// bufferedWriter.close();
			// fileWriter.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		new FileWrite2().start();

	}

}
