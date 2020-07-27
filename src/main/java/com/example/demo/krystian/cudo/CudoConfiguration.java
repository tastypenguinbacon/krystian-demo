package com.example.demo.krystian.cudo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class CudoConfiguration {
    @Bean
    @Qualifier("LiczboweCudo")
    public Cudo cudo3() {
        return () -> System.out.println("Cudo 3");
    }

    @Bean
    @Qualifier("LiczboweCudo")
    public Cudo cudo4() {
        return () -> System.out.println("Cudo 4");
    }

    @Bean
    public Cudo randomoweCudo() {
        Random r = new Random();
        return () -> System.out.println("Random Cudo: " + r.nextInt(10));
    }
}
