package com.kodilla.abstracts.homework;

class Geophysicist extends Job {
    public Geophysicist() {
        super(7000, "collecting seismic data");
    }

    @Override
    public String showResponsibilities() {
        return ("collecting seismic data");
    }
}
