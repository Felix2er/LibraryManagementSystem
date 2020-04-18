package com.bms.service;

import java.util.List;

import com.bms.entity.Book;

public interface BookService {
	//����鼮
	public int addBook(Book book);
	//ɾ���鼮
	public int deleteBookById(int bid);
	//�����鼮
	public int updateBook(Book book);
	//�����鼮
	public Book queryById(int bid);
	//���������鼮
	public List<Book> queryAllBook();
}
