package ru.netology.services;

public class RestService {
    public int calcRest(int income, int expense, int threshold) {
        int money = 0;
        int monthRest = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                monthRest++;
                money = (money - expense) / 3;
            } else {
                money = money + income - expense;
            }
        }
        return monthRest;
    }
}
