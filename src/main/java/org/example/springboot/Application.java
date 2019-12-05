package org.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication //스프링 부트의 자동 설정, 스프링 bean 읽기와 생성을 모두 자동으로 설정; 항상 최상단에 위치해야함.
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args); //해당 함수때문에 WAS를 실행
    }
}
