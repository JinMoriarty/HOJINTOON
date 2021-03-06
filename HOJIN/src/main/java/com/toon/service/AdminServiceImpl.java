package com.toon.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.toon.domain.CategoryVO;
import com.toon.domain.ToonVO;
import com.toon.persistence.AdminDAO;
 
@Service
public class AdminServiceImpl implements AdminService {

	@Inject
	private AdminDAO dao;

	//카테고리
	@Override
	public List<CategoryVO> category() throws Exception{
		return dao.category();
	}
	
	// 작품 등록
	@Override
	public void register(ToonVO vo) throws Exception {
		dao.register(vo);		
	}
	
	// 상품목록
	@Override
	public List<ToonVO> toonslist() throws Exception {
		System.out.println("서비스");
		return dao.toonslist();
	}
	
	// 상세 작품 페이지 조회
	@Override
	public ToonVO ToonView(int toonNum) throws Exception {
		return dao.ToonView(toonNum);
	}
	
	// 작품 수정
	@Override
	public void ToonModify(ToonVO vo) throws Exception {
		dao.ToonModify(vo);
	}
	
	// 작품 수정
	@Override
	public void ToonDelete(int toonNum) throws Exception {
		dao.ToonDelete(toonNum);
	}
	
}