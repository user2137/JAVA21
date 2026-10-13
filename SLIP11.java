//Q.1

import java.util.Scanner;

class Vehicle {
    String company;
    double price;
}

class LightMotorVehicle extends Vehicle {
    int mileage;
}

class HeavyMotorVehicle extends Vehicle {
    int capacity_in_tons;
}

public class SLIP11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\n1. Light Motor Vehicle");
            System.out.println("2. Heavy Motor Vehicle");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                LightMotorVehicle v = new LightMotorVehicle();

                System.out.print("Enter company: ");
                v.company = sc.nextLine();

                System.out.print("Enter price: ");
                v.price = sc.nextDouble();

                System.out.print("Enter mileage: ");
                v.mileage = sc.nextInt();

                System.out.println("Company: " + v.company);
                System.out.println("Price: " + v.price);
                System.out.println("Mileage: " + v.mileage);
            } else if (ch == 2) {
                HeavyMotorVehicle v = new HeavyMotorVehicle();

                System.out.print("Enter company: ");
                v.company = sc.nextLine();

                System.out.print("Enter price: ");
                v.price = sc.nextDouble();

                System.out.print("Enter capacity in tons: ");
                v.capacity_in_tons = sc.nextInt();

                System.out.println("Company: " + v.company);
                System.out.println("Price: " + v.price);
                System.out.println("Capacity: " + v.capacity_in_tons + " tons");
            }
        }

        sc.close();
    }
}

//Q.2

<!DOCTYPE html>
<html>
<body style="background-color: lavender;">

<h3>Student Marks</h3>

<script>
let a = Number(prompt("Enter marks of Subject 1:"));
let b = Number(prompt("Enter marks of Subject 2:"));
let c = Number(prompt("Enter marks of Subject 3:"));

const result = (a, b, c) => {
    let total = a + b + c;
    let average = total / 3;

    document.write(`Total Marks: ${total}<br>`);
    document.write(`Average Marks: ${average}`);
};

result(a, b, c);
</script>

</body>
</html>