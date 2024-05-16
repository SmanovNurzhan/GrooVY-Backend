package GrooVY.group.groovy.service;

import GrooVY.group.groovy.Entity.Reservation;
import GrooVY.group.groovy.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReservationImpl implements ReservationService{
    private final ReservationRepository reservationRepository;
    @Override
    public Reservation saveReserv(Reservation reserv) {
        return reservationRepository.save(reserv);
    }
}
