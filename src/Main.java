public class Main{
    public static void main(String[] args){
        // Assembling the margherita pizza
        PizzaBuilder margheritaBuilder = new MargheritaBuilder();
        Pizza margherita = margheritaBuilder
                .setDough("Thin Crust")
                .setSauce("Tomato Sauce")
                .setCheese("Mozzarella")
                .addTopping("Basil")
                .build();

        System.out.println("Order 1: " + margherita);

        // Assembling the spicy pizza
        PizzaBuilder spicyBuilder = new SpicyPizzaBuilder();
        Pizza spicyPizza = spicyBuilder
                .setDough("Thick Crust")
                .setSauce("Spicy Tomato Sauce")
                .setCheese("Provolone")
                .addTopping("Pepperoni")
                .addTopping("Jalapeno")
                .build();

        System.out.println("Order 2: " + spicyPizza);
    }
}