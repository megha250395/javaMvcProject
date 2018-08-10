package com.spring;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class JlcApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	protected Class<?>[] getRootConfigClasses() {
		System.out.println(" getRootConfigClasses()");
	return new Class[]{JlcConfig.class};
	}
	
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Class<?>[] getServletConfigClasses()");
		return new Class[]{JlcConfig.class};
	}

	protected String[] getServletMappings() {
		System.out.println("**getServletMappings");
		return new String[]{"*.jlc"};
	}

}
