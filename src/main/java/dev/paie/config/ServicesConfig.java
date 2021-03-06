package dev.paie.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan({"dev.paie.service","dev.paie.util"})
@Import({JpaConfig.class, DataSourcePostgreConfig.class})
@EnableJpaRepositories("dev.paie.repository") // Configuration à ajouter.
public class ServicesConfig {

}
