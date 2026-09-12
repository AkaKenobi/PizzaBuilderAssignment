public class MargheritaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public MargheritaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public PizzaBuilder setDough(String dough) {
        pizza.setDough(dough);
        return this;
    }

    @Override
    public PizzaBuilder setSauce(String sauce) {
        pizza.setSauce(sauce);
        return this;
    }

    @Override
    public PizzaBuilder setCheese(String cheese) {
        pizza.setCheese(cheese);
        return this;
    }

    @Override
    public PizzaBuilder addTopping(String topping) {
        pizza.addTopping(topping);
        return this;
    }

    @Override
    public Pizza build() {
        if (pizza.getDough() == null || pizza.getSauce() == null) {
            throw new IllegalStateException("Cannot build pizza without dough and sauce!");
        }
        return pizza;
    }
}