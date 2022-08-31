package com.burakerdem.bean;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;


@Named(value = "cdiBean")
@ApplicationScoped
@Setter
@Getter
public class JsfBean {
    private String patika;

    public JsfBean() {
        this.patika = "Spring Boot'a Hoşgeldiniz";
    }
}
