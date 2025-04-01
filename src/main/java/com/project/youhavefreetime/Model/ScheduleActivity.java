package com.project.youhavefreetime.Model;

import jakarta.persistence.*;


@Entity
@Table(name = "schedule_activity")
public class ScheduleActivity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Uses PostgreSQL SERIAL
    private Long id;

    @ManyToOne
    @JoinColumn(name="timeslot_id",nullable=false)
    private ScheduleTimeslot timeslotId;

    @Column(name="name")
    private String name;

    @Column(name="type")
    private ScheduleType type;

    @Column(name="priority")
    private ScheduleActivityPriority priority;

    public ScheduleActivity() {}

    public ScheduleActivity(Long id, ScheduleTimeslot timeslotId, String name, ScheduleType type, ScheduleActivityPriority priority) {
        this.id = id;
        this.timeslotId = timeslotId;
        this.name = name;
        this.type = type;
        this.priority = priority;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ScheduleTimeslot getTimeslotId() {
        return timeslotId;
    }

    public void setTimeslotId(ScheduleTimeslot timeslotId) {
        this.timeslotId = timeslotId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ScheduleType getType() {
        return type;
    }

    public void setType(ScheduleType type) {
        this.type = type;
    }

    public ScheduleActivityPriority getPriority() {
        return priority;
    }

    public void setPriority(ScheduleActivityPriority priority) {
        this.priority = priority;
    }
}