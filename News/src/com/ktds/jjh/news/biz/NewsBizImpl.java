package com.ktds.jjh.news.biz;

import java.util.List;

import com.ktds.jjh.news.dao.NewsDao;
import com.ktds.jjh.news.dao.NewsDaoImpl;

public class NewsBizImpl implements NewsBiz {
	
	private NewsDao newsDao;
	
	public NewsBizImpl(){
		newsDao = new NewsDaoImpl();
	}
	

	@Override
	public void queryAllNews() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNewNews() {
		// TODO Auto-generated method stub
		
	}
	
	

}