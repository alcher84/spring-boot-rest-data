package org.test.backend.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by achernysh on 23.10.2015.
 */
@Configuration
@ComponentScan(basePackages = "org.test.backend")
@Import(HibernateDataConfig.class)
public class CommonServiceConfig {
}
