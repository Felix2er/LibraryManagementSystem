package com.bms.entity;

public class Book {
	private String bid;//书籍编号
	private String bookname;//书籍名称
	private String kind;//书籍种类
	private int num;//书籍库存量
	
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book[bid="+ this.bid + ",bookname=" + this.bookname + ",kind=" 
				+ this.kind + ",num=" + this.num +"]";
	}
}
