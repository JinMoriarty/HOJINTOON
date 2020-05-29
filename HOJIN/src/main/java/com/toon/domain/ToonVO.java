package com.toon.domain;

import java.util.Date;

public class ToonVO {

	private String toonName;
	private String toonGenre;
	private int toonFin;
	private String toonImg;
	private String toonDes;
	private Date toonDate;
	
	public String getToonName() {
		return toonName;
	}
	public void setToonName(String toonName) {
		this.toonName = toonName;
	}
	public String getToonGenre() {
		return toonGenre;
	}
	public void setToonGenre(String toonGenre) {
		this.toonGenre = toonGenre;
	}
	public int getToonFin() {
		return toonFin;
	}
	public void setToonFin(int toonFin) {
		this.toonFin = toonFin;
	}
	public String getToonImg() {
		return toonImg;
	}
	public void setToonImg(String toonImg) {
		this.toonImg = toonImg;
	}
	public String getToonDes() {
		return toonDes;
	}
	public void setToonDes(String toonDes) {
		this.toonDes = toonDes;
	}
	public Date getToonDate() {
		return toonDate;
	}
	public void setToonDate(Date toonDate) {
		this.toonDate = toonDate;
	}
}
