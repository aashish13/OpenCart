/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.config;

import java.util.Properties;
import javax.annotation.Resource;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 *
 * @author Aashish
 */
@Configuration
@ComponentScan("com.opencart")
@EnableWebMvc@EnableTransactionManagement
public class SpringConfigurations extends WebMvcConfigurerAdapter{
    @Resource
    private Environment env;
    
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource datasource=new DriverManagerDataSource();
        
        datasource.setDriverClassName("oracle.jdbc.OracleDriver");
        datasource.setUrl("jdbc:oracle:thin:@dilbert.humber.ca:1521:grok");
        datasource.setUsername("n01043708");
        datasource.setPassword("oracle");
        return datasource;
    }
    
    @Bean
    public LocalSessionFactoryBean sessionFactory(){
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource());
        sessionFactoryBean.setPackagesToScan("com.opencart.entity");
        sessionFactoryBean.setHibernateProperties(hibProperties());
        return sessionFactoryBean;
    }

    public Properties hibProperties() {
        Properties properties=new Properties();
        properties.put("hibernate.hbm2ddl.auto", "update");
        properties.put("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
        properties.put("hibernate.show_sql", "true");
        return properties;
    }
    @Bean
    public HibernateTransactionManager transactionManager(){
        HibernateTransactionManager transactionManager= new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactory().getObject());
        return transactionManager;
    }
    @Bean
    public UrlBasedViewResolver setupViewResolver(){
        UrlBasedViewResolver resolver=new UrlBasedViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/style/**").addResourceLocations("/WEB-INF/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("/WEB-INF/js/");
        registry.addResourceHandler("/uploads/**").addResourceLocations("/WEB-INF/uploads/");
        
        
    }
    
    @Bean(name = "multipartResolver")
    public CommonsMultipartResolver createMultiPartObject(){
        CommonsMultipartResolver resolver=new CommonsMultipartResolver();
        resolver.setMaxUploadSize(500000);
        return resolver;
    }
}
