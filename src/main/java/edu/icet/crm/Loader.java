package edu.icet.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Loader {
    public static void main(String[] args){
        System.out.println("Hi");
        SpringApplication.run(Loader.class);
    }
}
