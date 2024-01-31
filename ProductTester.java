import java.util.Scanner;

public class ProductTester {
    //global variabel
    public static void main(String[] args) {
        // object
        Scanner in = new Scanner(System.in);
        // String -> int -> double
        //local variabel
        String name;
        int price;
        int stock;
        int number;
        System.out.print("Name: ");
        name = in.nextLine();
        System.out.print("Price: ");
        price = in.nextInt();
        System.out.print("Stock: ");
        stock = in.nextInt();
        System.out.print("Item Number: ");
        number = in.nextInt();
        in.nextLine();
        Product hp = new Product(name, price, stock, number);
        System.out.println(hp.toString());
    }
}
