AOP��ظ���
	* Cross Cut Concern:��һ�ֶ�����������鲼��ϵͳ�Ĵ�������֮��
	* Aspect: �Ժ����Թ�ע���ģ�黯
	* Advice�� �Ժ����Թ�ע��ľ���ʵ�֡�������  before after  throw
	* Pointcut����������AdciceӦ�õ���ЩJoinPoint�ϣ���Spring��˵�Ƿ����ĵ���
*JoinPoint�� Advice��ӥӦ�ó�������ִ�еĵ��ʱ����springֻ֧�ַ�����JoinPoint�������Ҳ����ʹ�����޸ģ��磺Aspect����֧��
	* Weave����AdviceӦ�õ�Traget Object�ϵĹ��̽�֯�룬Spring֧�ֵ��Ƕ�̬֯��
	* Traget Object�� Advice��Ӧ�õĶ���
	* Proxy�� Spring AOPĬ��ʹ��JDK�Ķ�̬�������Ĵ���������ʱ�����ģ�Ҳ����ʹ��CGLIB����
	* Introduction�����Զ�̬��Ϊ����ӷ���


spring��AOP��֧�֣�����annotation��ʽ��ʹ�������ļ�ʵ��
һ������annotation��ʽ
1. spring���������� SPRING_HOME = D:\ѧϰ\SSH-Spring\���ϼ�Դ����\����\spring-framework-2.0
	* SPRING_HOME/dist/spring.jar
	* SPRING_HOME/lib/log4j/log4j-1.2.14.jar
	* SPRING_HOME/lib/jakarta-commons/commons-logging.jar
	* SPRING_HOME/lib/aspectj/*.jar

2. �������Թ���ס��ģ�黯������������ࣺSecurityHandler��Ҫʹ��ע��

3. ����ע��ָ��SecurityHandlerΪAspect

4. ����ע�ⶨ��Advice��Pointcut

5. ����AspectJ��Annotation��֧�֣�����Ŀ�����Aspect�����õ�IoC������

6. �����ͻ���



����ʹ�������ļ�ʵ��
1���������ã�
<aop:config>
		<aop:aspect id = "securityAspect" ref = "securityHandler">
			<aop:pointcut id = "addAddMethod" expression="execution(* add*(..))"/>
			<aop:before method="checkSecurity" pointcut-ref="addAddMethod"/>
		</aop:aspect>
</aop:config>

2�����ʽ�������﷨
	* ƥ�䷵��ֵ
	* ƥ���
	* ƥ�䷽��
	* ƥ�����
	�ο���applicationContext-AOP2.xml


3�����Բ���Advice�����һ��JoinPoint������ȡ�ÿͻ��˵��õķ������Լ�����ֵ


����CGLIB
1�����Ŀ�����ʵ���˽ӿڣ���Ĭ������»����JDK�Ķ�̬����ʵ��AOP
2�����Ŀ�����ʵ���˽ӿڣ�Ҳ����ǿ��ʹ��CGLIB���ɴ���ʵ��AOP
3�����Ŀ�����û��ʵ���˽ӿڣ���ô��������CGLIB��spring����JDK�Ķ�̬�����CGLIB����֮���л�


ǿ��ʹ��CGLIB���ɴ���ʵ��AOP�� SPRING_HOME = D:\ѧϰ\SSH-Spring\���ϼ�Դ����\����\spring-framework-2.0
	* ����CGLIB�� ,SPRING_HOME/lib/cglib/cglib-nodep-2.1_3.jar
	* �����������ã�ǿ��ʹ��CGLIB����
		<aop:aspectj-autoproxy proxy-target-class="true"/>

JDK��̬�����CGLIB���������
	* JDK��̬�����ʵ���˽ӿڵ�����д���
	* CGLIB������Զ��������Ҫ��ָ����������һ�����࣬��Ϊ�Ǽ̳����ǵ�Ŀ����ò�Ҫʹ��final����

