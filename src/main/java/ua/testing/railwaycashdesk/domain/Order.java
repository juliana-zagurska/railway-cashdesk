package ua.testing.railwaycashdesk.domain;

import java.time.LocalDateTime;

public class Order {
    private long id;
    private long ticketId;
    private double price;
    private LocalDateTime orderTime = LocalDateTime.now();
}
