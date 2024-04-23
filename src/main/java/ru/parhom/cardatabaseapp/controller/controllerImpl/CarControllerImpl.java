package ru.parhom.cardatabaseapp.controller.controllerImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import ru.parhom.cardatabaseapp.controller.CarController;
import ru.parhom.cardatabaseapp.entity.Car;
import ru.parhom.cardatabaseapp.repository.CarRepository;
import ru.parhom.cardatabaseapp.service.CarService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class CarControllerImpl implements CarController {

    private final CarService carService;

    @Override
    public ResponseEntity<List<Car>> getCars() {
        return ResponseEntity.ok(carService.getAllCars());
    }
}
