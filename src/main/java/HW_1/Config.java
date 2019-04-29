package HW_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("HW_1")
public class Config {
    @Bean(name="client")
    public Client client(Doctor doctor){
        Client client=new ClientImpl();
        ((ClientImpl) client).setDoctor(doctor);
        return client;
    }
}
