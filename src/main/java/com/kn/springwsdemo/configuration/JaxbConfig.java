package com.kn.springwsdemo.configuration;

import com.kn.springwsdemo.integration.SoapClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class JaxbConfig {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan("com.kn.springwsdemo.message");
        return marshaller;
    }
    @Bean
    public SoapClient articleClient(Jaxb2Marshaller marshaller) {
        SoapClient client = new SoapClient();
        client.setDefaultUri("http://localhost:8033/ws");///employeez.wsdl
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}