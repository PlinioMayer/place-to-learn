/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.placetolearn;

import com.placetolearn.service.HelloWorldService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("pesadelo.xml");
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorldService helloWorldService = context.getBean("helloWorldService", HelloWorldService.class);
        helloWorldService.sayTheWords();
    }
}
