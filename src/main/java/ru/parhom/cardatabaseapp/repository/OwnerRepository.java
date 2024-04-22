package ru.parhom.cardatabaseapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.parhom.cardatabaseapp.entity.Owner;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
