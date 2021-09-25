1. spring依赖包配置 SPRING_HOME = D:\学习\SSH-Spring\资料及源代码\资料\spring-framework-2.0
	* SPRING_HOME/dist/spring.jar
	* SPRING_HOME/lib/log4j/log4j-1.2.14.jar
	* SPRING_HOME/lib/jakarta-commons/commons-logging.jar
	
	
	步骤：window-preferences-java-Build Path-user libraries-add(新建文件夹)-导入外部包
		把需要的jar包导入到user library中的一个spring文件夹中，之后需要在项目中导入
	
2. 提供spring配置文件 applicationContext.xml
	* SPRING_HOME/samples/jpetstore/war/WEB-INF/applicationContext.xml

3. 提供spring配置文件  log4j.properties
	* SPRING_HOME/samples/jpetstore/war/WEB-INF/log4j.properties

4. 在UserManager中提供构造函数，让spring将UserDao实现注入（DI）过来

5. 让spring管理我们对象的创建和依赖，必须将依赖关系配置到spring的核心配置文件(applicationContext.xml)中

6. 编写客户端


总结：
1. IoC(控制反转)：本来是由应用程序管理的对象之间的依赖关系，现在交给了spring容器管理，这就叫控制值反转，即交给了IoC容器，
 	spring的IoC容器主要使用DI(依赖注入)方式实现。不需要主动查找，对象的查找、定位和创建全部由容器管理
	
2. 大量减少了Factory（工厂）和Singleton（单例模式）的数量，是代码层次更加清晰，主要原因是我们不在查找、定位、创建和管理对象
	之间的依赖关系了，都交给IoC容器去管理
	
3. spring的IoC容器是一个轻量级的容器，没有侵入性，不需要依赖容器的API,也不需要实现一些特殊的接口

4. 一个合理的设计这种最好尽量避免侵入性

5. 会使我们的框架工作的更好

6. 提供了AOP声明式服务能力，可以针对POJO对象提供声明式服务能力，如声明式事务
 
7. 对于资源，如Hibernate Session或JDBC Connetion 我们不在负责开启和关闭

8. 鼓励了我们面向接口编程

9. 减少代码中的耦合（解耦合），将耦合推迟到了配置文件中，发生了变化也更容易控制









	
	

	
