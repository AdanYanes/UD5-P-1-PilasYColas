package net.salesianos.utils;

import java.util.Random;

public class RandomName {
    
    private static final String[] NAME_ARRAY = {"Adán", "Maria", "Jose", "Eugenia", "Eva", 
                                                "Carlos","Alba", "Adrian", "Mario", "Erik",
                                                "Arceus", "Pablo", "Josefina", "Carla", "Katarina",
                                                "Laura", "Paula", "Javier", "Thalia", "Omar"
                                                };

    public static String getRandomName(){

        Random randomName = new Random();

        return NAME_ARRAY[randomName.nextInt(NAME_ARRAY.length)];
    }

}
