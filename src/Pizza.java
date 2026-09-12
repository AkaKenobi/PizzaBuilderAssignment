import java.util.ArrayList;
import java.util.List;
public class Pizza{
    private String dough;
    private String sauce;
    private String cheese;
    private List<String> toppings=new ArrayList<>();

    public void setDough(String dough) {this.dough=dough;}
    public void setSauce(String sauce) {this.sauce=sauce;}
    public void setCheese(String cheese) {this.cheese=cheese;}
    public void addTopping(String topping) {this.toppings.add(topping);}

    @Override
    public String toString(){
        return "Pizza {" +
                "dough='"+ dough +'\''+
                ", sauce='"+ sauce +'\''+
                ", cheese='"+ cheese +'\''+
                ", toppings="+ toppings +
                '}';
    }

    public String getDough() {return dough;}
    public String getSauce() {return sauce;}
}