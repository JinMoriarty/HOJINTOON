package com.toon.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.toon.domain.CategoryVO;
import com.toon.domain.ToonVO;


@Repository
public class AdminDAOImpl implements AdminDAO {

	@Inject
	private SqlSession sql;
	
	// 매퍼 
	private static String namespace = "com.toon.mappers.adminMapper";
	
	//카테고리
	@Override
	public List<CategoryVO> category() throws Exception{
		return sql.selectList(namespace + ".category");
	}

	// 작품 등록
	@Override
	public void register(ToonVO vo) throws Exception {
		sql.insert(namespace + ".register", vo);
	}
	
	
	// 작품 목록
	@Override
	public List<ToonVO> toonslist() throws Exception {
		return sql.selectList(namespace + ".toonslist");
	}
	/*
	//작품 조회
	@Override
	public ToonVo toonsView() throws Exception{
		return sql.selectOne(namespace+".toonsView");
	}*/
	
	//상세 작품 페이지 조회
	@Override
	public ToonVO ToonView(int toonNum) throws Exception {
		return sql.selectOne(namespace + ".ToonView", toonNum);
	}
	
	// 작품 수정
	@Override
	public void ToonModify(ToonVO vo) throws Exception {
		sql.update(namespace + ".ToonModify", vo);
	}
	
	// 작품 삭제
	@Override
	public void ToonDelete(int toonNum) throws Exception {
		sql.delete(namespace + ".ToonDelete", toonNum);
	}

} 