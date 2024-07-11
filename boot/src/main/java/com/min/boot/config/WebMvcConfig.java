package com.min.boot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.min.boot.interceptor.SigninCheck;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    
    /* 정적 자원 관리
     *    정적 자원의 주소와 매핑된 디렉터리 명시 */
    
    registry.addResourceHandler("/static/**")         // static 으로 시작하는 모든 경로
      .addResourceLocations("classpath:/static/");    // src/main/resources/static 디렉터리
    
  }
  
  private final SigninCheck signinCheck = new SigninCheck();
  private final SigninCheck signoutCheck = new SigninCheck();
  
  
  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    
    /* 인터셉터
     *     특정 요청을 처리할 때 자동으로 동작 */
    
    
    registry.addInterceptor(signinCheck)
      .addPathPatterns("/bbs/write.page", "", "");  
    
    
    registry.addInterceptor(signoutCheck)
    .addPathPatterns("/bbs/write.page", "", "");  
  
    
  }
  
  
  
}
