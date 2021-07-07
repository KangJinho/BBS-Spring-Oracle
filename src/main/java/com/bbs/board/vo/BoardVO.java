package com.bbs.board.vo;

import java.sql.Date;

public class BoardVO {
	private int no;
	private String title;
	private String write;
	private Date writeDate;
	private String hit;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWrite() {
		return write;
	}
	public void setWrite(String write) {
		this.write = write;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	public String getHit() {
		return hit;
	}
	public void setHit(String hit) {
		this.hit = hit;
	}
	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", title=" + title + ", write=" + write + ", writeDate="
				+ writeDate + ", hit=" + hit + "]";
	}
	
}

