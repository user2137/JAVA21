//Q.1

import java.util.Scanner;

interface Calculator {
    void add();
    void subtract();
}

class SimpleCalc implements Calculator {
    int a, b;

    SimpleCalc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void add() {
        System.out.println("Addition: " + (a + b));
    }

    public void subtract() {
        System.out.println("Subtraction: " + (a - b));
    }
}

public class SLIP25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        SimpleCalc c = new SimpleCalc(a, b);
        c.add();
        c.subtract();

        sc.close();
    }
}

//Q.2

const fs = require('fs');

fs.mkdirSync('test', { recursive: true });
console.log("Directory Created");

console.log("Directories:", fs.readdirSync('.'));

fs.renameSync('test', 'newtest');
console.log("Directory Renamed");

fs.writeFileSync('data.json', JSON.stringify({
    name: "MOHIT",
    age: 20,
    course: "BCS"
}, null, 2));

let data = JSON.parse(fs.readFileSync('data.json', 'utf8'));
console.log("JSON Data:", data);

fs.rmSync('newtest', { recursive: true });
console.log("Directory Deleted");