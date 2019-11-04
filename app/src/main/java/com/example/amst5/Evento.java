package com.example.amst5;

public class Evento {
    private String hour;
    private String timeRequired;
    private String description;
    private String place;

    public Evento(String hour, String timeRequired, String description, String place) {
        this.hour = hour;
        this.timeRequired = timeRequired;
        this.description = description;
        this.place = place;
    }

    public String getHour() {
        return hour;
    }

    public String getTimeRequired() {
        return timeRequired;
    }

    public String getDescription() {
        return description;
    }

    public String getPlace() {
        return place;
    }
}
