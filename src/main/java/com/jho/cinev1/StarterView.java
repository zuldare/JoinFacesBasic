package com.jho.cinev1;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import java.io.Serializable;

@Component("starterView")
@ViewScoped
public class StarterView implements Serializable {


    private static final long serialVersionUID = 1L;

    @PostConstruct
    public void init(){
        System.out.println("hola");
        System.out.println("adios");
    }


    public void onload(){
        System.out.println("hola");
        System.out.println("adios");
    }
}
