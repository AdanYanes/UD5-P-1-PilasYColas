import java.util.Scanner;

import net.salesianos.lib.Cashier;
import net.salesianos.lib.Client;

public class Main{
    public static void main(String[] args) {
        
        boolean isActive = true;

        Cashier cashier = new Cashier();

        int option;

        Scanner scanner = new Scanner(System.in);

        while(isActive){
            System.out.println("Por favor, elija una de las siguientes opciones: \n\n");
            System.out.println("1. Abrir caja:");
            System.out.println("2. Añadir un nuevo cliente a la cola:");
            System.out.println("3. Atender un cliente:");
            System.out.println("4. Ver clientes pendientes:");
            System.out.println("5. Cerrar supermercado:");

            option = Integer.parseInt(scanner.nextLine());

            switch(option){
                case 1:{
                    cashier.openStation();
                    break;
                }
                case 2:{
                    if(cashier.getIsStationOpen()){
                        cashier.addClient();
                        Object[] clientArray = cashier.getClientQueue().toArray();

                        System.out.println("Estos son los datos del cliente: \n");
                        System.out.println(clientArray[(clientArray.length - 1)]);
                    }else{
                        System.out.println("La caja esta cerrada");
                    }
                    break;
                }
                case 3:{
                   if (!cashier.getClientQueue().isEmpty()){
                        System.out.println("Se ha atendido a " + cashier.getClientQueue().poll().getName());
                   }else{
                        System.out.println("No hay clientes que atender");
                   }
                   break;
                }
                case 4:{
                    if (!cashier.getClientQueue().isEmpty()){
                        for (Client clients : cashier.getClientQueue()) {
                            System.out.println("El cliente " + clients.getName() + " esta esperando en la caja " + cashier.getStationNumber());
                        }
                    }else{
                        System.out.println("No hay clientes que atender");
                    }
                    break;
                }
                case 5:{
                    cashier.closeStation();
                    isActive = false;
                }
            }
        }

    }
}