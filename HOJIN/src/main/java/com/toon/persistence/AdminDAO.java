package com.toon.persistence;

import com.toon.domain.MemberVO;

import java.util.List;

import com.toon.domain.ToonVO;
//import com.toon.domain.ReplyListVO;

public interface AdminDAO {
	
	
	
	// 작품 등록
	public void register(ToonVO vo) throws Exception;
	
	/*
	// 상품목록
	public List<GoodsViewVO> goodslist() throws Exception;
	 
	// 상품조회  + 카테고리 조인
	public GoodsViewVO goodsView(int gdsNum) throws Exception;
	
	// 상품 수정
	public void goodsModify(GoodsVO vo) throws Exception;
	
	// 상품 삭제
	public void goodsDelete(int gdsNum) throws Exception;
	
	// 주문 목록
	public List<OrderVO> orderList() throws Exception;
	
	// 특정 주문 목록
	public List<OrderListVO> orderView(OrderVO order) throws Exception;
	
	// 배송 상태
	public void delivery(OrderVO order) throws Exception;

	// 상품 수량 조절
	public void changeStock(GoodsVO goods) throws Exception;
	
	// 모든 소감(댓글)
	public List<ReplyListVO> allReply() throws Exception;
	
	// 소감(댓글) 삭제
	public void deleteReply(int repNum) throws Exception;
	*/
} 