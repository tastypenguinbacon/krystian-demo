package com.example.demo.krystian.cudo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Configuration
public class CudoConfiguration {
    private int prototypeCount;
    private int singletonCount;

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

    @Bean
    @Scope("prototype")
    public Cudo prototypoweCudo() {
        int forClosure = prototypeCount++;
        return () -> System.out.println("I'm a prototype number: " + forClosure);
    }

    @Bean
    @Scope("prototype")
    public Cudo kolejnePrototypoweCudoBezStanu() {
        return () -> System.out.println("I'm a stateless prototype");
    }

    @Bean
    public Cudo cudoSingletonoweZeStanem() {
        int forClosure = singletonCount++;
        return () -> System.out.println("I'm a stateful Singleton lambda! My number is: " + forClosure);
    }
}
