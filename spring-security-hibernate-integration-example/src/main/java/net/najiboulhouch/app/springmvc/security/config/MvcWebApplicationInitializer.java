package net.najiboulhouch.app.springmvc.security.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 
 * @author NAJIB
 * @version 1.0
 */

public class MvcWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

  // Load database and spring security configuration
  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class[] { AppConfig.class, WebSecurityConfig.class };
  }

  // Load spring web configuration
  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class[] { WebConfig.class };
  }

  @Override
  protected String[] getServletMappings() {
    return new String[] { "/" };
  }

}
