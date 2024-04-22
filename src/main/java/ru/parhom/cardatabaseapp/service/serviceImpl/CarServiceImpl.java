package ru.parhom.cardatabaseapp.service.serviceImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.parhom.cardatabaseapp.entity.Car;
import ru.parhom.cardatabaseapp.repository.CarRepository;
import ru.parhom.cardatabaseapp.service.CarService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }
}
