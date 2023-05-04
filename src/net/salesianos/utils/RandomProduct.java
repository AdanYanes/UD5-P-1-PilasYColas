package net.salesianos.utils;

import java.util.Random;

public class RandomProduct {
    
    private static final String[] PRODUCTS_ARRAY = {"Cocacola", "Pechuga de pollo", "Tomates", "Lejia", "Pizza margarita", "Cereales",
                                                    "Pan", "Mandarinas", "Merluza", "Sardinas", "Leche", "Agua"};

    public static String getRandomProduct(){

        Random randomNumber = new Random();

        return PRODUCTS_ARRAY[randomNumber.nextInt(12)];
    }

}