package com.example.demo.krystian.cudo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PorąbaneCudo implements Cudo {
    @Autowired
    private CudoConfiguration cudoConfiguration;

    @Override
    public void doCudo() {
        for (int i = 0; i < 3; i++) {
            System.out.println("\tPotrącony jestem");
            System.out.print("\t");
            Cudo c = cudoConfiguration.prototypoweCudo();
            System.out.print(c + "\t");
            c.doCudo();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("\tPotrącony jestem");
            System.out.print("\t");
            Cudo c = cudoConfiguration.cudo3();
            System.out.print(c + "\t");
            c.doCudo();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("\tPotrącony jestem");
            System.out.print("\t");
            Cudo c = cudoConfiguration.kolejnePrototypoweCudoBezStanu();
            System.out.print(c + "\t");
            c.doCudo();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("\tPotrącony jestem");
            System.out.print("\t");
            Cudo c = cudoConfiguration.cudoSingletonoweZeStanem();
            System.out.print(c + "\t");
            c.doCudo();
        }
    }
}
