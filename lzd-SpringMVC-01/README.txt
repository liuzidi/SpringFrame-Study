Spring MVC 请求响应的流程：
1.网页发起some.do的请求----->tomcat服务器接收
2.tomcat服务器根据(web.xml---url-pattern--- *.do请求需要给DispatcherServlet)
3.DispatcherServlet----根据Springmvc.xml配置了解到了---some.do-->doSome()的映射
4.DispatcherServlet----把some.do转发给了MyController.doSome()方法
5.框架执行doSome()把得到的ModelAndView进行处理，转发给show.jsp

