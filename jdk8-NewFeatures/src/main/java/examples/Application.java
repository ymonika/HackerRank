package examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application-context.xml");
        System.out.println(applicationContext.getBean("foo"));
        System.out.println(applicationContext.getBean("bar"));
        System.out.println(applicationContext.getBean("bar1"));

    }
}
