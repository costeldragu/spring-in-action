package com.mdc;

import com.mdc.services.Knight;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String... args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/knight.xml");

        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
