//Q.1

interface ProductInfo {
    void display();
}

class Product implements ProductInfo {
    int product_id, product_quantity;
    String product_name;
    double product_cost;
    static int count = 0;

    Product() {
        product_id = 0;
        product_name = "Unknown";
        product_cost = 0;
        product_quantity = 0;
        count++;
    }

    Product(int id, String name, double cost, int quantity) {
        product_id = id;
        product_name = name;
        product_cost = cost;
        product_quantity = quantity;
        count++;
    }

    public void display() {
        System.out.println("ID: " + product_id);
        System.out.println("Name: " + product_name);
        System.out.println("Cost: " + product_cost);
        System.out.println("Quantity: " + product_quantity);
    }
}

public class SLIP22 {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product(101, "Laptop", 45000, 2);
        Product p3 = new Product(102, "Mouse", 500, 5);

        p1.display();
        p2.display();
        p3.display();

        System.out.println("Total Objects: " + Product.count);
    }
}

//Q.2

interface ProductInfo {
    void display();
}

class Product implements ProductInfo {
    int product_id, product_quantity;
    String product_name;
    double product_cost;
    static int count = 0;

    Product() {
        product_id = 0;
        product_name = "Unknown";
        product_cost = 0;
        product_quantity = 0;
        count++;
    }

    Product(int id, String name, double cost, int quantity) {
        product_id = id;
        product_name = name;
        product_cost = cost;
        product_quantity = quantity;
        count++;
    }

    public void display() {
        System.out.println("ID: " + product_id);
        System.out.println("Name: " + product_name);
        System.out.println("Cost: " + product_cost);
        System.out.println("Quantity: " + product_quantity);
    }
}

public class SLIP22 {
    public static void main(String[] args) {
        Product p1 = new Product(101,"Keyboard",1500,5);
        Product p2 = new Product(102, "Laptop", 45000, 2);
        Product p3 = new Product(103,"Mouse", 500, 5);

        p1.display();
        p2.display();
        p3.display();

        System.out.println("Total Objects: " + Product.count);
    }
}

//Q.2

const fs = require('fs');

fs.writeFile('abc.txt', 'Hello Node.js', (err) => {
    if (err) throw err;
    console.log('File created');

    fs.readFile('abc.txt', 'utf8', (err, data) => {
        if (err) throw err;
        console.log('File Content:', data);

        fs.appendFile('abc.txt', '\nWelcome', (err) => {
            if (err) throw err;
            console.log('Data appended');

            fs.readFile('abc.txt', 'utf8', (err, data) => {
                if (err) throw err;
                console.log('Updated Content:', data);
            });
        });
    });
});