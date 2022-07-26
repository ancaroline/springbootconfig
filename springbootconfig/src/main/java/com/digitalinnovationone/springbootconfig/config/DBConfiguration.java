package com.digitalinnovationone.springbootconfig.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
public class DBConfiguration {

    private String driverClassName;
    private String url;
    private String username;
    private String password;
    //Declarando os métodos que vão fazer o mapeamento das propriedades dentro
    //do nosso sistema
    @Profile("dev") //para pegar todas as propriedades de config com a propriedade profile
    @Bean //desejamos instanciar esse método como bean, pois queremos mostrar esse conteúdo sendo mapeado logo na subida do nosso sistema
    public String testDatabaseConnection() {
        System.out.println("DB connection for DEV - H2");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection to H2_TEST - Test instance";
    }
}
