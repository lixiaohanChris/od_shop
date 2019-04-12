package com.od.shop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.od.shop.interceptor.LoginInterceptor;
import com.od.shop.interceptor.OtherInterceptor;

@Configuration
class WebMvcConfigurer extends WebMvcConfigurerAdapter{
    @Bean
    public OtherInterceptor getOtherIntercepter() {
        return new OtherInterceptor();
    }
    @Bean
    public LoginInterceptor getLoginIntercepter() {
        return new LoginInterceptor();
    }
     
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(getOtherIntercepter())
        .addPathPatterns("/**");
        registry.addInterceptor(getLoginIntercepter())
        .addPathPatterns("/**");        
    }
}
