package ru.parhom.cardatabaseapp;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.parhom.cardatabaseapp.repository.AppUserRepository;

@SpringBootApplication
public class CardatabaseAppApplication {

    private static final Logger logger = LoggerFactory.getLogger(CardatabaseAppApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CardatabaseAppApplication.class, args);
    }

}
