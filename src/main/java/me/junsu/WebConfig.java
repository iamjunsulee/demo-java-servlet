package me.junsu;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(includeFilters = @ComponentScan.Filter(Controller.class))
public class WebConfig {
}
