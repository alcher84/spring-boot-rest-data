package org.test.backend.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.test.backend.config.CommonServiceConfig;
import org.test.backend.config.HibernateDataConfig;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan("org.test.backend")
@EnableAutoConfiguration(exclude = { JmxAutoConfiguration.class })
@EnableSwagger2
@IntegrationComponentScan
@Import({CommonServiceConfig.class, HibernateDataConfig.class})
public class WebserviceRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebserviceRestApplication.class, args);
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WebserviceRestApplication.class);
    }

}
