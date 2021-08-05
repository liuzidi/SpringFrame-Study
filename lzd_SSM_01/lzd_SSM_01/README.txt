SSM整合开发：Spring + SpringMVC + Mybatis
Spring:业务层，管理service，dao，工具类等各种对象
SpringMVC:视图层，接受请求，返回显示结果
Mybatis:持久层，DAO对象

过程：
用户发起请求 --- SpringMVC接受请求 --- Spring中的service对象 --- Mybatis访问数据库处理数据

SSM的两个容器
1.Spring容器：管理service,DAO，Util对象
2.SpringMVC容器：管理Controller控制器对象

SpringMVC配置文件中有web用的对象
Spring配置文件中有service，dao，util对象
由于SpringMVC为Spring容器的子容器，可以访问Spring中的service，dao，util对象

注解为主，配置文件为辅。

实现步骤：
0.使用springdb的mysql库，表使用student
1.新建maven web项目
2.加入依赖
springmvc，spring，mybatis
jackson,mysql驱动，druid连接池
jsp,servlet依赖

3.写web.xml
1)注册DispatcherServlet
目的 3.1.创建springMVC容器对象，才能创建Controller类对象
    3.2.创建servlet，才能接受用户的请求

2)注册spring的监听器contextLoaderListener 目的 创建spring容器对象，才能创建service,dao等对象

3)注册字符集过滤器，解决post请求乱码的问题

4.创建包，Controller包，servicer，dao包实体类包创建好

5.写SpringMVC，Spring，Mybatis的主配置文件和数据库的配置属性文件

6.写代码，dao接口和mapper文件，service和实现类，controller，实体类

7.写jsp页面