//Q.1

import java.util.Scanner;

abstract class Shape {
    abstract void area();
    abstract void volume();
}

class Cylinder extends Shape {
    double radius, height;

    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    void area() {
        System.out.println("Surface Area: " + (2 * Math.PI * radius * (radius + height)));
    }

    void volume() {
        System.out.println("Volume: " + (Math.PI * radius * radius * height));
    }
}

public class SLIP24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        Cylinder c = new Cylinder(r, h);
        c.area();
        c.volume();

        sc.close();
    }
}

//Q.2

const fs = require('fs');

console.log("Synchronous Operation");

fs.writeFileSync('abc.txt', 'Hello Node.js');
console.log("File Written");

let data = fs.readFileSync('abc.txt', 'utf8');
console.log("File Content:", data);

console.log("\nAsynchronous Operation");

fs.writeFile('abc.txt', 'Welcome Node.js', (err) => {
    if (err) throw err;
    console.log("File Written");

    fs.readFile('abc.txt', 'utf8', (err, data) => {
        if (err) throw err;
        console.log("File Content:", data);
    });
});

console.log("Program Ended");