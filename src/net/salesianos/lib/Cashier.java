package net.salesianos.lib;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import net.salesianos.utils.RandomName;

public class Cashier {

    Random random = new Random();

    private String name;

    private Queue<Client> clientQueue = new LinkedList<>();

    private boolean isStationOpen = false;

    private int stationNumber = random.nextInt(12);

    public Cashier(){
        this.name = RandomName.getRandomName();

    }
    
}
