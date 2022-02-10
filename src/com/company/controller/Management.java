package com.company.controller;

import com.company.model.Flight;

public interface Management {
    void addNewFlight(Flight flight);

    void buyingTicketsByFlightNumber(int number, String fullName);

    void showAllFlights();

    String ticketInfo();

    void searchFlightByTicketNumber(int ticketNumber);
}
