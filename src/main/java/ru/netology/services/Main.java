package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        RestService service = new RestService();

        System.out.println(service.calcRest(10_000, 3_000, 20_000));
        System.out.println(service.calcRest(100_000, 60_000, 150_000));
    }
}
