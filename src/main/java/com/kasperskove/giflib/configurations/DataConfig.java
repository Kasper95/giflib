package com.kasperskove.giflib.configurations;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;

@Configuration
@PropertySource("application.properties")
public class DataConfig {

    @Autowired
    private Environment environment;

    @Bean
    public LocalSessionFactoryBean sessionFactory() {

        Resource config = new ClassPathResource("hibernate.cfg.xml");
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setConfigLocation(config);
        sessionFactoryBean.setPackagesToScan(environment.getProperty("giflib.entity.package"));
        sessionFactoryBean.setDataSource(dataSource());
        return sessionFactoryBean;
    }

    @Bean
    public DataSource dataSource() {

        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(environment.getProperty("giflib.dv.driver"));
        ds.setUrl(environment.getProperty("giflib.db.url"));
        ds.setUsername(environment.getProperty("giflib.db.username"));
        ds.setPassword(environment.getProperty("giflib.db.password"));
        return ds;
    }
}
