package com.cj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.http.ResponseEntity.ok;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@SpringBootApplication
public class SpringBootCjWebContainerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCjWebContainerApplication.class, args);
    }


//    @Bean
//    public RouterFunction<ServerResponse> hello() {
//        return route(GET("/hello"),
//                request -> ok().body(Mono.just("Hello World"), String.class));
//    }
//
//    @Bean
//    public RouterFunction<ServerResponse> hello2() {
//        return route(GET("/hello2"),
//                request -> ok().body(Mono.just("Hello World2")));
//    }

}
