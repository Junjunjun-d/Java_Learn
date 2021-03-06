spring和hibernate的集承（编程事务）
1、openSession和getCurrentSession的区别
	* openSession必须关闭，currentSession在事务结束后自动关闭
	* openSession没有和当前线程绑定，currentSession和当前线程绑定

2、 如果使用currentSession需要在hibernate.cfg.xml文件中进行配置：
	* 如果是本地事务（jdbc事务）
		<property name="hibernate.current_session_context_class">thread</property>
	* 如果是全局事务（jta事务）
		<property name="hibernate.current_session_context_class">jta</property>

		
spring和hibernate的集承（采用声明式事务）

1、声明式事务配置
	* 配置SessionFactory
	* 配置事务管理器
	* 事务的传播特性
	* 那些类那些方法使用事务

2、编写业务逻辑方法
	* 继承HibernateDaoSupport类，使用HibernateTemplate来持久化，HibernateTemplate是
	  Hibernate Session的轻量级封装
	* 默认情况下运行期异常才会回滚（包括继承了RuntimeException子类），普通异常是不会滚的
	* 编写业务逻辑方法时，最好将异常一直向上抛出，在表示层（struts）处理
	* 关于事务边界的设置，通常设置到业务层，不要添加到Dao上  

3、了解事务的几种传播特性
	1.	PROPAGATION_REQUIRED: 如果存在一个事务，则支持当前事务。如果没有事务则开启
	2.	PROPAGATION_SUPPORTS: 如果存在一个事务，支持当前事务。如果没有事务，则非事务的执行
	3.	PROPAGATION_MANDATORY: 如果已经存在一个事务，支持当前事务。如果没有一个活动的事务，则抛出异常。
	4.	PROPAGATION_REQUIRES_NEW: 总是开启一个新的事务。如果一个事务已经存在，则将这个存在的事务挂起。
	5.	PROPAGATION_NOT_SUPPORTED: 总是非事务地执行，并挂起任何存在的事务。
	6.	PROPAGATION_NEVER: 总是非事务地执行，如果存在一个活动事务，则抛出异常
	7.	PROPAGATION_NESTED：如果一个活动的事务存在，则运行在一个嵌套的事务中. 如果没有活动事务, 
	     则按TransactionDefinition.PROPAGATION_REQUIRED 属性执行

4、Spring事务的隔离级别
	1.	ISOLATION_DEFAULT： 这是一个PlatfromTransactionManager默认的隔离级别，使用数据库默认的事务隔离级别.
	     另外四个与JDBC的隔离级别相对应
	2.	ISOLATION_READ_UNCOMMITTED： 这是事务最低的隔离级别，它充许令外一个事务可以看到这个事务未提交的数据。
	     这种隔离级别会产生脏读，不可重复读和幻像读。
	3.	ISOLATION_READ_COMMITTED： 保证一个事务修改的数据提交后才能被另外一个事务读取。另外一个事务不能读取该事务未提交的数据
	4.	ISOLATION_REPEATABLE_READ： 这种事务隔离级别可以防止脏读，不可重复读。但是可能出现幻像读。
	     它除了保证一个事务不能读取另一个事务未提交的数据外，还保证了避免下面的情况产生(不可重复读)。
	5.	ISOLATION_SERIALIZABLE 这是花费最高代价但是最可靠的事务隔离级别。事务被处理为顺序执行。
	     除了防止脏读，不可重复读外，还避免了幻像读。		    		