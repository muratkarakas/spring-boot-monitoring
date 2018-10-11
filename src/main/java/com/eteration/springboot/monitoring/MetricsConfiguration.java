package com.eteration.springboot.monitoring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.micrometer.core.instrument.MeterRegistry;

@Configuration
public class MetricsConfiguration {

	@Value("${spring.application.name}")
	private String appName;
	@Value("${spring.datasource.hikari.pool-name}")
	private String poolName;
	
	
	
    @Bean
    MeterRegistryCustomizer<MeterRegistry> metricsCommonTags() {
        return registry -> {
            registry.config().commonTags("application", appName).commonTags("hikaricp",poolName);
        };
    }
 
}