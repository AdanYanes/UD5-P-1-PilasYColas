# Client

The Client class represents a client who is going to make a purchase in the store. It has a name and a basket of products that the client is going to buy. <br>

## Constructors

- Client(): Creates a new instance of Client with a random name and a random basket of products. <br>

## Fields

- String name: Stores the name of the client. <br>
- Stack<String> basket: Stores the products in the client's basket. <br>

## Methods

- String getName(): Returns the name of the client. <br>
- String toString(): Returns a String representation of the Client object, including the name of the client, the total number of products in their basket, and the list of articles in their basket. <br>

## Private Methods

- void generateRandomBasket(): Generates a random basket of products for the client.