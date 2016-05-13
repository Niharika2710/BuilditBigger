package com.mastoureshgh;

import java.util.Random;

public class JokeTeller {
    Random ran = new Random();
    public String getJoke(){
        String[] someJokes = { "Can a kangaroo jump higher than a house? Of course, a house does not jump at all.",
                " It is so cold outside I saw a politician with his hands in his own pockets.",
                "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away."

        };
        return someJokes[ran.nextInt(3)];
    }
}
