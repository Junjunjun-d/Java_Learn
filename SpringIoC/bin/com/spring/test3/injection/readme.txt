spring的中注入

1、 了解常见的属性注入： int, String,list,set,map,array,date的中注入

2、 什么是属性编辑器和其作用
	* 将spring配置文件中的字符串转换成相应的java对象
	* spring内置了一些属性编辑器，也可以自定义属性编辑器

3、如何自定义属性编辑器
	* 继承PropertyEditorSupport
	* 覆盖setAsText()方法
	* 将自定义的属性编辑器中注入到spring中
	
4、了解关于多配置文件的读取方式
	* 单个读取
	* 采用数组
 	* 采用*匹配：要求命名时必须有一定的规则

5、如何减少spring中的配置量
	* 通过<bean>标签将公共的配置文件提取出来，然后指定<bean>标签中的abstract的属性为true
	* 正在其他<bean>标签种植青其parent即可
	参考：applicationContext-common.xml

6、spring默认在创建BeanFactory时，将配置文件中所有的对象实例化并进行注入，但是可以使用相关属性延迟配置文件的初始化
	* default-lazy-init="true" 作用整个配置文件，一般不设置此属性，可以用来检查配置文件中是否有错误
	* lazy-init="true"  作用于单个<bean>标签 按需使用
 
















