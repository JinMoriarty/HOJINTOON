package com.toon.domain;

import java.util.Date;

public class IntoonVO {
	/*
	create table TBL_INTOON (
    INTOON_LIST       number          not null,
    INTOON_TITLE varchar2(50)    null,
    INTOON_NUM     number    not null,
    INTOON_IMG varchar2(50)    null,
    INTOON_GOOD     number    not null,
    INTOON_DAY     date        default sysdate,
    INTOON_LOOK     number    not null,
    INTOON_CASH     number    not null,
    INTOON_CONTENT varchar2(50)    null,
    INTOON_EXPLAIN varchar2(50)    null,
    primary key(INTOON_LIST),
    foreign key(INTOON_TITLE) references TBL_TOON(TOONNAME)
	);
	*/
	
	private int intoonList;
	private String intoonTite;
	private int intoonNum;
	private String intoonImg;
	private int intoonGood;
	private Date intoonDay;
	private int intoonLook;
	private int intoonCash;
	private String intoonContent;
	private String intoonExplain;
	
	
	public int getIntoonList() {
		return intoonList;
	}
	public void setIntoonList(int intoonList) {
		this.intoonList = intoonList;
	}
	public String getIntoonTite() {
		return intoonTite;
	}
	public void setIntoonTite(String intoonTite) {
		this.intoonTite = intoonTite;
	}
	public int getIntoonNum() {
		return intoonNum;
	}
	public void setIntoonNum(int intoonNum) {
		this.intoonNum = intoonNum;
	}
	public String getIntoonImg() {
		return intoonImg;
	}
	public void setIntoonImg(String intoonImg) {
		this.intoonImg = intoonImg;
	}
	public int getIntoonGood() {
		return intoonGood;
	}
	public void setIntoonGood(int intoonGood) {
		this.intoonGood = intoonGood;
	}
	public Date getIntoonDay() {
		return intoonDay;
	}
	public void setIntoonDay(Date intoonDay) {
		this.intoonDay = intoonDay;
	}
	public int getIntoonLook() {
		return intoonLook;
	}
	public void setIntoonLook(int intoonLook) {
		this.intoonLook = intoonLook;
	}
	public int getIntoonCash() {
		return intoonCash;
	}
	public void setIntoonCash(int intoonCash) {
		this.intoonCash = intoonCash;
	}
	public String getIntoonContent() {
		return intoonContent;
	}
	public void setIntoonContent(String intoonContent) {
		this.intoonContent = intoonContent;
	}
	public String getIntoonExplain() {
		return intoonExplain;
	}
	public void setIntoonExplain(String intoonExplain) {
		this.intoonExplain = intoonExplain;
	}
	
}
