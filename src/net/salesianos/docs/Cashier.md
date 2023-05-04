# Cashier

The Cashier class represents a cashier that works at a supermarket. It manages a queue of clients waiting to be served. <br>

## Properties

- clientQueue (Queue<Client>): A queue that holds the clients waiting to be served. <br>
- isStationOpen (boolean): A boolean flag that indicates whether the cashier station is open or closed. <br>
- stationNumber (int): An integer representing the number of the cashier station. <br>

## Methods

- openStation(): Opens the cashier station if it's not already open. <br>
- closeStation(): Closes the cashier station if it's not already closed. <br>
- addClient(): Adds a new client to the queue of clients. <br>
- getIsStationOpen(): Returns the value of the isStationOpen property. <br>
- getClientQueue(): Returns the clientQueue property. <br>
- getStationNumber(): Returns the stationNumber property. <br>
- toString(): Overrides the toString() method to display the cashier station number, the number of clients in the queue and their names. <br>

