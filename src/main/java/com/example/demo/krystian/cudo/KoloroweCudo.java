package com.example.demo.krystian.cudo;

import org.springframework.stereotype.Component;

@Component
public class KoloroweCudo implements Cudo {
    @Override
    public void doCudo() {
        System.out.println("KolroweCudo");
    }
}
