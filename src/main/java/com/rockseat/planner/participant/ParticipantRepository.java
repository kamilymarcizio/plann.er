package com.rockseat.planner.participant;

import java.util.List;
import java.util.UUID;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;


public interface ParticipantRepository extends JpaRepository<Participant, UUID> {
=======

import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant, UUID> {

>>>>>>> parent of 4dfb1d1 (nlw journey)
    List<Participant> findByTripId(UUID tripId);
}
