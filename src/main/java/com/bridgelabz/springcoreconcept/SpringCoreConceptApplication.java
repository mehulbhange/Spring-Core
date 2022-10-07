package com.bridgelabz.springcoreconcept;

import com.bridgelabz.springcoreconcept.components.DemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreConceptApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to Spring Concepts Demo");
        ApplicationContext context = SpringApplication.run(SpringCoreConceptApplication.class, args);
        DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.println("DemoBean = "+ demoBean.toString());
    }

}
