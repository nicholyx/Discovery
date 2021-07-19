package com.nepxion.discovery.plugin.strategy.sentinel.prometheus.monitor.configuration;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Tank
 * @version 1.0
 */

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nepxion.discovery.plugin.strategy.sentinel.prometheus.monitor.constant.SentinelPrometheusMetricConstant;
import com.nepxion.discovery.plugin.strategy.sentinel.prometheus.monitor.metric.SentinelPrometheusMetricInitializer;

@Configuration
@ConditionalOnProperty(value = SentinelPrometheusMetricConstant.SPRING_APPLICATION_STRATEGY_SENTINEL_PROMETHEUS_ENABLED, matchIfMissing = false)
public class SentinelPrometheusAutoConfiguration {
    @Bean
    public SentinelPrometheusMetricInitializer sentinelPrometheusMetricInitializer() {
        return new SentinelPrometheusMetricInitializer();
    }
}