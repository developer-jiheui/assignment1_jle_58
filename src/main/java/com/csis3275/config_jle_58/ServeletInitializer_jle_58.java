package com.csis3275.config_jle_58;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ServeletInitializer_jle_58 implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext container) throws ServletException {
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(SpringMVCConfig_jle_58.class);
		ctx.setServletContext(container);
		
		ServletRegistration.Dynamic servelet = container.addServlet("dispatcher", new DispatcherServlet(ctx));
		servelet.setLoadOnStartup(1);
		servelet.addMapping("/");
		
	}

}
