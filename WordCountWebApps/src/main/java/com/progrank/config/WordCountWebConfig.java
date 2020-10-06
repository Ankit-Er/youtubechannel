package com.progrank.config;

/*
 * import javax.servlet.ServletContext; import javax.servlet.ServletException;
 * import javax.servlet.ServletRegistration;
 * 
 * import org.springframework.web.WebApplicationInitializer; import
 * org.springframework.web.context.support.
 * AnnotationConfigWebApplicationContext; import
 * org.springframework.web.context.support.XmlWebApplicationContext; import
 * org.springframework.web.servlet.DispatcherServlet;
 * 
 * public class WordCountWebConfig implements WebApplicationInitializer {
 * 
 * @Override public void onStartup(ServletContext servletContext) throws
 * ServletException {
 * 
 * AnnotationConfigWebApplicationContext wac = new
 * AnnotationConfigWebApplicationContext();
 * wac.register(SpringApplicationConfig.class);
 * 
 * 
 * XmlWebApplicationContext webAC = new XmlWebApplicationContext();
 * webAC.setConfigLocation("classpath:appconfig.xml");
 * 
 * 
 * //Create DS DispatcherServlet ds = new DispatcherServlet(wac);
 * 
 * //register DS ServletRegistration.Dynamic servlet =
 * servletContext.addServlet("MyDS", ds);
 * 
 * servlet.setLoadOnStartup(1); servlet.addMapping("/wordcount.com/*"); }
 * 
 * 
 * }
 */