package com.test.springboot012;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot012CloseLogoApplication {

    /**
     * 关闭logo
     * @param args
     */
    public static void main(String[] args) {

        SpringApplication springApplication = new SpringApplication(Springboot012CloseLogoApplication.class);

        springApplication.setBannerMode(Banner.Mode.OFF);

        springApplication.run(args);


    }

}
