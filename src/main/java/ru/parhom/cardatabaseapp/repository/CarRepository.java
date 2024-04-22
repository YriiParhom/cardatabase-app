package ru.parhom.cardatabaseapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.parhom.cardatabaseapp.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

}
