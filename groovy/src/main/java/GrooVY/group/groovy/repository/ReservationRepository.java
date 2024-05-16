package GrooVY.group.groovy.repository;

import GrooVY.group.groovy.Entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
