package lzd.zju.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author:liuzidi
 * @Description 创建处理器对象，对象放在springMVC容器中，再类的上面
 * 能控制请求的都是控制器对象：如myController能处理请求，又称为后端控制器
 */
@Controller
public class MyController {
    /**
     * @RequestMapping 请求映射 作用为把一个地址和一个方法绑定在一起，再方法和类的上面
     * value = (some.do)必须唯一不重复
     * 类似于doPost和doGet
     * 返回值：ModelAndView
     * Model：数据，请求完成后，返回给用户的数据
     * View：视图 比如jsp
     */
    @RequestMapping(value = "some.do",method = RequestMethod.GET)
    public ModelAndView doSome(){
        //处理some.do请求
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","welcome to use springmvc dev");
        mv.addObject("fun","using doSome method");
        //指定视图，指定视图的完整路径,路径为WEB-INF下的相对路径
        //框架对视图进行forward操作，request.getRequestDispatcher("/show.jsp").forward(...)
        mv.setViewName("show");
        return mv;
    }
    @RequestMapping(value = "other.do",method = RequestMethod.POST)
    public ModelAndView doOther(){
        //处理some.do请求
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","Other msg");
        mv.addObject("fun","using doOther method");
        //指定视图，指定视图的完整路径,路径为WEB-INF下的相对路径
        //框架对视图进行forward操作，request.getRequestDispatcher("/show.jsp").forward(...)
        mv.setViewName("show");
        return mv;
    }

    @RequestMapping(value = "first.do")
    public ModelAndView doFirst(HttpServletRequest request, HttpServletResponse response,
                                HttpSession session){
        //处理some.do请求
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","first- msg:" + request.getParameter("name"));
        mv.addObject("fun","using doFirst method");
        //指定视图，指定视图的完整路径,路径为WEB-INF下的相对路径
        //框架对视图进行forward操作，request.getRequestDispatcher("/show.jsp").forward(...)
        mv.setViewName("show");
        return mv;
    }
    //组个接受请求参数 控制器方法的参数名必须和请求中的参数名一致
    @RequestMapping(value = "receiveProperty.do",method = RequestMethod.POST)
    public ModelAndView doReceiveProperty(String name, int age){
        //处理some.do请求
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        //指定视图，指定视图的完整路径,路径为WEB-INF下的相对路径
        //框架对视图进行forward操作，request.getRequestDispatcher("/show.jsp").forward(...)
        mv.setViewName("show");
        return mv;
    }

}
