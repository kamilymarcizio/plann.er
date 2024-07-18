package com.rockseat.planner.link;

<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.UUID;

public interface LinkRepository extends JpaRepository<Link, UUID> {
    public List<Link> findByTripId(UUID tripId);
=======
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, UUID> {

    List<Link> findByTripId(UUID tripId);
>>>>>>> parent of 4dfb1d1 (nlw journey)
}
