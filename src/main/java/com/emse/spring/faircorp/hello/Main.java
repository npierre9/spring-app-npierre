package com.emse.spring.faircorp.hello;

public class Main {
    public static void main(String[] Args){
        ConsoleGreetingService service = new ConsoleGreetingService();
        String name = "Spring";
        service.greet(name);
    }
}
