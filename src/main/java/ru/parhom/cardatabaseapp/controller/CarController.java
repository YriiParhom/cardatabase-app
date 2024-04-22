package ru.parhom.cardatabaseapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.parhom.cardatabaseapp.entity.Car;

import java.util.List;


@RequestMapping("/v1")
public interface CarController {

    @GetMapping("/cars")
    ResponseEntity<List<Car>> getCars();
}
