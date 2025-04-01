package com.project.youhavefreetime.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {
    private final TimeslotRepository timeslotRepository;
    private final ActivityRepository activityRepository;

    @Autowired
    public ScheduleService(TimeslotRepository timeslotRepository, ActivityRepository activityRepository) {
        this.timeslotRepository = timeslotRepository;
        this.activityRepository = activityRepository;
    }

    public TimeslotRepository getTimeslotRepository() {
        return timeslotRepository;
    }

    public ActivityRepository getActivityRepository() {
        return activityRepository;
    }
}
