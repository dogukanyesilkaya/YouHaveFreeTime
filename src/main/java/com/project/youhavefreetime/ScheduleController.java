package com.project.youhavefreetime;

import com.project.youhavefreetime.Model.ScheduleService;
import com.project.youhavefreetime.Model.ScheduleTimeslot;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api/schedule")
public class ScheduleController {
    private ScheduleService scheduleService;

    @GetMapping("/timeslot/{id}")
    @ResponseBody
    public ResponseEntity getTimeslotById(@PathVariable Long id) {
        try {
            Optional<ScheduleTimeslot> timeslot= scheduleService.getTimeslotRepository().findById(id);
            return ResponseEntity.ok(timeslot);
        }catch (RuntimeException e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
