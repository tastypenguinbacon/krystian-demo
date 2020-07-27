package com.example.demo.krystian;

import com.example.demo.krystian.cudo.Cudo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CudoRunner implements CommandLineRunner {
    @Autowired
    @Qualifier("LiczboweCudo")
    private List<Cudo> liczboweCuda;

    @Autowired
    private List<Cudo> wszystkieCuda;

    @Override
    public void run(String... args) {
        System.out.println("Liczbowe Cuda:");
        liczboweCuda.stream().peek(System.out::println).forEach(Cudo::doCudo);
        System.out.println();
        System.out.println("Wszystkie Cuda:");
        wszystkieCuda.stream().peek(System.out::println).forEach(Cudo::doCudo);
    }
}
