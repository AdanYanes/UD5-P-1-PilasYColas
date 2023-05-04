package net.salesianos.lib;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import net.salesianos.utils.RandomName;

public class Cashier {

    Random random = new Random();

    private Queue<Client> clientQueue = new LinkedList<>();

    private boolean isStationOpen = false;

    private int stationNumber = random.nextInt(12);

    public Cashier(){

    }

    @Override
    public String toString(){

        String msg = "===================================\n";
        msg += "* Número de caja: " + this.stationNumber + "\n";
        msg+= "* Total de clientes: " + clientQueue.size() + "\n";
        msg+= "* Clientes en la fila:\n";

        for (Client client : clientQueue) {
            msg += "    " + client.getName() + "\n";
        }

        msg += "===================================\n";

        return msg;
    }
    
}
