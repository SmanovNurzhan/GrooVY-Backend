package GrooVY.group.groovy.controller;

import GrooVY.group.groovy.Entity.Person;
import GrooVY.group.groovy.Entity.Reservation;
import GrooVY.group.groovy.service.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservations")
@AllArgsConstructor
@CrossOrigin
public class ReservationController {
    private ReservationService reservationService;
    @PostMapping("/addReserv")
    public ResponseEntity<?> add(@RequestBody Reservation r){
        reservationService.saveReserv(r);
        return ResponseEntity.ok(r);
    }
}
