package com.company.model;

import com.company.dao.DataBaseConnection;
import com.company.enams.Status;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

public class Flight {
    public static int count = 0;

    private int id;
    private String departureTime;
    private String arrivalTime;
    private Airplane airplane;
    private Status status;
    private Ticket[] tickets;

    public Flight() {
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Ticket[] getTickets() {
        return tickets;
    }

    public void setTickets(int countTickets) {
        this.tickets = new Ticket[countTickets];
    }

        public int insertFlight(Flight flight) throws SQLException {
        Connection connection = DataBaseConnection.connect();
        String SQL = ("INSERT INTO users(id, login, email, password, date_of_registration " +
                "VALUES(?, ?, ?, ?, ?)");
        PreparedStatement statement = connection.prepareStatement(SQL);
        statement.setInt(1, 0 );
        return 0;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", airplane=" + airplane +
                ", status=" + status +
                ", tickets=" + Arrays.toString(tickets) +
                '}';
    }
}
