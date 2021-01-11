package com.emse.spring.faircorp.hello;

public class Main {
    public static void main(String[] Args){
        ConsoleGreetingService service = new ConsoleGreetingService();
        DummyUserService service2 = new DummyUserService();
        String name = "Spring";
        service.greet(name);
        service2.greetAll();
    }
}
