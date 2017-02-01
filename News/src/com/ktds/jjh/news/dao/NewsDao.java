package com.ktds.jjh.news.dao;

import java.util.List;

import com.ktds.jjh.news.vo.NewsVO;

public interface NewsDao {
	
	public List<NewsVO> queryAllNews();
	
	public void newNews(NewsVO newNews);

}
