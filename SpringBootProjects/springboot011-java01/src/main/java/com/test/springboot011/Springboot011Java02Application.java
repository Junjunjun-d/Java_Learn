package com.test.springboot011;

import com.test.springboot011.service.StudentService;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot011Java02Application {


    public static void main(String[] args) {


        //关闭启动logo的输出
//        SpringApplication springApplication = new SpringApplication(Springboot011Java02Application.class);
//        springApplication.setBannerMode(Banner.Mode.OFF);
//        springApplication.run(args);

        /**
         * Springboot程序启动后,返回值是ConfigurableApplicationContext,它也是一个Spring容器
         * 它其实相当于原来Spring容器中启动容器ClasspathXmlApplicationContext
         */

        //SpringApplication.run(Springboot011Java02Application.class, args);

        //获取Springboot容器
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot011Java02Application.class, args);

        //从spring容器中获取指定bean对象
        StudentService studentService = (StudentService) applicationContext.getBean("studentServiceImpl");

        //调用业务方法
        String sayHello = studentService.sayHello();

        System.out.println(sayHello);
    }

}
