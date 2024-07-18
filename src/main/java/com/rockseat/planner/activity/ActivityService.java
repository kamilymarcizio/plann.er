package com.rockseat.planner.activity;

<<<<<<< HEAD
import com.rockseat.planner.trip.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

=======
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rockseat.planner.trip.Trip;

>>>>>>> parent of 4dfb1d1 (nlw journey)
@Service
public class ActivityService {

    @Autowired
    private ActivityRepository repository;

<<<<<<< HEAD
    public ActivityResponse registerActivity(@org.jetbrains.annotations.NotNull ActivityRequestPayload payload, Trip trip) {
=======
    public ActivityResponse registerActivity(ActivityRequestPayload payload, Trip trip) {
>>>>>>> parent of 4dfb1d1 (nlw journey)
        Activity newActivity = new Activity(payload.title(), payload.occurs_at(), trip);

        this.repository.save(newActivity);

        return new ActivityResponse(newActivity.getId());
    }

    public List<ActivityData> getAllActivitiesFromId(UUID tripId) {
        return this.repository.findByTripId(tripId).stream().map(activity -> new ActivityData(activity.getId(), activity.getTitle(), activity.getOccursAt())).toList();
    }
}
