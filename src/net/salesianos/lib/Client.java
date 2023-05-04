package net.salesianos.lib;

import java.util.Random;
import java.util.Stack;

import net.salesianos.utils.RandomName;
import net.salesianos.utils.RandomProduct;

public class Client {

    private String name;

    Stack<String> basket = new Stack<>();

    public Client(){
        this.name = RandomName.getRandomName();
        generateRandomBacket();
    }

    private void generateRandomBacket(){

        Random randomSize = new Random();

        for (int i = 0; i < randomSize.nextInt(12); i++) {
            basket.push(RandomProduct.getRandomProduct());
        }

    }
    
}
