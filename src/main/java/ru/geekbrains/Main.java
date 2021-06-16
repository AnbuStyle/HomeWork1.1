package ru.geekbrains;

import java.util.Random;

public class Main {

    static Host[] team = {new Human("Кожанный мешок", 5, 25),
                          new Cat("Барсик", 15, 55),
                          new Robot("Чаппи", 2, 50)};

    static Way[] way = new Way[5];

    public static void main(String[] args) {

        for (int i = 0; i < way.length; i++) {
            Random random = new Random();
            int a = random.nextInt(30); //поставил число побольше, чтобы можно было подкручивать вероятность
            if (a <= 15 ) {
                way[i] = new Track("track" + i, random.nextInt(50));
                //  System.out.println("Дорожка");
            }else {
                way [i] = new Wall("wall" + i, random.nextInt(30));
                // System.out.println("Стена");
            }
        }

        for (int i = 0; i < team.length; i++) {

            for (int j = 0; j < way.length; j++) {
                var b = way[j].doIt(team[i]);
                if (!b) {
                    break;
                }
            }
        }
    }
}