package com.epam.conditions;

public class SeasonDeterminer {

    public static void tellTheSeason(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Wrong month number");
            return;
        }
        String[] seasonNames = {"Winter", "Spring", "Summer", "Autumn", "Winter"};
        System.out.println(seasonNames[monthNumber / 3]);
    }
}
