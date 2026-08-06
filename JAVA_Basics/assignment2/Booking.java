package assignment2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Booking {
    private String roomType;
    private String guestName;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private double pricePerNight;

    public Booking(String roomType, String guestName, LocalDate checkIn, LocalDate checkOut, double pricePerNight) {
        this.roomType = roomType;
        this.guestName = guestName;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.pricePerNight = pricePerNight;
    }

    public String getRoomType() { return roomType; }
    public String getGuestName() { return guestName; }
    public double getTotalRevenue() {
        long nights = ChronoUnit.DAYS.between(checkIn, checkOut);
        return nights * pricePerNight;
    }
}
