package com.hyun.app03.dao;

import java.util.List;

import com.hyun.app03.dto.BlogDTO;

public interface BlogDAO {
  List<BlogDTO> getBlogList();
  BlogDTO getBlogByNo(int blogNo);
}
