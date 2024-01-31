public class Product {
    // Attribute
    private String name;
    private int price;
    private int stock;
    private int number;
    private boolean status;

    // Constructor default
    public Product() {
        name = "ASUS Vivobook";
        price = 10000000;
        stock = 100;
        number = 1;
        status = true;
    }

    // Constructor parameter
    public Product(String name, int price, int stock, int number) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.number = number;
        this.status = true;
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public int getNumber() {
        return number;
    }

    public boolean getStatus() {
        return status;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getInventoryValue() {
        return this.price * this.stock;
    }

    public String toString() {
        String st;
        if (status) {
            st = "Active";
        } else {
            st = "Discontinued";
        }
        return "Item Number : " + number +
                "\nName : " + name +
                "\nQuantity : " + stock +
                "\nPrice : " + price +
                "\nProduct Status : " + st +
                "\nStock Value : " + getInventoryValue();
    }
}