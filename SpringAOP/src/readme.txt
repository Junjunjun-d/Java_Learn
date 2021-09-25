AOP相关概念
	* Cross Cut Concern:是一种独立服务，它会遍布在系统的处理流程之中
	* Aspect: 对横切性关注点的模块化
	* Advice： 对横切性关注点的具体实现。分三类  before after  throw
	* Pointcut：它定义了Adcice应用到那些JoinPoint上，对Spring来说是方法的调用
*JoinPoint： Advice在鹰应用程序上则执行的点或时机，spring只支持方法的JoinPoint，这个点也可以使属性修改，如：Aspect可以支持
	* Weave：将Advice应用到Traget Object上的过程叫织入，Spring支持的是动态织入
	* Traget Object： Advice被应用的对象
	* Proxy： Spring AOP默认使用JDK的动态代理，它的代理是运行时创建的，也可以使用CGLIB代理
	* Introduction：可以动态的为类添加方法


spring对AOP的支持：采用annotation方式；使用配置文件实现
一、采用annotation方式
1. spring依赖包配置 SPRING_HOME = D:\学习\SSH-Spring\资料及源代码\资料\spring-framework-2.0
	* SPRING_HOME/dist/spring.jar
	* SPRING_HOME/lib/log4j/log4j-1.2.14.jar
	* SPRING_HOME/lib/jakarta-commons/commons-logging.jar
	* SPRING_HOME/lib/aspectj/*.jar

2. 将横切性广州住店模块化，并建立相关类：SecurityHandler，要使用注解

3. 采用注解指定SecurityHandler为Aspect

4. 采用注解定义Advice和Pointcut

5. 启用AspectJ对Annotation的支持，并将目标类和Aspect类配置到IoC容器中

6. 开发客户端



二、使用配置文件实现
1、具体配置：
<aop:config>
		<aop:aspect id = "securityAspect" ref = "securityHandler">
			<aop:pointcut id = "addAddMethod" expression="execution(* add*(..))"/>
			<aop:before method="checkSecurity" pointcut-ref="addAddMethod"/>
		</aop:aspect>
</aop:config>

2、表达式基本的语法
	* 匹配返回值
	* 匹配包
	* 匹配方法
	* 匹配参数
	参考：applicationContext-AOP2.xml


3、可以采用Advice中添加一个JoinPoint参数，取得客户端调用的方法名以及参数值


三、CGLIB
1、如果目标对象实现了接口，在默认情况下会采用JDK的动态代理实现AOP
2、如果目标对象实现了接口，也可以强制使用CGLIB生成代理实现AOP
3、如果目标对象没有实现了接口，那么必须引入CGLIB，spring会在JDK的动态代理和CGLIB代理之间切换


强制使用CGLIB生成代理实现AOP？ SPRING_HOME = D:\学习\SSH-Spring\资料及源代码\资料\spring-framework-2.0
	* 加入CGLIB库 ,SPRING_HOME/lib/cglib/cglib-nodep-2.1_3.jar
	* 加入如下配置，强制使用CGLIB代理
		<aop:aspectj-autoproxy proxy-target-class="true"/>

JDK动态代理和CGLIB代理的区别
	* JDK动态代理对实现了接口的类进行代理
	* CGLIB代理可以对类代理，主要对指定的类生成一个子类，因为是继承我们的目标最好不要使用final声明

