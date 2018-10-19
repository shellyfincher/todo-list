package academy.learnprogramming.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "academy.learnprogramming")
public class WebConfig {

}
