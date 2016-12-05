package com.phoenix.hiddenplace.service;

import java.util.List;

import com.phoenix.hiddenplace.domain.MyHiddenPlace;
import com.phoenix.hiddenplace.domain.PageMaker;

public interface MyHiddenPlaceService {

	public void insert(MyHiddenPlace domain)throws Exception;

	List<MyHiddenPlace> list(PageMaker pageMaker) throws Exception; //내알못 목록
	
	List<MyHiddenPlace> bestMHP() throws Exception; //내알못 베스트 3
	
	int listCount(PageMaker pageMaker) throws Exception;
	
}
