package model;

import constants.Service;

import java.time.LocalDateTime;

public class Booking {
    protected String employeeId;
    protected String clientId;
    protected LocalDateTime beginningTime;
    protected LocalDateTime finishingTime;
    protected Service service;

    public Booking(String employeeId, String clientId, LocalDateTime beginningTime, LocalDateTime finishingTime, Service service) {
        this.employeeId = employeeId;
        this.clientId = clientId;
        this.beginningTime = beginningTime;
        this.finishingTime = finishingTime;
        this.service = service;
    }
}
