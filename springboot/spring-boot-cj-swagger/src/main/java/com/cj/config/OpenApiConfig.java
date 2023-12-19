package com.cj.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("测试 title")
                        .description("测试 description")
                        .version("v1"))
                .externalDocs(new ExternalDocumentation()
                        .description("测试swagger项目API文档")
                        .url("/abc"));
    }

}
