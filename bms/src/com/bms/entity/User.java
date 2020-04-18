package com.bms.entity;

public class User {
	private int uid;//�û����
	private String username;//�û���
	private String password;//����
	private String sex;//�Ա�
	private String email;//����
	private int booknum;//��������
	private String type;//�������
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getBooknum() {
		return booknum;
	}
	public void setBooknum(int booknum) {
		this.booknum = booknum;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "User[uid="+this.uid+",username="+this.username+",password="+this.sex+",email="
				+this.email+",booknum="+this.booknum+",type="+this.type+"]";
	}
}