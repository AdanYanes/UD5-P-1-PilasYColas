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

    public void openStation(){
        if (isStationOpen){
            System.out.println("La caja ya esta abierta");
        }else{
            System.out.println("Se ha abierto la caja");
            this.isStationOpen = true;
        }
    }

    public void closeStation(){
        if (!isStationOpen){
            System.out.println("La caja ya esta cerrada");
        }else{
            System.out.println("Se ha cerrado la caja");
            this.isStationOpen = false;
        }
    }

    public void addClient(){
        clientQueue.add(new Client());
    }

    public boolean getIsStationOpen() {
        return isStationOpen;
    }

    public Queue<Client> getClientQueue() {
        return clientQueue;
    }

    public int getStationNumber() {
        return stationNumber;
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
