package com.hyun.app04.dao;

import java.util.List;

import com.hyun.app04.dto.BookDTO;

public interface BookDAO {
  List<BookDTO> getBookList();
  BookDTO getBookByNo(int bookNo);
  int insertBook(BookDTO book);
  int updateBook(BookDTO book);
  int deleteBook(int bookNo);
}