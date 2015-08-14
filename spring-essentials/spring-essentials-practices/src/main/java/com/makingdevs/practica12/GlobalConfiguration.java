package com.makingdevs.practica12;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.makingdevs.practica11.BeanConfigurationTwo;

@Configuration
@Import(BeanConfigurationTwo.class)
@ImportResource({ "classpath:/com/makingdevs/practica6/MoreInjectedBeansAppCtx.xml" })
@ComponentScan(basePackages = { "com.makingdevs.practica12" })
public class GlobalConfiguration {

}