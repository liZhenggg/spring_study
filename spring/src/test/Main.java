package test;

import main.java.com.lzg.bean.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {


    public static void main(String[] args) {

        // 原始方式
//        HelloWorld helloWorld = new HelloWorld();
//        helloWorld.setName("world");
//        helloWorld.sayHello();

//        // ClassPathXmlApplicationContext: 默认是项目的classpath路径下面(相当于是src目录下的路径)
//        ClassPathXmlApplicationContext content = new ClassPathXmlApplicationContext("main/resources/spring-config.xml");
//        HelloWorld helloworld = (HelloWorld) content.getBean("helloworld");
//        helloworld.setName("LiMing");
//        helloworld.sayHello();

//         FileSystemXmlApplicationContext: 默认是项目路径,默认文件路径是项目名下一级(与src同级)
        ApplicationContext content = new FileSystemXmlApplicationContext("src/main/resources/spring-config.xml");
        HelloWorld helloWorld = (HelloWorld) content.getBean("helloworld");
        helloWorld.setName("Lucie");
        helloWorld.sayHello();

    }
}
