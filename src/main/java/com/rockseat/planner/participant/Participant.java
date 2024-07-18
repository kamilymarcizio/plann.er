package com.rockseat.planner.participant;

import com.rockseat.planner.trip.Trip;
<<<<<<< HEAD
=======
import com.rockseat.planner.trip.TripRequestPayLoad;
>>>>>>> parent of 4dfb1d1 (nlw journey)
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

<<<<<<< HEAD
=======
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
>>>>>>> parent of 4dfb1d1 (nlw journey)
import java.util.UUID;

@Entity
@Table(name = "participants")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Participant {
<<<<<<< HEAD

=======
>>>>>>> parent of 4dfb1d1 (nlw journey)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "is_confirmed", nullable = false)
    private Boolean isConfirmed;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "trip_id", nullable = false)
    private Trip trip;

    public Participant(String email, Trip trip){
        this.email = email;
        this.trip = trip;
        this.isConfirmed = false;
        this.name = "";
    }

}
