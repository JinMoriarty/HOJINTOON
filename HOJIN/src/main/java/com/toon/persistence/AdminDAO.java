package com.toon.persistence;

import java.util.List;

import com.toon.domain.CategoryVO;
import com.toon.domain.ToonVO;
//import com.toon.domain.ReplyListVO;

public interface AdminDAO { 
	
	//카테고리
	public List<CategoryVO> category() throws Exception;
	
	// 작품 등록
	public void register(ToonVO vo) throws Exception;
	
	// 작품 목록
	public List<ToonVO> toonslist() throws Exception;
	/*
	// 작품 조회
	public ToonVO toonView() throws Exception;*/
	
	// 상세 작품 페이지 조회
	public ToonVO ToonView(int toonNum) throws Exception;
	
	// 작품 수정
	public void ToonModify(ToonVO vo) throws Exception;
	
	// 작품 삭제
	public void ToonDelete(int toonNum) throws Exception;
} 