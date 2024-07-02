package com.min.app06.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.min.app06.dto.ContactDTO;
import com.min.app06.service.ContactService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ContactController {

  private ContactService contactService;

  @Autowired
  public ContactController(ContactService contactService) {
    super();
    this.contactService = contactService;
  }
  
  @GetMapping(value = "/list.do") // Main 에서 Get 요청 값이 list 로 들어오면 실행 (<a href="/app06/list">)
  public String list(Model model) { // Model 객체를 매개변수로 받고 JSP (view) 로 전달
    model.addAttribute("contactList", contactService.getContactList());
    // forward 이동, contactList(연락처목록) 을 가져오고 Model 객체에 추가함
    return "contact/list";  // 결과를 보여 줄 JSP 경로
  }
  
  @GetMapping(value = "/write.do")
  public String write() {
    return "contact/write";
  }
  
  // 파라미터 받는 방법(HttpServletRequest, @RequestParam, 커맨드 객체)
  @PostMapping(value = "/add.do")
  public String add(ContactDTO contact) {
    int result = contactService.registerContact(contact);
    String redirectURL = result == 1 ? "/list.do" : "/write.do";
    return "redirect:" + redirectURL;
  }
  
  // 파라미터 받는 방법(HttpServletRequest, @RequestParam, 커맨드 객체)
  @GetMapping(value = "/detail.do")
  public String detail(HttpServletRequest request, Model model) {
    int contactNo = Integer.parseInt(request.getParameter("contactNo"));
    model.addAttribute("contact", contactService.getContactByNo(contactNo));
    return "contact/detail";
  }
  
  
  
  
  
  
  
  
  

}