<?xml version="1.0" encoding="UTF-8"?>
<web-app version="2.5" 
	xmlns="http://java.sun.com/xml/ns/javaee" 
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
	xsi:schemaLocation="http://java.sun.com/xml/ns/javaee 
	http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd">
  <display-name></display-name>
  
  <context-param>
  	<param-name>encoding</param-name>
  	<param-value>gn2312</param-value>
  </context-param>
<!--   <servlet>
    <description>This is the description of my J2EE component</description>
    <display-name>This is the display name of my J2EE component</display-name>
    <servlet-name>WelcomeServlet</servlet-name>
    <servlet-class>sevlets.WelcomeServlet</servlet-class>
  </servlet>
 -->
  <servlet>
    <description>This is the description of my J2EE component</description>
    <display-name>This is the display name of my J2EE component</display-name>
    <servlet-name>DealWithServlet</servlet-name>
    <servlet-class>sevlets.DealWithServlet</servlet-class>
  </servlet>
  
 
  <filter>
  <filter-name>EncodingFilter</filter-name>
  <filter-class>filter.EncodingFilter</filter-class>
  </filter>
 



 <!--  <servlet-mapping>
    <servlet-name>WelcomeServlet</servlet-name>
    <url-pattern>/servlets/WelcomeServlet</url-pattern>
  </servlet-mapping>
  -->
  <servlet-mapping>
    <servlet-name>DealWithServlet</servlet-name>
    <url-pattern>/servlets/DealWithServlet</url-pattern>
  </servlet-mapping>
   
<filter-mapping>
	<filter-name>EncodingFilter</filter-name>
	<url-pattern>/*</url-pattern>
</filter-mapping>

  <welcome-file-list>
    <welcome-file>index.jsp</welcome-file>
  </welcome-file-list>
</web-app>
