package com.di.config;

import com.di.service.CustomerService;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;



@Configuration
@ComponentScan(basePackages={"com.di"})
public class AppConfiguration {

	@Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public CustomerService customerService() {
        return new CustomerService();
    }

}
