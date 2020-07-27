package com.example.demo.krystian.cudo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("LiczboweCudo")
public class Cudo2 implements Cudo {
    @Override
    public void doCudo() {
        System.out.println("Cudo2");
    }
}
