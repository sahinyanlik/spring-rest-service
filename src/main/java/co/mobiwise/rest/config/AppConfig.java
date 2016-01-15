package co.mobiwise.rest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by ouzman on 13/01/16 at home.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"co.mobiwise.rest"}, excludeFilters = @ComponentScan.Filter({Configuration.class}))
@Import({HibernateConfigurer.class})
public class AppConfig {

}
