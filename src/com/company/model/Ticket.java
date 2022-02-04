package com.company.model;


public class Ticket {
    static int count = 0;
    private int id;
    private String departure;
    private String place;
    private String arrival;
    private Flight flight;


    public Ticket(int id, String departure, String place, String arrival) {
        count ++;
        this.id = id;
        this.departure = departure;
        this.place = place;
        this.arrival = arrival;
        this.flight = new Flight();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Ticket.count = count;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", departure='" + departure + '\'' +
                ", place='" + place + '\'' +
                ", arrival='" + arrival + '\'' +
                '}';
    }
}
