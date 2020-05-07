package net.najiboulhouch.app.springmvc.security.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 
 * @author NAJIB
 * @version 1.0
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "net.najiboulhouch.app.springmvc.security.controller" })
public class WebConfig implements WebMvcConfigurer {
  
	@Override
  public void configureViewResolvers(ViewResolverRegistry registry) {
    registry.jsp().prefix("/WEB-INF/views/").suffix(".jsp");
  }

  @Override
  public void addViewControllers(ViewControllerRegistry registry) {
    registry.addViewController("/login").setViewName("login");
  }
}
