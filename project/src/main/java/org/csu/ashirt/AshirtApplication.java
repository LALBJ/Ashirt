package org.csu.ashirt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.csu.ashirt.persistence")
public class AshirtApplication {

    public static void main(String[] args) {
        SpringApplication.run(AshirtApplication.class, args);
    }

}
