# UD5-P-1-PilasYColas

This Java program provides a simple menu for managing a cashier station at a supermarket. The menu allows you to perform the following actions: <br>

1. Open the cashier station <br>
2. Add a new client to the queue <br>
3. Attend to a client <br>
4. View the pending clients <br>
5. Close the supermarket <br>

## Getting started

1. Clone the repository and open the Main.java file in your preferred IDE. <br>
2. Compile and run the program. <br>

## Usage

The program starts by displaying the main menu, where you can choose from the different options by entering the corresponding number. The program will continue to run until you choose to close the supermarket. <br>

### Open the cashier station

To open the cashier station, select option 1 from the main menu. This will set the isStationOpen variable to true in the Cashier class. <br>

### Add a new client to the queue

To add a new client to the queue, select option 2 from the main menu. If the cashier station is open, the program will prompt you to enter the client's details. Once you have entered the details, the client will be added to the queue, and their details will be displayed on the console. <br>

### Attend to a client

To attend to a client, select option 3 from the main menu. If there are clients in the queue, the next client in line will be removed from the queue, and their name will be displayed on the console. If there are no clients in the queue, a message will be displayed indicating that there are no clients to attend to. <br>

### View the pending clients

To view the pending clients, select option 4 from the main menu. If there are clients in the queue, their names and the number of the cashier station they are waiting at will be displayed on the console. If there are no clients in the queue, a message will be displayed indicating that there are no clients to attend to. <br>

### Close the supermarket

To close the supermarket, select option 5 from the main menu. This will set the isStationOpen variable to false in the Cashier class and exit the program. <br>

## Documentation