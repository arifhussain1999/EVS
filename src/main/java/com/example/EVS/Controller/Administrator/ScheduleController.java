package com.example.EVS.Controller.Administrator;

import com.example.EVS.Model.Schedule;
import com.example.EVS.Service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/schedules")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    // Add Schedule (Admin can use this later if needed)
    @PostMapping("/add")
    public ResponseEntity<Schedule> addSchedule(@RequestBody Schedule schedule) {
        Schedule savedSchedule = scheduleService.addSchedule(schedule);
        return ResponseEntity.ok(savedSchedule);
    }
}
