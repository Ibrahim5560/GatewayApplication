/*
package com.isoft.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
//                .route("deny_post", r -> r.path("/**")
////                        .filters(f -> f.prefixPath("/"))
//                        .and().method("POST")
//                        .filters(f -> f.prefixPath("/denied"))
//                        .uri("http://localhost:8080"))
//
//                .route("accept_get", r -> r.path("/**")
////                        .filters(f -> f.prefixPath("/"))
//                        .and().method("GET")
//                        .filters(f -> f.prefixPath("/"))
//                        .uri("http://localhost:8080"))

                .route("accept_get", r -> r.path("/vhl")
//                        .filters(f -> f.prefixPath("/"))
//                        .and().method("GET")
                        .filters(f -> f.setPath("/vehicle_license_type"))
                        .uri("http://localhost:8080"))

                .route("insurance", r -> r.path("/insurance/**")
                        .filters(f -> f.prefixPath("/"))
                        .uri("http://localhost:8080"))

                .route("get_accounts", r -> r.path("/accounts/**")
                        .filters(f -> f.prefixPath("/"))
                        .uri("http://localhost:8081"))

                .route("deny_users", r -> r.path("/users/**")
                        .filters(f -> f.prefixPath("/denied"))
                        .uri("http://localhost:8082"))
                .build();
    }
}
*/
