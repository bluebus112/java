package com.ktds.jjh.news.biz;

import java.util.List;
import java.util.Scanner;

import com.ktds.jjh.news.dao.NewsDao;
import com.ktds.jjh.news.dao.NewsDaoImpl;
import com.ktds.jjh.news.vo.NewsVO;

public class NewsBizImpl implements NewsBiz {
	
	private NewsDao newsDao;
	
	public NewsBizImpl(){
		newsDao = new NewsDaoImpl();
	}

	@Override
	public void queryAllNews() {
		List<NewsVO> newsList = newsDao.queryAllNews();
		for( NewsVO news : newsList ) {
			System.out.printf("뉴스 제목 : %s \n", news.getNews());
		}
	}
	
	@Override
	public void addNewNews() {

		Scanner input = new Scanner(System.in);
		
		System.out.println("기사를 입력해 주세요.");
		String news = input.next();
		
		NewsVO newsVO = new NewsVO();
		newsVO.setNews(news);
		
		newsDao.newNews(newsVO);
		
	
		
	}


}