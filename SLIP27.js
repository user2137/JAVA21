//Q.1

import java.util.Scanner;

class Person {
    String Personname, Aadharno, Panno;

    Person(String Personname, String Aadharno, String Panno) {
        this.Personname = Personname;
        this.Aadharno = Aadharno;
        this.Panno = Panno;
    }

    void display() {
        System.out.println("Name: " + Personname);
        System.out.println("Aadhar No: " + Aadharno);
        System.out.println("PAN No: " + Panno);
    }
}

public class SLIP27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] p = new Person[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter Person " + (i + 1) + " Details:");

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Aadhar No: ");
            String aadhar = sc.nextLine();

            System.out.print("Enter PAN No: ");
            String pan = sc.nextLine();

            p[i] = new Person(name, aadhar, pan);
        }

        System.out.println("\nPerson Details:");

        for (int i = 0; i < 5; i++) {
            p[i].display();
        }

        sc.close();
    }
}

//Q.2

const fs = require('fs');

fs.readFile('data.json', 'utf8', (err, data) => {
    if (err) {
        console.log("Error reading file");
        return;
    }

    let obj = JSON.parse(data);

    obj.name = "Om";
    obj.age = 20;

    fs.writeFile('data.json', JSON.stringify(obj, null, 2), (err) => {
        if (err) {
            console.log("Error writing file");
            return;
        }

        console.log("JSON file updated successfully");
        console.log(obj);
    });
});