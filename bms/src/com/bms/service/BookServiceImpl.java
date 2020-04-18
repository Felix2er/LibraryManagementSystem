package com.bms.service;

import java.util.List;

import com.bms.dao.BookMapper;
import com.bms.entity.Book;

public class BookServiceImpl implements BookService {
	//serviceµ÷dao²ã£º×éºÏDao
	private BookMapper bookMapper;
	public void setBookMapper(BookMapper bookMapper) {
		this.bookMapper = bookMapper;
	}

	@Override
	public int addBook(Book book) {
		// TODO Auto-generated method stub
		return bookMapper.addBook(book);
	}

	@Override
	public int deleteBookById(int bid) {
		// TODO Auto-generated method stub
		return bookMapper.deleteBookById(bid);
	}

	@Override
	public int updateBook(Book book) {
		// TODO Auto-generated method stub
		return bookMapper.updateBook(book);
	}

	@Override
	public Book queryById(int bid) {
		// TODO Auto-generated method stub
		return bookMapper.queryById(bid);
	}

	@Override
	public List<Book> queryAllBook() {
		// TODO Auto-generated method stub
		return bookMapper.queryAllBook();
	}

}
