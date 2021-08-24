package org.example;

import org.example.config.RootConfiguration;
import org.example.console.ConsoleCalculation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext ap = new AnnotationConfigApplicationContext(RootConfiguration.class);
        ConsoleCalculation calculation = (ConsoleCalculation) ap.getBean(ConsoleCalculation.class);
        calculation.getResult();
    }
}
