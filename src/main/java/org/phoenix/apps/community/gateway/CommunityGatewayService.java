package org.phoenix.apps.community.gateway;

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.timelimiter.TimeLimiterConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JCircuitBreakerFactory;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JConfigBuilder;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

import java.beans.Customizer;
import java.time.Duration;

@SpringBootApplication
public class CommunityGatewayService {
    public static void main(String[] args) {
        SpringApplication.run(CommunityGatewayService.class, args);
    }

    //Below is an alternate way of creating circuit breaker programmatically. This works same as the config.
//    @Bean
//    public RouteLocator communityAppRoutes(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(p -> p
//                        .path("/post")
//                        .filters(f -> f.prefixPath("/api"))
//                        .uri("http://localhost:8081") )
//                .route(p -> p
//                        .path("/comments/**")
//                        .filters(f -> f
//                                .circuitBreaker(config -> config
//                                .setName("myCircuitBreaker")
//                                .setFallbackUri("forward:/fallback/commentService"))
//                                .prefixPath("/api"))
//                        .uri("http://localhost:8082"))
//                .route(p -> p
//                        .path("/community")
//                        .filters(f -> f.prefixPath("/api"))
//                        .uri("http://localhost:8084"))
//                .route(p -> p
//                        .path("/groups")
//                        .filters(f -> f.prefixPath("/api"))
//                        .uri("http://localhost:8084"))
//                .route(p -> p
//                        .path("/group/**")
//                        .filters(f -> f.prefixPath("/my-community"))
//                        .uri("http://localhost:8083"))
//                .route(p -> p
//                        .path("/community/**")
//                        .filters(f -> f.prefixPath("/my-community"))
//                        .uri("http://localhost:8083"))
//                .build();
//    }
}
