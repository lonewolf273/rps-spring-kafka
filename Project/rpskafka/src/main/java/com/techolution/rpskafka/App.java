package com.techolution.rpskafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * 	APP CLASS:
 * 		not supposed to do anything but run
 * 		endpoints elsewhere does the rest
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
