package ua.testing.railwaycashdesk.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TicketController {

    @GetMapping
    @RequestMapping("/api/v1/ticket")
    @CrossOrigin(origins = "http://localhost:4200")
    public String getFirstTicket() {
        return "Your first ticket!";
    }
}
