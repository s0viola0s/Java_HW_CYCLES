package ru.netology.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0; //сумма на счету
        int count = 0; //счетчик месяцев отдыха
        for (int i = 1; i < 13; i++) {
            //если денег меньше минимального остатка
            if (money < threshold) {
                money = money + income - expenses;
            }
            // если денег достаточно для отдыха
            else {
                money = money - expenses;
                money = money / 3;
                count++;
            }
        }
        return count;
    }
}
