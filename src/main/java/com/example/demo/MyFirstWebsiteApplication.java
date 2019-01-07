package com.example.demo;

import javax.servlet.Filter;
import javax.servlet.Servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.example.controller.CartServlet;
import com.example.controller.CheckOutServlet;
import com.example.controller.LoginFilter;
import com.example.controller.LoginServlet;

@SpringBootApplication
public class MyFirstWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstWebsiteApplication.class, args);
	}
	@Bean
	public ServletRegistrationBean<Servlet> adminServletRegistrationBean() {
	return new ServletRegistrationBean(new LoginServlet(), "/auth"); // add your servlet details here , example : login sevlet and url pattern
	}
	@Bean
	public FilterRegistrationBean<Filter> loggingFilter(){
	FilterRegistrationBean<Filter> loginBean = new FilterRegistrationBean<>();
	loginBean .setFilter(new LoginFilter()); // add your filter class here
	loginBean.addUrlPatterns("/*"); // add the filter for url pattern here
	return loginBean;
	}
	@Bean
	public ServletRegistrationBean<Servlet> checkoutBean(){
		return new ServletRegistrationBean(new CheckOutServlet(), "/checkout");
	}
	@Bean
	public ServletRegistrationBean<Servlet> cartBean(){
		return new ServletRegistrationBean(new CartServlet(), "/cart");
	}

}

