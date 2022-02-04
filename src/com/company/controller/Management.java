package com.company.controller;

import com.company.model.Flight;
import com.company.model.Ticket;

public interface Management {
    void addNewFlight(Flight flight);

    void buyingTicketsByFlightNumber(int number);

    void showAllFlights();

    String ticketInfo();

    Flight searchFlightByTicketNumber(int ticketNumber);
}
