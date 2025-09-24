package com.example.EVS.Service;

import com.example.EVS.Model.Schedule;
import com.example.EVS.Repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {

    @Autowired
    private ScheduleRepository scheduleRepository;

    // Add Schedule
    public Schedule addSchedule(Schedule schedule) {
        return scheduleRepository.save(schedule);
    }

    // View all Schedules
    public List<Schedule> getAllSchedules() {
        return scheduleRepository.findAll();
    }
}