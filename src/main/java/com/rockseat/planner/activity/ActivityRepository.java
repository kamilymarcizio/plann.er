package com.rockseat.planner.activity;

<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ActivityRepository extends JpaRepository<Activity, UUID> {
=======
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, UUID> {

>>>>>>> parent of 4dfb1d1 (nlw journey)
    List<Activity> findByTripId(UUID tripId);
}
