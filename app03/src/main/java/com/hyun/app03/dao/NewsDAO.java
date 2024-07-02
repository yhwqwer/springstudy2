package com.hyun.app03.dao;

import java.util.List;

import com.hyun.app03.dto.BlogDTO;
import com.hyun.app03.dto.NewsDTO;

public interface NewsDAO {
  List<NewsDTO> getNewsList();
  
}
