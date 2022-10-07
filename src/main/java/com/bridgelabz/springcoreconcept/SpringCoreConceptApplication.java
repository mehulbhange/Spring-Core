package com.bridgelabz.springcoreconcept;

import com.bridgelabz.springcoreconcept.components.DemoBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreConceptApplication {

    public static final Logger logger = LoggerFactory.getLogger(SpringCoreConceptApplication.class);

    public static void main(String[] args) {
        logger.info("Welcome to Spring Concepts Demo");
        ApplicationContext context = SpringApplication.run(SpringCoreConceptApplication.class, args);
        DemoBean demoBean = context.getBean(DemoBean.class);

        logger.debug("DemoBean = "+ demoBean.toString());
    }

}
