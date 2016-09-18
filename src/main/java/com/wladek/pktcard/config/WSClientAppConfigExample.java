package com.wladek.pktcard.config;

import com.concretepage.StudentClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * Created by wladek on 9/9/16.
 */
@Configuration
public class WSClientAppConfigExample {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.concretepage.wsdl");
        return marshaller;
    }
    @Bean
    public StudentClient studentClient(Jaxb2Marshaller marshaller) {
        StudentClient client = new StudentClient();
        client.setDefaultUri("http://localhost:8080/soapws/students.wsdl");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
