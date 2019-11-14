package com.testKhoroshev.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Locale;

@Configuration
@ComponentScan(basePackages = {"com.testKhoroshev.service","com.testKhoroshev.dao"})
public class SpringConfig {

    @Bean
    public JdbcTemplate getJdbcTemplate(){
       return new JdbcTemplate(getDataSource());
    }
    @Bean
    public DataSource getDataSource() {
        Locale.setDefault(Locale.ENGLISH);
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
        dataSource.setUsername("system");
        dataSource.setPassword("1234");
        dataSource.setDriverClassName(oracle.jdbc.driver.OracleDriver.class.getName());
        return dataSource;
    }
}
