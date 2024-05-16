package GrooVY.group.groovy.Entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,length = 15)
    private String phone;
    @NonNull
    @Column(name = "city")
    private String option;
    @NonNull
    @Column(name = "number_seats")
    private int numberSeats;
    @NonNull
    @Column(name="customer_name")
    private String name;
}
