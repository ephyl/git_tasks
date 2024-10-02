package ru.ephyl;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate loanDate = LocalDate.of(2024, 10, 2);
        Long creditPeriodDays = 42L;
        System.out.println(should_I_Give_Money_Back(creditPeriodDays, loanDate));
    }

    private String should_I_Give_Money_Back(long creditPeriodDays, LocalDate loanDate) {
        String result;
        Thread.sleep(1000);
        LocalDate payDate = loanDate.plusDays(creditPeriodDays);
        if (LocalDate.now().isAfter(payDate)) {
            result =  "Пора вернуть займ";
        } else if (LocalDate.now().isBefore(payDate)){
            result = "Сейчас возвращать не обязательно";
        }
        return result;
    }
}