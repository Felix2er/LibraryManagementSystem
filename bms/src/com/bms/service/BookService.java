package com.bms.service;

import java.util.List;

import com.bms.entity.Book;

public interface BookService {
	//添加书籍
	public int addBook(Book book);
	//删除书籍
	public int deleteBookById(int bid);
	//更新书籍
	public int updateBook(Book book);
	//查找书籍
	public Book queryById(int bid);
	//查找所有书籍
	public List<Book> queryAllBook();
}
