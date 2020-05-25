package com.prashant.lambdaservicerequestor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.prashant.lambdaservicerequestor")
public class LambdaservicerequestorApplication {

  public static void main(String[] args) {
    SpringApplication.run(LambdaservicerequestorApplication.class, args);
  }

  @Bean
  LoginFunction login() {
    return new LoginFunction();
  }

}
