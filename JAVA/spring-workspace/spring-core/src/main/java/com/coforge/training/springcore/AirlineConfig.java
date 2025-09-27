package com.coforge.training.springcore;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Author : Sola.Sri
 * Date   : Sep 26, 2025
 * Time   : 4:50:57 PM
 *Project : spring-core
 *Configuration class for Annotation Config and Component scan
 * to scan the components in the specified package
*/
@Configuration
@ComponentScan(basePackages = "com.coforge.training.springcore")
public class AirlineConfig {

}
