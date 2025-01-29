public class Item {

    private String id;
    private String name;
    private double price;

    public Item (String id) {

        this.id = id;
        name = itemTable.getItemName(id);
        price = itemTable.getItemPrice(id);

    }

}
