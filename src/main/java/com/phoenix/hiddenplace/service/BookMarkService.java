package com.phoenix.hiddenplace.service;

import com.phoenix.hiddenplace.domain.MyHiddenPlace;

public interface BookMarkService {


	// 북마크 선택삭제
	public void bookMarkDelete(String nums) throws Exception;

	// 즐겨찾기 등록
	public void bookmarkInsert(MyHiddenPlace myHiddenPlace) throws Exception;
	
}