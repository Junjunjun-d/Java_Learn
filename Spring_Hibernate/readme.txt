spring��hibernate�ļ��У��������
1��openSession��getCurrentSession������
	* openSession����رգ�currentSession������������Զ��ر�
	* openSessionû�к͵�ǰ�̰߳󶨣�currentSession�͵�ǰ�̰߳�

2�� ���ʹ��currentSession��Ҫ��hibernate.cfg.xml�ļ��н������ã�
	* ����Ǳ�������jdbc����
		<property name="hibernate.current_session_context_class">thread</property>
	* �����ȫ������jta����
		<property name="hibernate.current_session_context_class">jta</property>

		
spring��hibernate�ļ��У���������ʽ����

1������ʽ��������
	* ����SessionFactory
	* �������������
	* ����Ĵ�������
	* ��Щ����Щ����ʹ������

2����дҵ���߼�����
	* �̳�HibernateDaoSupport�࣬ʹ��HibernateTemplate���־û���HibernateTemplate��
	  Hibernate Session����������װ
	* Ĭ��������������쳣�Ż�ع��������̳���RuntimeException���ࣩ����ͨ�쳣�ǲ������
	* ��дҵ���߼�����ʱ����ý��쳣һֱ�����׳����ڱ�ʾ�㣨struts������
	* ��������߽�����ã�ͨ�����õ�ҵ��㣬��Ҫ���ӵ�Dao��  

3���˽�����ļ��ִ�������
	1.	PROPAGATION_REQUIRED: �������һ��������֧�ֵ�ǰ�������û����������
	2.	PROPAGATION_SUPPORTS: �������һ������֧�ֵ�ǰ�������û��������������ִ��
	3.	PROPAGATION_MANDATORY: ����Ѿ�����һ������֧�ֵ�ǰ�������û��һ������������׳��쳣��
	4.	PROPAGATION_REQUIRES_NEW: ���ǿ���һ���µ��������һ�������Ѿ����ڣ���������ڵ��������
	5.	PROPAGATION_NOT_SUPPORTED: ���Ƿ������ִ�У��������κδ��ڵ�����
	6.	PROPAGATION_NEVER: ���Ƿ������ִ�У��������һ����������׳��쳣
	7.	PROPAGATION_NESTED�����һ�����������ڣ���������һ��Ƕ�׵�������. ���û�л����, 
	     ��TransactionDefinition.PROPAGATION_REQUIRED ����ִ��

4��Spring����ĸ��뼶��
	1.	ISOLATION_DEFAULT�� ����һ��PlatfromTransactionManagerĬ�ϵĸ��뼶��ʹ�����ݿ�Ĭ�ϵ�������뼶��.
	     �����ĸ���JDBC�ĸ��뼶�����Ӧ
	2.	ISOLATION_READ_UNCOMMITTED�� ����������͵ĸ��뼶������������һ��������Կ����������δ�ύ�����ݡ�
	     ���ָ��뼶����������������ظ����ͻ������
	3.	ISOLATION_READ_COMMITTED�� ��֤һ�������޸ĵ������ύ����ܱ�����һ�������ȡ������һ�������ܶ�ȡ������δ�ύ������
	4.	ISOLATION_REPEATABLE_READ�� ����������뼶����Է�ֹ����������ظ��������ǿ��ܳ��ֻ������
	     �����˱�֤һ�������ܶ�ȡ��һ������δ�ύ�������⣬����֤�˱���������������(�����ظ���)��
	5.	ISOLATION_SERIALIZABLE ���ǻ�����ߴ��۵�����ɿ���������뼶�����񱻴���Ϊ˳��ִ�С�
	     ���˷�ֹ����������ظ����⣬�������˻������		    		