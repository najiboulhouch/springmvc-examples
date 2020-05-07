/**
 * 
 */
package net.najiboulhouch.app.springmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author NAJIB
 * @version 1.0 
 */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {
				AppContext.class
		};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {
				WebMvcConfig.class
		};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {
				"/"
		};
	}

}
