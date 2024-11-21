package ru.netology.services;

public class RestService {
    public int calcRest(int income, int expenses, int threshold) {
        int rest = 0;
        int money = 0;
        for (int i = 1; i <= 12; i++) {
            if (money >= threshold) {
                rest++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return rest;
    }
}
