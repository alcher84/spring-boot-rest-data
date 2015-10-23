package org.test.backend.config;

import com.codahale.metrics.MetricRegistry;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.test.backend.entity.Users;

import javax.sql.DataSource;

/**
 * Created by achernysh on 22.10.2015.
 */
@Configuration
@EnableJpaRepositories("org.test.backend.repository")
@EnableAutoConfiguration
@EntityScan(basePackageClasses=Users.class)
public class HibernateDataConfig {

    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.url}")
    private String dataSourceUrl;
    @Value("${spring.datasource.driverClassName}")
    private String driverClassName;
    @Value("${flyway.db.clean:false}")
    private boolean flywayClean;

    @Bean
    public DataSource dataSource() {
        HikariDataSource dataSource = (HikariDataSource) DataSourceBuilder.create().build();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setJdbcUrl(dataSourceUrl);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
