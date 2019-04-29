package HW_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
     //   ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        Client client=context.getBean("client",Client.class);
        client.goToDoctor();


       // Receptionist reception = new Receptionist();
       // ClientImpl client = reception.toDoctor();

        //client.setDoctor(new Surgeon());
        //client.goToDoctor();
    }
}
