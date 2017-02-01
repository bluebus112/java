package com.ktds.jjh.news;

import java.util.Scanner;

import com.ktds.jjh.news.biz.NewsBiz;
import com.ktds.jjh.news.biz.NewsBizImpl;

public class NewsController {

	public void start() {

		NewsBiz newsBiz = new NewsBizImpl();

		Scanner input = new Scanner(System.in);
		int chooseMenu = 0;

		while (true) {
			System.out.println("==========뉴스 조회============");
			System.out.println("1. 전체 뉴스 기사 제목 조회 ");
			System.out.println("2. 뉴스 기사 제목 추가 ");
			System.out.println("3. 종료 ");
			System.out.println("=============================");

			chooseMenu = input.nextInt();
			if (chooseMenu == 1) {
				newsBiz.queryAllNews();
			} else if (chooseMenu == 2) {
				newsBiz.addNewNews();
			} else {
				break;
			}

		}

	}

	public static void main(String[] args) {
		new NewsController().start();
	}

}
