package com.company;

import java.util.ArrayList;
import java.util.List;

public class Happy_ticket {
    public static void main(String[] args) {
        int ticketNumber = 1;
        int countLuckyTickets = 0;
        int[] numbers = new int[6];
        List<Integer> luckyTicketsNumber = new ArrayList<>();
        for ( ;ticketNumber<1000000; ticketNumber++) {
            int a = ticketNumber;
            for (int i = 5; i > -1; i--) {
                numbers[i] = a % 10;
                a /= 10;
            }
            if (numbers[0] + numbers[1] + numbers[2] == numbers[3] + numbers[4] + numbers[5]) {
                countLuckyTickets += 1;
                luckyTicketsNumber.add(ticketNumber);
            }
        }
        System.out.println(countLuckyTickets);
        System.out.println(luckyTicketsNumber.get(0));
        System.out.println(luckyTicketsNumber.get(55248));

    }
}
