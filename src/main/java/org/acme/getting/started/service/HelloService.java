package org.acme.getting.started.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloService {

    public String sayHello(){
        return "Hola World!";
    }
}
