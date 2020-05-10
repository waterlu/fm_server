package cn.lu.fm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import cn.lu.web.annotation.EnableWaterlooWeb;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Demo project for Spring Cloud
 *
 * @author waterlu
 * @date 2020-04-11
 */
@SpringBootApplication
@MapperScan("cn.lu.fm.mapper")
@EnableWaterlooWeb
@EnableSwagger2
public class FmApplication {

    public static void main(String[] args) {
        SpringApplication.run(FmApplication.class, args);
    }

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.basePackage("cn.lu.fm"))
            .paths(PathSelectors.any())
            .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Demo project for Spring Cloud" + " Api Documentation")
            .description("Demo project for Spring Cloud" + " Api Documentation")
            .contact(new Contact("waterlu", "", ""))
            .version("1.0.0")
            .build();
    }
}