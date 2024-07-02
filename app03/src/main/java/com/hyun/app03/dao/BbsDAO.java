package com.hyun.app03.dao;

import java.util.List;

import com.hyun.app03.dto.BbsDTO;

public interface BbsDAO { 
  List<BbsDTO> getBbsList();    // 본문이 없는 추상 메소드, 완성되지 않아서 객체로 만들지 못함
  BbsDTO getBbsByNo(int bbsNo); // 인터페이스는 객체 생성이 안된다
  
  
}
