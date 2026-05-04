package com.pluralsight;

public class HotelOperation {
    public static void main(String[] args) {
        Reservation reservation1 = new Reservation("King", 3, false);
        System.out.println(reservation1.getPrice());
        System.out.println(reservation1.getReservationTotal());

        Employee employee1 = new Employee("Bogdan", 23, 41);
        System.out.println(employee1.getTotalPay());
    }
}
