package com.hyun.app03.service;

import java.util.List;

import com.hyun.app03.dto.BbsDTO;

public interface BbsService {
  List<BbsDTO> getBbsList();
  BbsDTO getBbsByNo(int bbsNo);
}
