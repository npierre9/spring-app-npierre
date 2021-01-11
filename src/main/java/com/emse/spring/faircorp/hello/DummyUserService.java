package com.emse.spring.faircorp.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DummyUserService implements UserService {

    @Autowired
    private GreetingService service;

    public void setGreetingService(GreetingService service){
        this.service=service;
    }
    public GreetingService getGreetingService(){
        return service;
    }

    public void greetAll(){
        List<String> nameList = new ArrayList<String>();
        nameList.add(new String("Nicolas"));
        nameList.add(new String("Pierre"));
        for (int i=0; i<nameList.size();i++){
            service.greet(nameList.get(i));
        }
    }
}
