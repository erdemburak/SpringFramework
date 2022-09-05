package com.burakerdem.iocsiz_disiz;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "cdisizCalisan")
@ApplicationScoped
public class Calisan {
    private Patron patron;

    //parametresiz constructor
    public Calisan() {
        patron = new Patron();
    }

    public String getData(String data){
        return patron.surum(data);
    }
}
