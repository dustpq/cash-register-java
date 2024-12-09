import java.util.ArrayList;

public class Item {

    private String type;
    private double price;
    private ArrayList<String> toppings;


    public Item(String type) {

        this.type = type;

        if (type.equals("Burger")) {
            this.price = 5.99;
        } else
        if (type.equals("Hot Dog")) {
            this.price = 3.99;
        }

    }

    public void addTopping (String topping) {

        toppings.add(topping);

        if (topping.equals("extraPatty")) {
            price += 1.99;
        }

        if (topping.equals("sausageUpgrade")) {
            price += 0.99;
        }

    }

    public void removeTopping (String topping) {

        toppings.remove(topping);

        if (topping.equals("extraPatty")) {
            price -= 1.99;
        }

        if (topping.equals("sausageUpgrade")) {
            price -= 0.99;
        }

    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

}
