# Pizza Builder Pattern

## What the Product Is
This project implements the Builder creational design pattern for constructing a complex `Pizza` object. It solves the problem of overloaded constructors by allowing the step-by-step assembly of pizzas with varying ingredients (dough, sauce, cheese, toppings).

## How to Build Each Representation
The project includes an interface `PizzaBuilder` and two concrete implementations:
* **MargheritaBuilder:** Constructs a classic Margherita pizza (thin crust, tomato sauce, mozzarella, basil).
* **SpicyPizzaBuilder:** Constructs a spicy variant (thick crust, spicy tomato sauce, provolone, pepperoni, jalapenos).

To build a representation, instantiate the desired builder, chain the setter methods (e.g., `.setDough("...").setSauce("...")`), and call `.build()`. The `build()` method includes validation to ensure mandatory components are present.

## How to Run It
Execute the `Main.java` class. It acts as the Client, orchestrating the fluent API calls for both builders and printing the configured `Pizza` objects to the console.