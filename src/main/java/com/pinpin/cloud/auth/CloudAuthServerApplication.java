package com.pinpin.cloud.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author sorata 2019-08-29
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.pinpin.cloud.auth.dao")
@EntityScan(basePackages = "com.pinpin.cloud.auth.entity")
public class CloudAuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAuthServerApplication.class, args);
    }

}
